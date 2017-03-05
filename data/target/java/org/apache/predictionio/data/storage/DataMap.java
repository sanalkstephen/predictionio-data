package org.apache.predictionio.data.storage;
/** A DataMap stores properties of the event or entity. Internally it is a Map
 * whose keys are property names and values are corresponding JSON values
 * respectively. Use the {@link get} method to retrieve the value of a mandatory
 * property or use {@link getOpt} to retrieve the value of an optional property.
 * <p>
 * @param fields Map of property name to JValue
 * @group Event Data
 */
public  class DataMap implements scala.Serializable {
  /** Create an empty DataMap
   * @return an empty DataMap
   */
  static public  org.apache.predictionio.data.storage.DataMap apply () { throw new RuntimeException(); }
  /** Create an DataMap from a Map of String to JValue
   * @param fields a Map of String to JValue
   * @return a new DataMap initialized by fields
   */
  static public  org.apache.predictionio.data.storage.DataMap apply (scala.collection.immutable.Map<java.lang.String, org.json4s.JsonAST.JValue> fields) { throw new RuntimeException(); }
  /** Create an DataMap from a JObject
   * @param jObj JObject
   * @return a new DataMap initialized by a JObject
   */
  static public  org.apache.predictionio.data.storage.DataMap apply (org.json4s.JsonAST.JObject jObj) { throw new RuntimeException(); }
  /** Create an DataMap from a JSON String
   * @param js JSON String. eg """{ "a": 1, "b": "foo" }"""
   * @return a new DataMap initialized by a JSON string
   */
  static public  org.apache.predictionio.data.storage.DataMap apply (java.lang.String js) { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, org.json4s.JsonAST.JValue> fields () { throw new RuntimeException(); }
  // not preceding
  public   DataMap (scala.collection.immutable.Map<java.lang.String, org.json4s.JsonAST.JValue> fields) { throw new RuntimeException(); }
  private  org.json4s.Formats formats () { throw new RuntimeException(); }
  /** Check the existence of a required property name. Throw an exception if
   * it does not exist.
   * <p>
   * @param name The property name
   */
  public  void require (java.lang.String name) { throw new RuntimeException(); }
  /** Check if this DataMap contains a specific property.
   * <p>
   * @param name The property name
   * @return Return true if the property exists, else false.
   */
  public  boolean contains (java.lang.String name) { throw new RuntimeException(); }
  /** Get the value of a mandatory property. Exception is thrown if the property
   * does not exist.
   * <p>
   * @tparam T The type of the property value
   * @param name The property name
   * @return Return the property value of type T
   */
  public <T extends java.lang.Object> T get (java.lang.String name, scala.reflect.Manifest<T> evidence$1) { throw new RuntimeException(); }
  /** Get the value of an optional property. Return None if the property does
   * not exist.
   * <p>
   * @tparam T The type of the property value
   * @param name The property name
   * @return Return the property value of type Option[T]
   */
  public <T extends java.lang.Object> scala.Option<T> getOpt (java.lang.String name, scala.reflect.Manifest<T> evidence$2) { throw new RuntimeException(); }
  /** Get the value of an optional property. Return default value if the
   * property does not exist.
   * <p>
   * @tparam T The type of the property value
   * @param name The property name
   * @param default The default property value of type T
   * @return Return the property value of type T
   */
  public <T extends java.lang.Object> T getOrElse (java.lang.String name, T default_, scala.reflect.Manifest<T> evidence$3) { throw new RuntimeException(); }
  /** Java-friendly method for getting the value of a property. Return null if the
   * property does not exist.
   * <p>
   * @tparam T The type of the property value
   * @param name The property name
   * @param clazz The class of the type of the property value
   * @return Return the property value of type T
   */
  public <T extends java.lang.Object> T get (java.lang.String name, java.lang.Class<T> clazz) { throw new RuntimeException(); }
  /** Java-friendly method for getting a list of values of a property. Return null if the
   * property does not exist.
   * <p>
   * @param name The property name
   * @return Return the list of property values
   */
  public  java.util.List<java.lang.String> getStringList (java.lang.String name) { throw new RuntimeException(); }
  /** Tests whether the DataMap is empty.
   * <p>
   * @return true if the DataMap is empty, false otherwise.
   */
  public  boolean isEmpty () { throw new RuntimeException(); }
  /** Collects all property names of this DataMap in a set.
   * <p>
   * @return a set containing all property names of this DataMap.
   */
  public  scala.collection.immutable.Set<java.lang.String> keySet () { throw new RuntimeException(); }
  /** Converts this DataMap to a List.
   * <p>
   * @return a list of (property name, JSON value) tuples.
   */
  public  scala.collection.immutable.List<scala.Tuple2<java.lang.String, org.json4s.JsonAST.JValue>> toList () { throw new RuntimeException(); }
  /** Converts this DataMap to a JObject.
   * <p>
   * @return the JObject initialized by this DataMap.
   */
  public  org.json4s.JsonAST.JObject toJObject () { throw new RuntimeException(); }
  /** Converts this DataMap to case class of type T.
   * <p>
   * @return the object of type T.
   */
  public <T extends java.lang.Object> T extract (scala.reflect.Manifest<T> evidence$4) { throw new RuntimeException(); }
  public  java.lang.String toString () { throw new RuntimeException(); }
  public  int hashCode () { throw new RuntimeException(); }
  public  boolean equals (Object other) { throw new RuntimeException(); }
  public  boolean canEqual (Object other) { throw new RuntimeException(); }
}
