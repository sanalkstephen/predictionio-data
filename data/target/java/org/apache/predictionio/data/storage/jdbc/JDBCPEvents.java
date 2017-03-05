package org.apache.predictionio.data.storage.jdbc;
/** JDBC implementation of {@link PEvents} */
public  class JDBCPEvents implements org.apache.predictionio.data.storage.PEvents {
  public   JDBCPEvents (java.lang.String client, org.apache.predictionio.data.storage.StorageClientConfig config, java.lang.String namespace) { throw new RuntimeException(); }
  private  org.json4s.DefaultFormats$ formats () { throw new RuntimeException(); }
  public  org.apache.spark.rdd.RDD<org.apache.predictionio.data.storage.Event> find (int appId, scala.Option<java.lang.Object> channelId, scala.Option<org.joda.time.DateTime> startTime, scala.Option<org.joda.time.DateTime> untilTime, scala.Option<java.lang.String> entityType, scala.Option<java.lang.String> entityId, scala.Option<scala.collection.Seq<java.lang.String>> eventNames, scala.Option<scala.Option<java.lang.String>> targetEntityType, scala.Option<scala.Option<java.lang.String>> targetEntityId, org.apache.spark.SparkContext sc) { throw new RuntimeException(); }
  /** Change the default upper bound from +100 to +1 year because MySQL's
   * FROM_UNIXTIME(t) will return NULL if we use +100 years.
   */
  public  void write (org.apache.spark.rdd.RDD<org.apache.predictionio.data.storage.Event> events, int appId, scala.Option<java.lang.Object> channelId, org.apache.spark.SparkContext sc) { throw new RuntimeException(); }
  public  void delete (org.apache.spark.rdd.RDD<java.lang.String> eventIds, int appId, scala.Option<java.lang.Object> channelId, org.apache.spark.SparkContext sc) { throw new RuntimeException(); }
}
