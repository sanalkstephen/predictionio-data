package org.apache.predictionio.data.store;
// no position
/** This object provides a set of operation to access Event Store
 * with Spark's parallelization
 */
public  class PEventStore {
  static private  org.apache.predictionio.data.storage.PEvents eventsDb () { throw new RuntimeException(); }
  /** Read events from Event Store
   * <p>
   * @param appName return events of this app
   * @param channelName return events of this channel (default channel if it's None)
   * @param startTime return events with eventTime >= startTime
   * @param untilTime return events with eventTime < untilTime
   * @param entityType return events of this entityType
   * @param entityId return events of this entityId
   * @param eventNames return events with any of these event names.
   * @param targetEntityType return events of this targetEntityType:
   *   - None means no restriction on targetEntityType
   *   - Some(None) means no targetEntityType for this event
   *   - Some(Some(x)) means targetEntityType should match x.
   * @param targetEntityId return events of this targetEntityId
   *   - None means no restriction on targetEntityId
   *   - Some(None) means no targetEntityId for this event
   *   - Some(Some(x)) means targetEntityId should match x.
   * @param sc Spark context
   * @return RDD[Event]
   */
  static public  org.apache.spark.rdd.RDD<org.apache.predictionio.data.storage.Event> find (java.lang.String appName, scala.Option<java.lang.String> channelName, scala.Option<org.joda.time.DateTime> startTime, scala.Option<org.joda.time.DateTime> untilTime, scala.Option<java.lang.String> entityType, scala.Option<java.lang.String> entityId, scala.Option<scala.collection.Seq<java.lang.String>> eventNames, scala.Option<scala.Option<java.lang.String>> targetEntityType, scala.Option<scala.Option<java.lang.String>> targetEntityId, org.apache.spark.SparkContext sc) { throw new RuntimeException(); }
  /** Aggregate properties of entities based on these special events:
   * \$set, \$unset, \$delete events.
   * <p>
   * @param appName use events of this app
   * @param entityType aggregate properties of the entities of this entityType
   * @param channelName use events of this channel (default channel if it's None)
   * @param startTime use events with eventTime >= startTime
   * @param untilTime use events with eventTime < untilTime
   * @param required only keep entities with these required properties defined
   * @param sc Spark context
   * @return RDD[(String, PropertyMap)] RDD of entityId and PropetyMap pair
   */
  static public  org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.String, org.apache.predictionio.data.storage.PropertyMap>> aggregateProperties (java.lang.String appName, java.lang.String entityType, scala.Option<java.lang.String> channelName, scala.Option<org.joda.time.DateTime> startTime, scala.Option<org.joda.time.DateTime> untilTime, scala.Option<scala.collection.Seq<java.lang.String>> required, org.apache.spark.SparkContext sc) { throw new RuntimeException(); }
}
