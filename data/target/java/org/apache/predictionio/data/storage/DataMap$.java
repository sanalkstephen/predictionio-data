package org.apache.predictionio.data.storage;
// no position
/** Companion object of the {@link DataMap} class
 * <p>
 * @group Event Data
 */
public  class DataMap$ implements scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final DataMap$ MODULE$ = null;
  public   DataMap$ () { throw new RuntimeException(); }
  /** Create an empty DataMap
   * @return an empty DataMap
   */
  public  org.apache.predictionio.data.storage.DataMap apply () { throw new RuntimeException(); }
  /** Create an DataMap from a Map of String to JValue
   * @param fields a Map of String to JValue
   * @return a new DataMap initialized by fields
   */
  public  org.apache.predictionio.data.storage.DataMap apply (scala.collection.immutable.Map<java.lang.String, org.json4s.JsonAST.JValue> fields) { throw new RuntimeException(); }
  /** Create an DataMap from a JObject
   * @param jObj JObject
   * @return a new DataMap initialized by a JObject
   */
  public  org.apache.predictionio.data.storage.DataMap apply (org.json4s.JsonAST.JObject jObj) { throw new RuntimeException(); }
  /** Create an DataMap from a JSON String
   * @param js JSON String. eg """{ "a": 1, "b": "foo" }"""
   * @return a new DataMap initialized by a JSON string
   */
  public  org.apache.predictionio.data.storage.DataMap apply (java.lang.String js) { throw new RuntimeException(); }
}
