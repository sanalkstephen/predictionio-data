package org.apache.predictionio.data.store.java;
// no position
/** This Java-friendly object provides a set of operation to access Event Store
 * without going through Spark's parallelization
 */
public  class LJavaEventStore$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final LJavaEventStore$ MODULE$ = null;
  public   LJavaEventStore$ () { throw new RuntimeException(); }
  /** Reads events of the specified entity. May use this in Algorithm's predict()
   * or Serving logic to have fast event store access.
   * <p>
   * @param appName return events of this app
   * @param entityType return events of this entityType
   * @param entityId return events of this entityId
   * @param channelName return events of this channel (default channel if it's None)
   * @param eventNames return events with any of these event names.
   * @param targetEntityType return events of this targetEntityType:
   *   - None means no restriction on targetEntityType
   *   - Some(None) means no targetEntityType for this event
   *   - Some(Some(x)) means targetEntityType should match x.
   * @param targetEntityId return events of this targetEntityId
   *   - None means no restriction on targetEntityId
   *   - Some(None) means no targetEntityId for this event
   *   - Some(Some(x)) means targetEntityId should match x.
   * @param startTime return events with eventTime >= startTime
   * @param untilTime return events with eventTime < untilTime
   * @param limit Limit number of events. Get all events if None or Some(-1)
   * @param latest Return latest event first
   * @return java.util.List[Event]
   */
  public  java.util.List<org.apache.predictionio.data.storage.Event> findByEntity (java.lang.String appName, java.lang.String entityType, java.lang.String entityId, scala.Option<java.lang.String> channelName, scala.Option<java.util.List<java.lang.String>> eventNames, scala.Option<scala.Option<java.lang.String>> targetEntityType, scala.Option<scala.Option<java.lang.String>> targetEntityId, scala.Option<org.joda.time.DateTime> startTime, scala.Option<org.joda.time.DateTime> untilTime, scala.Option<java.lang.Integer> limit, boolean latest, scala.concurrent.duration.Duration timeout) { throw new RuntimeException(); }
  /** Reads events generically. If entityType or entityId is not specified, it
   * results in table scan.
   * <p>
   * @param appName return events of this app
   * @param entityType return events of this entityType
   *   - None means no restriction on entityType
   *   - Some(x) means entityType should match x.
   * @param entityId return events of this entityId
   *   - None means no restriction on entityId
   *   - Some(x) means entityId should match x.
   * @param channelName return events of this channel (default channel if it's None)
   * @param eventNames return events with any of these event names.
   * @param targetEntityType return events of this targetEntityType:
   *   - None means no restriction on targetEntityType
   *   - Some(None) means no targetEntityType for this event
   *   - Some(Some(x)) means targetEntityType should match x.
   * @param targetEntityId return events of this targetEntityId
   *   - None means no restriction on targetEntityId
   *   - Some(None) means no targetEntityId for this event
   *   - Some(Some(x)) means targetEntityId should match x.
   * @param startTime return events with eventTime >= startTime
   * @param untilTime return events with eventTime < untilTime
   * @param limit Limit number of events. Get all events if None or Some(-1)
   * @return java.util.List[Event]
   */
  public  java.util.List<org.apache.predictionio.data.storage.Event> find (java.lang.String appName, scala.Option<java.lang.String> entityType, scala.Option<java.lang.String> entityId, scala.Option<java.lang.String> channelName, scala.Option<java.util.List<java.lang.String>> eventNames, scala.Option<scala.Option<java.lang.String>> targetEntityType, scala.Option<scala.Option<java.lang.String>> targetEntityId, scala.Option<org.joda.time.DateTime> startTime, scala.Option<org.joda.time.DateTime> untilTime, scala.Option<java.lang.Integer> limit, scala.concurrent.duration.Duration timeout) { throw new RuntimeException(); }
}
