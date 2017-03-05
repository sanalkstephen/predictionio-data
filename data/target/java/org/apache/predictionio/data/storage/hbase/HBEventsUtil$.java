package org.apache.predictionio.data.storage.hbase;
// no position
public  class HBEventsUtil$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final HBEventsUtil$ MODULE$ = null;
  public   HBEventsUtil$ () { throw new RuntimeException(); }
  public  org.json4s.DefaultFormats$ formats () { throw new RuntimeException(); }
  public  java.lang.String tableName (java.lang.String namespace, int appId, scala.Option<java.lang.Object> channelId) { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, byte[]> colNames () { throw new RuntimeException(); }
  public  byte[] hash (java.lang.String entityType, java.lang.String entityId) { throw new RuntimeException(); }
  public  scala.Tuple2<org.apache.hadoop.hbase.client.Put, org.apache.predictionio.data.storage.hbase.HBEventsUtil.RowKey> eventToPut (org.apache.predictionio.data.storage.Event event, int appId) { throw new RuntimeException(); }
  public  org.apache.predictionio.data.storage.Event resultToEvent (org.apache.hadoop.hbase.client.Result result, int appId) { throw new RuntimeException(); }
  public  org.apache.hadoop.hbase.client.Scan createScan (scala.Option<org.joda.time.DateTime> startTime, scala.Option<org.joda.time.DateTime> untilTime, scala.Option<java.lang.String> entityType, scala.Option<java.lang.String> entityId, scala.Option<scala.collection.Seq<java.lang.String>> eventNames, scala.Option<scala.Option<java.lang.String>> targetEntityType, scala.Option<scala.Option<java.lang.String>> targetEntityId, scala.Option<java.lang.Object> reversed) { throw new RuntimeException(); }
}
