package org.apache.predictionio.data.storage.hbase;
public  class HBPEvents implements org.apache.predictionio.data.storage.PEvents {
  public   HBPEvents (org.apache.predictionio.data.storage.hbase.HBClient client, org.apache.predictionio.data.storage.StorageClientConfig config, java.lang.String namespace) { throw new RuntimeException(); }
  public  void checkTableExists (int appId, scala.Option<java.lang.Object> channelId) { throw new RuntimeException(); }
  public  org.apache.spark.rdd.RDD<org.apache.predictionio.data.storage.Event> find (int appId, scala.Option<java.lang.Object> channelId, scala.Option<org.joda.time.DateTime> startTime, scala.Option<org.joda.time.DateTime> untilTime, scala.Option<java.lang.String> entityType, scala.Option<java.lang.String> entityId, scala.Option<scala.collection.Seq<java.lang.String>> eventNames, scala.Option<scala.Option<java.lang.String>> targetEntityType, scala.Option<scala.Option<java.lang.String>> targetEntityId, org.apache.spark.SparkContext sc) { throw new RuntimeException(); }
  public  void write (org.apache.spark.rdd.RDD<org.apache.predictionio.data.storage.Event> events, int appId, scala.Option<java.lang.Object> channelId, org.apache.spark.SparkContext sc) { throw new RuntimeException(); }
  public  void delete (org.apache.spark.rdd.RDD<java.lang.String> eventIds, int appId, scala.Option<java.lang.Object> channelId, org.apache.spark.SparkContext sc) { throw new RuntimeException(); }
}
