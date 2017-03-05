package org.apache.predictionio.data.storage;
// no position
/** :: DeveloperApi ::
 * JSON4S serializer for Joda-Time
 * <p>
 * @group Common
 */
public  class DateTimeJson4sSupport {
  /** Custom JSON4S serializer for Joda-Time */
  static public  class Serializer extends org.json4s.CustomSerializer<org.joda.time.DateTime> {
    public   Serializer () { throw new RuntimeException(); }
  }
  static public  org.json4s.DefaultFormats$ formats () { throw new RuntimeException(); }
  /** Serialize DateTime to JValue */
  static public  scala.PartialFunction<java.lang.Object, org.json4s.JsonAST.JValue> serializeToJValue () { throw new RuntimeException(); }
  /** Deserialize JValue to DateTime */
  static public  scala.PartialFunction<org.json4s.JsonAST.JValue, org.joda.time.DateTime> deserializeFromJValue () { throw new RuntimeException(); }
}
