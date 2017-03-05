package org.apache.predictionio.data.storage;
// no position
public  class PEventAggregator$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final PEventAggregator$ MODULE$ = null;
  public   PEventAggregator$ () { throw new RuntimeException(); }
  public  scala.collection.immutable.List<java.lang.String> eventNames () { throw new RuntimeException(); }
  public  org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.String, org.apache.predictionio.data.storage.PropertyMap>> aggregateProperties (org.apache.spark.rdd.RDD<org.apache.predictionio.data.storage.Event> eventsRDD) { throw new RuntimeException(); }
}
