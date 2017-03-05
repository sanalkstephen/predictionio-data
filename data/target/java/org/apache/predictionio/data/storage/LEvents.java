package org.apache.predictionio.data.storage;
/** :: DeveloperApi ::
 * Base trait of a data access object that directly returns {@link Event} without
 * going through Spark's parallelization. Engine developers should use
 * {@link org.apache.predictionio.data.store.LEventStore} instead of using this directly.
 * <p>
 * @group Event Data
 */
public  interface LEvents {
  /** Default timeout for asynchronous operations that is set to 1 minute */
  public  scala.concurrent.duration.FiniteDuration defaultTimeout () ;
  /** :: DeveloperApi ::
   * Initialize Event Store for an app ID and optionally a channel ID.
   * This routine is to be called when an app is first created.
   * <p>
   * @param appId App ID
   * @param channelId Optional channel ID
   * @return true if initialization was successful; false otherwise.
   */
  public  boolean init (int appId, scala.Option<java.lang.Object> channelId) ;
  /** :: DeveloperApi ::
   * Remove Event Store for an app ID and optional channel ID.
   * <p>
   * @param appId App ID
   * @param channelId Optional channel ID
   * @return true if removal was successful; false otherwise.
   */
  public  boolean remove (int appId, scala.Option<java.lang.Object> channelId) ;
  /** :: DeveloperApi ::
   * Close this Event Store interface object, e.g. close connection, release
   * resources, etc.
   */
  public  void close () ;
  /** :: DeveloperApi ::
   * Insert an {@link Event} in a non-blocking fashion.
   * <p>
   * @param event An {@link Event} to be inserted
   * @param appId App ID for the {@link Event} to be inserted to
   */
  public  scala.concurrent.Future<java.lang.String> futureInsert (org.apache.predictionio.data.storage.Event event, int appId, scala.concurrent.ExecutionContext ec) ;
  /** :: DeveloperApi ::
   * Insert an {@link Event} in a non-blocking fashion.
   * <p>
   * @param event An {@link Event} to be inserted
   * @param appId App ID for the {@link Event} to be inserted to
   * @param channelId Optional channel ID for the {@link Event} to be inserted to
   */
  public  scala.concurrent.Future<java.lang.String> futureInsert (org.apache.predictionio.data.storage.Event event, int appId, scala.Option<java.lang.Object> channelId, scala.concurrent.ExecutionContext ec) ;
  /** :: DeveloperApi ::
   * Get an {@link Event} in a non-blocking fashion.
   * <p>
   * @param eventId ID of the {@link Event}
   * @param appId ID of the app that contains the {@link Event}
   */
  public  scala.concurrent.Future<scala.Option<org.apache.predictionio.data.storage.Event>> futureGet (java.lang.String eventId, int appId, scala.concurrent.ExecutionContext ec) ;
  /** :: DeveloperApi ::
   * Get an {@link Event} in a non-blocking fashion.
   * <p>
   * @param eventId ID of the {@link Event}
   * @param appId ID of the app that contains the {@link Event}
   * @param channelId Optional channel ID that contains the {@link Event}
   */
  public  scala.concurrent.Future<scala.Option<org.apache.predictionio.data.storage.Event>> futureGet (java.lang.String eventId, int appId, scala.Option<java.lang.Object> channelId, scala.concurrent.ExecutionContext ec) ;
  /** :: DeveloperApi ::
   * Delete an {@link Event} in a non-blocking fashion.
   * <p>
   * @param eventId ID of the {@link Event}
   * @param appId ID of the app that contains the {@link Event}
   */
  public  scala.concurrent.Future<java.lang.Object> futureDelete (java.lang.String eventId, int appId, scala.concurrent.ExecutionContext ec) ;
  /** :: DeveloperApi ::
   * Delete an {@link Event} in a non-blocking fashion.
   * <p>
   * @param eventId ID of the {@link Event}
   * @param appId ID of the app that contains the {@link Event}
   * @param channelId Optional channel ID that contains the {@link Event}
   */
  public  scala.concurrent.Future<java.lang.Object> futureDelete (java.lang.String eventId, int appId, scala.Option<java.lang.Object> channelId, scala.concurrent.ExecutionContext ec) ;
  /** :: DeveloperApi ::
   * Reads from database and returns a Future of Iterator of {@link Event}s.
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
   * @param limit Limit number of events. Get all events if None or Some(-1)
   * @param reversed Reverse the order.
   *   - return oldest events first if None or Some(false) (default)
   *   - return latest events first if Some(true)
   * @param ec ExecutionContext
   * @return Future[Iterator[Event}
   */
  public  scala.concurrent.Future<scala.collection.Iterator<org.apache.predictionio.data.storage.Event>> futureFind (int appId, scala.Option<java.lang.Object> channelId, scala.Option<org.joda.time.DateTime> startTime, scala.Option<org.joda.time.DateTime> untilTime, scala.Option<java.lang.String> entityType, scala.Option<java.lang.String> entityId, scala.Option<scala.collection.Seq<java.lang.String>> eventNames, scala.Option<scala.Option<java.lang.String>> targetEntityType, scala.Option<scala.Option<java.lang.String>> targetEntityId, scala.Option<java.lang.Object> limit, scala.Option<java.lang.Object> reversed, scala.concurrent.ExecutionContext ec) ;
  /** Aggregate properties of entities based on these special events:
   * \$set, \$unset, \$delete events.
   * and returns a Future of Map of entityId to properties.
   * <p>
   * @param appId use events of this app ID
   * @param channelId use events of this channel ID (default channel if it's None)
   * @param entityType aggregate properties of the entities of this entityType
   * @param startTime use events with eventTime >= startTime
   * @param untilTime use events with eventTime < untilTime
   * @param required only keep entities with these required properties defined
   * @param ec ExecutionContext
   * @return Future[Map[String, PropertyMap}
   */
  public  scala.concurrent.Future<scala.collection.immutable.Map<java.lang.String, org.apache.predictionio.data.storage.PropertyMap>> futureAggregateProperties (int appId, scala.Option<java.lang.Object> channelId, java.lang.String entityType, scala.Option<org.joda.time.DateTime> startTime, scala.Option<org.joda.time.DateTime> untilTime, scala.Option<scala.collection.Seq<java.lang.String>> required, scala.concurrent.ExecutionContext ec) ;
  /**
   * :: Experimental ::
   * <p>
   * Aggregate properties of the specified entity (entityType + entityId)
   * based on these special events:
   * \$set, \$unset, \$delete events.
   * and returns a Future of Option[PropertyMap]
   * <p>
   * @param appId use events of this app ID
   * @param channelId use events of this channel ID (default channel if it's None)
   * @param entityType the entityType
   * @param entityId the entityId
   * @param startTime use events with eventTime >= startTime
   * @param untilTime use events with eventTime < untilTime
   * @param ec ExecutionContext
   * @return Future[Option[PropertyMap}
   */
  public  scala.concurrent.Future<scala.Option<org.apache.predictionio.data.storage.PropertyMap>> futureAggregatePropertiesOfEntity (int appId, scala.Option<java.lang.Object> channelId, java.lang.String entityType, java.lang.String entityId, scala.Option<org.joda.time.DateTime> startTime, scala.Option<org.joda.time.DateTime> untilTime, scala.concurrent.ExecutionContext ec) ;
  public  java.lang.String insert (org.apache.predictionio.data.storage.Event event, int appId, scala.Option<java.lang.Object> channelId, scala.concurrent.duration.Duration timeout, scala.concurrent.ExecutionContext ec) ;
  public  scala.Option<org.apache.predictionio.data.storage.Event> get (java.lang.String eventId, int appId, scala.Option<java.lang.Object> channelId, scala.concurrent.duration.Duration timeout, scala.concurrent.ExecutionContext ec) ;
  public  boolean delete (java.lang.String eventId, int appId, scala.Option<java.lang.Object> channelId, scala.concurrent.duration.Duration timeout, scala.concurrent.ExecutionContext ec) ;
  /** reads from database and returns events iterator.
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
   * @param limit Limit number of events. Get all events if None or Some(-1)
   * @param reversed Reverse the order (should be used with both
   *   targetEntityType and targetEntityId specified)
   *   - return oldest events first if None or Some(false) (default)
   *   - return latest events first if Some(true)
   * @param ec ExecutionContext
   * @return Iterator[Event]
   */
  public  scala.collection.Iterator<org.apache.predictionio.data.storage.Event> find (int appId, scala.Option<java.lang.Object> channelId, scala.Option<org.joda.time.DateTime> startTime, scala.Option<org.joda.time.DateTime> untilTime, scala.Option<java.lang.String> entityType, scala.Option<java.lang.String> entityId, scala.Option<scala.collection.Seq<java.lang.String>> eventNames, scala.Option<scala.Option<java.lang.String>> targetEntityType, scala.Option<scala.Option<java.lang.String>> targetEntityId, scala.Option<java.lang.Object> limit, scala.Option<java.lang.Object> reversed, scala.concurrent.duration.Duration timeout, scala.concurrent.ExecutionContext ec) ;
  public  scala.util.Either<org.apache.predictionio.data.storage.StorageError, scala.collection.Iterator<org.apache.predictionio.data.storage.Event>> findLegacy (int appId, scala.Option<java.lang.Object> channelId, scala.Option<org.joda.time.DateTime> startTime, scala.Option<org.joda.time.DateTime> untilTime, scala.Option<java.lang.String> entityType, scala.Option<java.lang.String> entityId, scala.Option<scala.collection.Seq<java.lang.String>> eventNames, scala.Option<scala.Option<java.lang.String>> targetEntityType, scala.Option<scala.Option<java.lang.String>> targetEntityId, scala.Option<java.lang.Object> limit, scala.Option<java.lang.Object> reversed, scala.concurrent.duration.Duration timeout, scala.concurrent.ExecutionContext ec) ;
  /** reads events of the specified entity.
   * <p>
   * @param appId return events of this app ID
   * @param channelId return events of this channel ID (default channel if it's None)
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
   * @param startTime return events with eventTime >= startTime
   * @param untilTime return events with eventTime < untilTime
   * @param limit Limit number of events. Get all events if None or Some(-1)
   * @param latest Return latest event first (default true)
   * @param ec ExecutionContext
   * @return Either[StorageError, Iterator[Event}
   */
  public  scala.util.Either<org.apache.predictionio.data.storage.StorageError, scala.collection.Iterator<org.apache.predictionio.data.storage.Event>> findSingleEntity (int appId, scala.Option<java.lang.Object> channelId, java.lang.String entityType, java.lang.String entityId, scala.Option<scala.collection.Seq<java.lang.String>> eventNames, scala.Option<scala.Option<java.lang.String>> targetEntityType, scala.Option<scala.Option<java.lang.String>> targetEntityId, scala.Option<org.joda.time.DateTime> startTime, scala.Option<org.joda.time.DateTime> untilTime, scala.Option<java.lang.Object> limit, boolean latest, scala.concurrent.duration.Duration timeout, scala.concurrent.ExecutionContext ec) ;
  /** Aggregate properties of entities based on these special events:
   * \$set, \$unset, \$delete events.
   * and returns a Map of entityId to properties.
   * <p>
   * @param appId use events of this app ID
   * @param channelId use events of this channel ID (default channel if it's None)
   * @param entityType aggregate properties of the entities of this entityType
   * @param startTime use events with eventTime >= startTime
   * @param untilTime use events with eventTime < untilTime
   * @param required only keep entities with these required properties defined
   * @param ec ExecutionContext
   * @return Map[String, PropertyMap]
   */
  public  scala.collection.immutable.Map<java.lang.String, org.apache.predictionio.data.storage.PropertyMap> aggregateProperties (int appId, scala.Option<java.lang.Object> channelId, java.lang.String entityType, scala.Option<org.joda.time.DateTime> startTime, scala.Option<org.joda.time.DateTime> untilTime, scala.Option<scala.collection.Seq<java.lang.String>> required, scala.concurrent.duration.Duration timeout, scala.concurrent.ExecutionContext ec) ;
  /**
   * :: Experimental ::
   * <p>
   * Aggregate properties of the specified entity (entityType + entityId)
   * based on these special events:
   * \$set, \$unset, \$delete events.
   * and returns Option[PropertyMap]
   * <p>
   * @param appId use events of this app ID
   * @param channelId use events of this channel ID
   * @param entityType the entityType
   * @param entityId the entityId
   * @param startTime use events with eventTime >= startTime
   * @param untilTime use events with eventTime < untilTime
   * @param ec ExecutionContext
   * @return Future[Option[PropertyMap}
   */
  public  scala.Option<org.apache.predictionio.data.storage.PropertyMap> aggregatePropertiesOfEntity (int appId, scala.Option<java.lang.Object> channelId, java.lang.String entityType, java.lang.String entityId, scala.Option<org.joda.time.DateTime> startTime, scala.Option<org.joda.time.DateTime> untilTime, scala.concurrent.duration.Duration timeout, scala.concurrent.ExecutionContext ec) ;
}
