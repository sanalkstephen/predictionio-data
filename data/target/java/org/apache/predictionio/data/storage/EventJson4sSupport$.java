package org.apache.predictionio.data.storage;
// no position
/** :: DeveloperApi ::
 * Support library for dealing with {@link Event} and JSON4S
 * <p>
 * @group Event Data
 */
public  class EventJson4sSupport$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final EventJson4sSupport$ MODULE$ = null;
  public   EventJson4sSupport$ () { throw new RuntimeException(); }
  /** This is set to org.json4s.DefaultFormats. Do not use JSON4S to serialize
   * or deserialize Joda-Time DateTime because it has some issues with timezone
   * (as of version 3.2.10)
   */
  public  org.json4s.DefaultFormats$ formats () { throw new RuntimeException(); }
  /** :: DeveloperApi ::
   * Convert JSON from Event Server to {@link Event}
   * <p>
   * @return deserialization routine used by {@link APISerializer}
   */
  public  scala.PartialFunction<org.json4s.JsonAST.JValue, org.apache.predictionio.data.storage.Event> readJson () { throw new RuntimeException(); }
  /** :: DeveloperApi ::
   * Convert {@link Event} to JSON for use by the Event Server
   * <p>
   * @return serialization routine used by {@link APISerializer}
   */
  public  scala.PartialFunction<java.lang.Object, org.json4s.JsonAST.JValue> writeJson () { throw new RuntimeException(); }
  /** :: DeveloperApi ::
   * Convert JSON4S JValue to {@link Event}
   * <p>
   * @return deserialization routine used by {@link DBSerializer}
   */
  public  scala.PartialFunction<org.json4s.JsonAST.JValue, org.apache.predictionio.data.storage.Event> deserializeFromJValue () { throw new RuntimeException(); }
  /** :: DeveloperApi ::
   * Convert {@link Event} to JSON4S JValue
   * <p>
   * @return serialization routine used by {@link DBSerializer}
   */
  public  scala.PartialFunction<java.lang.Object, org.json4s.JsonAST.JValue> serializeToJValue () { throw new RuntimeException(); }
}
