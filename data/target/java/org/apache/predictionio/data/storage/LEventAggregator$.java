package org.apache.predictionio.data.storage;
// no position
/** :: DeveloperApi ::
 * Provides aggregation support of {@link Event}s to {@link LEvents}. Engine developers
 * should use {@link org.apache.predictionio.data.store.LEventStore} instead of using this
 * directly.
 * <p>
 * @group Event Data
 */
public  class LEventAggregator$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final LEventAggregator$ MODULE$ = null;
  public   LEventAggregator$ () { throw new RuntimeException(); }
  /** :: DeveloperApi ::
   * Aggregate all properties grouped by entity type given an iterator of
   * {@link Event}s with the latest property values from all {@link Event}s, and their
   * first and last updated time
   * <p>
   * @param events An iterator of {@link Event}s whose properties will be aggregated
   * @return A map of entity type to {@link PropertyMap}
   */
  public  scala.collection.immutable.Map<java.lang.String, org.apache.predictionio.data.storage.PropertyMap> aggregateProperties (scala.collection.Iterator<org.apache.predictionio.data.storage.Event> events) { throw new RuntimeException(); }
  /** :: DeveloperApi ::
   * Aggregate all properties given an iterator of {@link Event}s with the latest
   * property values from all {@link Event}s, and their first and last updated time
   * <p>
   * @param events An iterator of {@link Event}s whose properties will be aggregated
   * @return An optional {@link PropertyMap}
   */
  public  scala.Option<org.apache.predictionio.data.storage.PropertyMap> aggregatePropertiesSingle (scala.collection.Iterator<org.apache.predictionio.data.storage.Event> events) { throw new RuntimeException(); }
  /** Event names that control aggregation: \$set, \$unset, and \$delete */
  public  scala.collection.immutable.List<java.lang.String> eventNames () { throw new RuntimeException(); }
  private  scala.Function2<scala.Option<org.apache.predictionio.data.storage.DataMap>, org.apache.predictionio.data.storage.Event, scala.Option<org.apache.predictionio.data.storage.DataMap>> dataMapAggregator () { throw new RuntimeException(); }
  private  scala.Function2<org.apache.predictionio.data.storage.LEventAggregator.Prop, org.apache.predictionio.data.storage.Event, org.apache.predictionio.data.storage.LEventAggregator.Prop> propAggregator () { throw new RuntimeException(); }
  private  org.joda.time.DateTime first (org.joda.time.DateTime a, org.joda.time.DateTime b) { throw new RuntimeException(); }
  private  org.joda.time.DateTime last (org.joda.time.DateTime a, org.joda.time.DateTime b) { throw new RuntimeException(); }
}
