package org.apache.predictionio.data.storage;
// no position
/** :: DeveloperApi ::
 * Support library for dealing with {@link Event} and JSON4S
 * <p>
 * @group Event Data
 */
public  class EventJson4sSupport {
  /** :: DeveloperApi ::
   * Custom JSON4S serializer for {@link Event} intended to be used by database
   * access, or anywhere that demands serdes of {@link Event} to/from JSON4S JValue
   */
  static public  class DBSerializer extends org.json4s.CustomSerializer<org.apache.predictionio.data.storage.Event> {
    public   DBSerializer () { throw new RuntimeException(); }
  }
  /** :: DeveloperApi ::
   * Custom JSON4S serializer for {@link Event} intended to be used by the Event
   * Server, or anywhere that demands serdes of {@link Event} to/from JSON
   */
  static public  class APISerializer extends org.json4s.CustomSerializer<org.apache.predictionio.data.storage.Event> {
    public   APISerializer () { throw new RuntimeException(); }
  }
  /** This is set to org.json4s.DefaultFormats. Do not use JSON4S to serialize
   * or deserialize Joda-Time DateTime because it has some issues with timezone
   * (as of version 3.2.10)
   */
  static public  org.json4s.DefaultFormats$ formats () { throw new RuntimeException(); }
  /** :: DeveloperApi ::
   * Convert JSON from Event Server to {@link Event}
   * <p>
   * @return deserialization routine used by {@link APISerializer}
   */
  static public  scala.PartialFunction<org.json4s.JsonAST.JValue, org.apache.predictionio.data.storage.Event> readJson () { throw new RuntimeException(); }
  /** :: DeveloperApi ::
   * Convert {@link Event} to JSON for use by the Event Server
   * <p>
   * @return serialization routine used by {@link APISerializer}
   */
  static public  scala.PartialFunction<java.lang.Object, org.json4s.JsonAST.JValue> writeJson () { throw new RuntimeException(); }
  /** :: DeveloperApi ::
   * Convert JSON4S JValue to {@link Event}
   * <p>
   * @return deserialization routine used by {@link DBSerializer}
   */
  static public  scala.PartialFunction<org.json4s.JsonAST.JValue, org.apache.predictionio.data.storage.Event> deserializeFromJValue () { throw new RuntimeException(); }
  /** :: DeveloperApi ::
   * Convert {@link Event} to JSON4S JValue
   * <p>
   * @return serialization routine used by {@link DBSerializer}
   */
  static public  scala.PartialFunction<java.lang.Object, org.json4s.JsonAST.JValue> serializeToJValue () { throw new RuntimeException(); }
}
