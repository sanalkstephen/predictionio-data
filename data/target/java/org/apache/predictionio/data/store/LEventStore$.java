package org.apache.predictionio.data.store;
// no position
/** This object provides a set of operation to access Event Store
 * without going through Spark's parallelization
 */
public  class LEventStore$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final LEventStore$ MODULE$ = null;
  public   LEventStore$ () { throw new RuntimeException(); }
  private  scala.concurrent.duration.FiniteDuration defaultTimeout () { throw new RuntimeException(); }
  private  org.apache.predictionio.data.storage.LEvents eventsDb () { throw new RuntimeException(); }
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
   * @param latest Return latest event first (default true)
   * @return Iterator[Event]
   */
  public  scala.collection.Iterator<org.apache.predictionio.data.storage.Event> findByEntity (java.lang.String appName, java.lang.String entityType, java.lang.String entityId, scala.Option<java.lang.String> channelName, scala.Option<scala.collection.Seq<java.lang.String>> eventNames, scala.Option<scala.Option<java.lang.String>> targetEntityType, scala.Option<scala.Option<java.lang.String>> targetEntityId, scala.Option<org.joda.time.DateTime> startTime, scala.Option<org.joda.time.DateTime> untilTime, scala.Option<java.lang.Object> limit, boolean latest, scala.concurrent.duration.Duration timeout) { throw new RuntimeException(); }
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
   * @return Iterator[Event]
   */
  public  scala.collection.Iterator<org.apache.predictionio.data.storage.Event> find (java.lang.String appName, scala.Option<java.lang.String> entityType, scala.Option<java.lang.String> entityId, scala.Option<java.lang.String> channelName, scala.Option<scala.collection.Seq<java.lang.String>> eventNames, scala.Option<scala.Option<java.lang.String>> targetEntityType, scala.Option<scala.Option<java.lang.String>> targetEntityId, scala.Option<org.joda.time.DateTime> startTime, scala.Option<org.joda.time.DateTime> untilTime, scala.Option<java.lang.Object> limit, scala.concurrent.duration.Duration timeout) { throw new RuntimeException(); }
}
