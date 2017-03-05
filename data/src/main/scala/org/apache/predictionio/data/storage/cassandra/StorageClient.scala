/*
 * Created by sanal_s on 1/24/2017.
 */

package org.apache.predictionio.data.storage.cassandra

import grizzled.slf4j.Logging
import com.datastax.driver.core.Cluster
import com.datastax.driver.core.Session
import org.apache.predictionio.data.storage.{BaseStorageClient, StorageClientConfig, StorageClientException}

case class CassandraClient (
                     cluster : Cluster,
                     session: Session
                   )

class StorageClient (val config: StorageClientConfig)
  extends BaseStorageClient with Logging{

  if (!config.properties.contains("IP")) {
    throw new StorageClientException("The IP variable is not set!", null)
  }
  if (!config.properties.contains("PORT")) {
    throw new StorageClientException("The PORT variable is not set!", null)
  }
  val cluster = try {
    val port = config.properties("PORT").toInt
    Cluster.builder().addContactPoint(config.properties("IP"))
      .withPort(port).build();
  }
  catch {
    case e: Exception => {
      error("Failed to connect to Cassandra. 1" +
        " Please check if Cassandra is running properly.", e)
      throw e
    }
  }
  val metadata = try {
    cluster.getMetadata();
  }
  catch {
    case e: Exception => {
      error(s"Failed to connect to Cassandra. 2" +
        s" Please check if Cassandra is running properly. " +
        s" Exception message : ${e.getMessage()}", e)
      throw e
    }
  }
  val session = try {
    cluster.connect();
  }
  catch {
    case e: Exception => {
      error("Failed to connect to Cassandra. 3" +
        " Please check if Cassandra is running properly.", e)
      throw e
    }
  }

  val client = CassandraClient (
    cluster = cluster,
    session = session
  )

  override
  val prefix = "Cassandra"
}

