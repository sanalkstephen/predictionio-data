package org.apache.predictionio.data.storage;
// no position
/** Companion object of the {@link PropertyMap} class. */
public  class PropertyMap$ implements scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final PropertyMap$ MODULE$ = null;
  public   PropertyMap$ () { throw new RuntimeException(); }
  /** Create an PropertyMap from a Map of String to JValue,
   * firstUpdated and lastUpdated time.
   * <p>
   * @param fields a Map of String to JValue
   * @param firstUpdated First updated time
   * @param lastUpdated Last updated time
   * @return a new PropertyMap
   */
  public  org.apache.predictionio.data.storage.PropertyMap apply (scala.collection.immutable.Map<java.lang.String, org.json4s.JsonAST.JValue> fields, org.joda.time.DateTime firstUpdated, org.joda.time.DateTime lastUpdated) { throw new RuntimeException(); }
  /** Create an PropertyMap from a JSON String and firstUpdated and lastUpdated
   * time.
   * @param js JSON String. eg """{ "a": 1, "b": "foo" }"""
   * @param firstUpdated First updated time
   * @param lastUpdated Last updated time
   * @return a new PropertyMap
   */
  public  org.apache.predictionio.data.storage.PropertyMap apply (java.lang.String js, org.joda.time.DateTime firstUpdated, org.joda.time.DateTime lastUpdated) { throw new RuntimeException(); }
}
