package org.apache.predictionio.data.storage;
// no position
/** :: DeveloperApi ::
 * JSON4S serializer for Joda-Time
 * <p>
 * @group Common
 */
public  class DateTimeJson4sSupport$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final DateTimeJson4sSupport$ MODULE$ = null;
  public   DateTimeJson4sSupport$ () { throw new RuntimeException(); }
  public  org.json4s.DefaultFormats$ formats () { throw new RuntimeException(); }
  /** Serialize DateTime to JValue */
  public  scala.PartialFunction<java.lang.Object, org.json4s.JsonAST.JValue> serializeToJValue () { throw new RuntimeException(); }
  /** Deserialize JValue to DateTime */
  public  scala.PartialFunction<org.json4s.JsonAST.JValue, org.joda.time.DateTime> deserializeFromJValue () { throw new RuntimeException(); }
}
