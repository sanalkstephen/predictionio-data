/*
 * Created by sanal_s on 1/24/2017.
 */

package org.apache.predictionio.data.storage.cassandra

import grizzled.slf4j.Logging
import com.datastax.driver.core.Row
import org.apache.predictionio.data.storage._
import org.joda.time.{DateTime, DateTimeZone}
import org.json4s.JObject
import org.json4s.native.Serialization.{read, write}

import scala.concurrent.{ExecutionContext, Future}
import scala.collection.JavaConversions._

class CassandraLEvents (val client: CassandraClient, config: StorageClientConfig,
                        val namespace: String)
  extends LEvents with Logging {
  implicit private val formats = org.json4s.DefaultFormats
  override
  def init(appId: Int, channelId: Option[Int] = None): Boolean = {
    // check namespace exist
    val ks = client.cluster.getMetadata().getKeyspace(namespace);
    if(ks == null) {
      info(s"The namespace ${namespace} doesn't exist yet. Creating now...")
      val query = "CREATE KEYSPACE " + namespace + " WITH replication " +
        "= {'class':'SimpleStrategy', 'replication_factor':1};";
      client.session.execute(query);
      client.session.execute("USE " + namespace);
    }
    val ksCreated = client.cluster.getMetadata().getKeyspace(namespace);
    val tableName = CassandraEventUtil.eventTableName(namespace, appId, channelId);
    info(s"Check for the table ${tableName}")
    val table = ksCreated.getTable(tableName);
    if (table == null) {
      info(s"The table ${tableName} doesn't exist yet." +
        " Creating now...")
      val createTableCql =
        s"create table ${namespace}.${tableName} (" +
        "id UUID PRIMARY KEY," +
        "event text," +
        "entityType text," +
        "entityId text," +
        "targetEntityType text," +
        "targetEntityId text," +
        "properties text," +
        "eventTime timestamp," +
        "eventTimeZone text," +
        "tags text," +
        "prId text," +
        "creationTime timestamp," +
        "creationTimeZone text);"
      client.session.execute(createTableCql)
    }
    true
  }

  override
  def futureInsert(
                    event: Event, appId: Int, channelId: Option[Int])
                  (implicit ec: ExecutionContext): Future[String] = Future {
    val tableName = CassandraEventUtil.eventTableName(namespace, appId, channelId);
    val id = CassandraEventUtil.generateId
    val query = "INSERT INTO " + namespace + "." + tableName +
      "(\"id\", \"event\", \"entitytype\", \"entityid\", " +
      "\"targetentitytype\", \"targetentityid\", \"properties\"," +
      " \"eventtime\", \"eventtimezone\", \"tags\", " +
      "\"prid\", \"creationtime\", \"creationtimezone\")" +
      "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)"
    info(s"Query ${query}")
    client.session.execute(
      query,
      id,
      event.event, event.entityType, event.entityId,
      event.targetEntityType.getOrElse(""), event.targetEntityId.getOrElse(""),
      write(event.properties.toJObject), event.eventTime.toDate,
      event.eventTime.getZone.getID,
      if (event.tags.nonEmpty) Some(event.tags.mkString(",")) else "",
      event.prId.getOrElse(""), event.creationTime.toDate, event.creationTime.getZone.getID)
     id.toString
  }

  def resultToEvent(row: Row , appId: Int): Event = {
    def getOptStringCol(value : String): Option[String] = {
      Some(value)
    }
    val eventId = row.getString("eventId")
    val eventTimeZone = getOptStringCol("eventTimeZone")
      .map(DateTimeZone.forID(_))
      .getOrElse(EventValidation.defaultTimeZone)

    val eventTime = new DateTime(
      row.getLong("eventTime"), eventTimeZone)
    val creationTimeZone = getOptStringCol("creationTimeZone")
      .map(DateTimeZone.forID(_))
      .getOrElse(EventValidation.defaultTimeZone)
    val creationTime: DateTime = new DateTime(
      row.getLong("creationTime"), creationTimeZone)
    Event(
      eventId = Some(eventId),
      event = row.getString("event"),
      entityType = row.getString("entityType"),
      entityId = row.getString("entityId"),
      targetEntityType = Some(row.getString("targetEntityType")),
      targetEntityId = Some(row.getString("targetEntityId")),
      properties = Some(row.getString("properties"))
        .map(s => DataMap(read[JObject](s))).getOrElse(DataMap()),
      eventTime = eventTime,
      tags = Seq(),
      prId = getOptStringCol(row.getString("prId")),
      creationTime = creationTime
    )
  }

  override
  def remove(appId: Int, channelId: Option[Int] = None): Boolean = {
    val tableName = CassandraEventUtil.eventTableName(namespace, appId, channelId)
    val ks = client.cluster.getMetadata.getKeyspace(namespace)
    val table = ks.getTable(tableName);
    try {
      if (table != null) {
        info(s"Removing table ${tableName}...")
        // Write remove table code here
      } else {
        info(s"Table ${tableName}} doesn't exist." +
          s" Nothing is deleted.")
      }
      true
    } catch {
      case e: Exception => {
        error(s"Fail to remove table for appId ${appId}. Exception: ${e}")
        false
      }
    }
  }

  override
  def futureDelete(
                    eventId: String, appId: Int, channelId: Option[Int])
                  (implicit ec: ExecutionContext):
  Future[Boolean] = {
    Future {
      val tableName = CassandraEventUtil.eventTableName(namespace, appId, channelId)
      val ks = client.cluster.getMetadata.getKeyspace(namespace)
      val table = ks.getTable(tableName);
      try {
        if (table != null) {
          // Write code to delete row
        } else {
          info(s"Table ${tableName}} doesn't exist." +
            s" Nothing is deleted.")
        }
        true
      }
      catch {
        case e: Exception => {
          error(s"Fail to delete row for event ${eventId}. Exception: ${e}")
          false
        }
      }
      true
    }
  }

  override
  def close(): Unit = {
    client.session.close()
  }

  override
  def futureGet(
                 eventId: String, appId: Int, channelId: Option[Int])
               (implicit ec: ExecutionContext):
  Future[Option[Event]] = {
    Future {
      val resultSet = client.session.execute("") // TODO
      val row = resultSet.one
      if (row != null) {
        val event = resultToEvent(row, appId)
        Some(event)
      } else {
        None
      }
    }
  }

  // TODO
  override
  def futureFind(
                  appId: Int,
                  channelId: Option[Int] = None,
                  startTime: Option[DateTime] = None,
                  untilTime: Option[DateTime] = None,
                  entityType: Option[String] = None,
                  entityId: Option[String] = None,
                  eventNames: Option[Seq[String]] = None,
                  targetEntityType: Option[Option[String]] = None,
                  targetEntityId: Option[Option[String]] = None,
                  limit: Option[Int] = None,
                  reversed: Option[Boolean] = None)(implicit ec: ExecutionContext):
  Future[Iterator[Event]] = {
    Future {
      require(!((reversed == Some(true)) && (entityType.isEmpty || entityId.isEmpty)),
        "the parameter reversed can only be used with both entityType and entityId specified.")
      val resultSet = client.session.execute("") // TODO
      val resultsIter = resultSet.iterator()

      // Get all events if None or Some(-1)
      val results: Iterator[Row] = limit match {
        case Some(-1) => resultsIter
        case None => resultsIter
        case Some(x) => resultsIter.take(x)
      }

      val eventsIt = results.map{ resultToEvent(_, appId) }
      eventsIt
    }
  }
}

