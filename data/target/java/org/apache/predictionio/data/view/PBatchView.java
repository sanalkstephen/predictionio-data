package org.apache.predictionio.data.view;
public  class PBatchView {
  public  int appId () { throw new RuntimeException(); }
  public  scala.Option<org.joda.time.DateTime> startTime () { throw new RuntimeException(); }
  public  scala.Option<org.joda.time.DateTime> untilTime () { throw new RuntimeException(); }
  public  org.apache.spark.SparkContext sc () { throw new RuntimeException(); }
  // not preceding
  public   PBatchView (int appId, scala.Option<org.joda.time.DateTime> startTime, scala.Option<org.joda.time.DateTime> untilTime, org.apache.spark.SparkContext sc) { throw new RuntimeException(); }
  public  org.apache.predictionio.data.storage.PEvents eventsDb () { throw new RuntimeException(); }
  public  org.apache.spark.rdd.RDD<org.apache.predictionio.data.storage.Event> _events () { throw new RuntimeException(); }
  public  org.apache.spark.rdd.RDD<org.apache.predictionio.data.storage.Event> events () { throw new RuntimeException(); }
  public  org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.String, org.apache.predictionio.data.storage.DataMap>> aggregateProperties (java.lang.String entityType, scala.Option<org.joda.time.DateTime> startTimeOpt, scala.Option<org.joda.time.DateTime> untilTimeOpt) { throw new RuntimeException(); }
}
