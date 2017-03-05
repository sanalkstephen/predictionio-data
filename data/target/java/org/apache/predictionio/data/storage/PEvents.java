package org.apache.predictionio.data.storage;
/** :: DeveloperApi ::
 * Base trait of a data access object that returns {@link Event} related RDD data
 * structure. Engine developers should use
 * {@link org.apache.predictionio.data.store.PEventStore} instead of using this directly.
 * <p>
 * @group Event Data
 */
public  interface PEvents extends scala.Serializable {
  public  grizzled.slf4j.Logger logger () ;
  public  org.apache.spark.rdd.RDD<org.apache.predictionio.data.storage.Event> getByAppIdAndTimeAndEntity (int appId, scala.Option<org.joda.time.DateTime> startTime, scala.Option<org.joda.time.DateTime> untilTime, scala.Option<java.lang.String> entityType, scala.Option<java.lang.String> entityId, org.apache.spark.SparkContext sc) ;
  /** :: DeveloperApi ::
   * Read from database and return the events. The deprecation here is intended
   * to engine developers only.
   * <p>
   * @param appId return events of this app ID
   * @param channelId return events of this channel ID (default channel if it's None)
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
  public  org.apache.spark.rdd.RDD<org.apache.predictionio.data.storage.Event> find (int appId, scala.Option<java.lang.Object> channelId, scala.Option<org.joda.time.DateTime> startTime, scala.Option<org.joda.time.DateTime> untilTime, scala.Option<java.lang.String> entityType, scala.Option<java.lang.String> entityId, scala.Option<scala.collection.Seq<java.lang.String>> eventNames, scala.Option<scala.Option<java.lang.String>> targetEntityType, scala.Option<scala.Option<java.lang.String>> targetEntityId, org.apache.spark.SparkContext sc) ;
  /** Aggregate properties of entities based on these special events:
   * \$set, \$unset, \$delete events. The deprecation here is intended to
   * engine developers only.
   * <p>
   * @param appId use events of this app ID
   * @param channelId use events of this channel ID (default channel if it's None)
   * @param entityType aggregate properties of the entities of this entityType
   * @param startTime use events with eventTime >= startTime
   * @param untilTime use events with eventTime < untilTime
   * @param required only keep entities with these required properties defined
   * @param sc Spark context
   * @return RDD[(String, PropertyMap)] RDD of entityId and PropertyMap pair
   */
  public  org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.String, org.apache.predictionio.data.storage.PropertyMap>> aggregateProperties (int appId, scala.Option<java.lang.Object> channelId, java.lang.String entityType, scala.Option<org.joda.time.DateTime> startTime, scala.Option<org.joda.time.DateTime> untilTime, scala.Option<scala.collection.Seq<java.lang.String>> required, org.apache.spark.SparkContext sc) ;
  /** :: Experimental ::
   * Extract EntityMap[A] from events for the entityType
   * NOTE: it is local EntityMap[A]
   */
  public <A extends java.lang.Object> org.apache.predictionio.data.storage.EntityMap<A> extractEntityMap (int appId, java.lang.String entityType, scala.Option<org.joda.time.DateTime> startTime, scala.Option<org.joda.time.DateTime> untilTime, scala.Option<scala.collection.Seq<java.lang.String>> required, org.apache.spark.SparkContext sc, scala.Function1<org.apache.predictionio.data.storage.DataMap, A> extract, scala.reflect.ClassTag<A> evidence$1) ;
  /** :: DeveloperApi ::
   * Write events to database
   * <p>
   * @param events RDD of Event
   * @param appId the app ID
   * @param sc Spark Context
   */
  public  void write (org.apache.spark.rdd.RDD<org.apache.predictionio.data.storage.Event> events, int appId, org.apache.spark.SparkContext sc) ;
  /** :: DeveloperApi ::
   * Write events to database
   * <p>
   * @param events RDD of Event
   * @param appId the app ID
   * @param channelId  channel ID (default channel if it's None)
   * @param sc Spark Context
   */
  public  void write (org.apache.spark.rdd.RDD<org.apache.predictionio.data.storage.Event> events, int appId, scala.Option<java.lang.Object> channelId, org.apache.spark.SparkContext sc) ;
  public  void delete (org.apache.spark.rdd.RDD<java.lang.String> eventIds, int appId, scala.Option<java.lang.Object> channelId, org.apache.spark.SparkContext sc) ;
}
