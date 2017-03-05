package org.apache.predictionio.data.storage;
// no position
/** :: DeveloperApi ::
 * Utilities for validating {@link Event}s
 * <p>
 * @group Event Data
 */
public  class EventValidation {
  /** Default time zone is set to UTC */
  static public  org.joda.time.DateTimeZone defaultTimeZone () { throw new RuntimeException(); }
  /** Checks whether an event name contains a reserved prefix
   * <p>
   * @param name Event name
   * @return true if event name starts with \$ or pio_, false otherwise
   */
  static public  boolean isReservedPrefix (java.lang.String name) { throw new RuntimeException(); }
  /** PredictionIO reserves some single entity event names. They are currently
   * \$set, \$unset, and \$delete.
   */
  static public  scala.collection.immutable.Set<java.lang.String> specialEvents () { throw new RuntimeException(); }
  /** Checks whether an event name is a special PredictionIO event name
   * <p>
   * @param name Event name
   * @return true if the name is a special event, false otherwise
   */
  static public  boolean isSpecialEvents (java.lang.String name) { throw new RuntimeException(); }
  /** Validate an {@link Event}, throwing exceptions when the candidate violates any
   * of the following:
   * <p>
   *  - event name must not be empty
   *  - entityType must not be empty
   *  - entityId must not be empty
   *  - targetEntityType must not be Some of empty
   *  - targetEntityId must not be Some of empty
   *  - targetEntityType and targetEntityId must be both Some or None
   *  - properties must not be empty when event is \$unset
   *  - event name must be a special event if it has a reserved prefix
   *  - targetEntityType and targetEntityId must be None if the event name has
   *    a reserved prefix
   *  - entityType must be a built-in entity type if entityType has a
   *    reserved prefix
   *  - targetEntityType must be a built-in entity type if targetEntityType is
   *    Some and has a reserved prefix
   * <p>
   * @param e Event to be validated
   */
  static public  void validate (org.apache.predictionio.data.storage.Event e) { throw new RuntimeException(); }
  /** Defines built-in entity types. The current built-in type is pio_pr. */
  static public  scala.collection.immutable.Set<java.lang.String> builtinEntityTypes () { throw new RuntimeException(); }
  /** Defines built-in properties. This is currently empty. */
  static public  scala.collection.immutable.Set<java.lang.String> builtinProperties () { throw new RuntimeException(); }
  /** Checks whether an entity type is a built-in entity type */
  static public  boolean isBuiltinEntityTypes (java.lang.String name) { throw new RuntimeException(); }
  /** Validate event properties, throwing exceptions when the candidate violates
   * any of the following:
   * <p>
   *  - property name must not contain a reserved prefix
   * <p>
   * @param e Event to be validated
   */
  static public  void validateProperties (org.apache.predictionio.data.storage.Event e) { throw new RuntimeException(); }
}
