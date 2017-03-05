/*
 * Created by sanal_s on 1/24/2017.
 */


package org.apache.predictionio.data.storage.cassandra

import java.util.UUID
import com.datastax.driver.core.utils.UUIDs

object CassandraEventUtil {
  def eventTableName(namespace: String, appId: Int, channelId: Option[Int]): String =
    s"${namespace}_${appId}${channelId.map("_" + _).getOrElse("")}"

  def generateId: UUID =   UUIDs.random()

}
