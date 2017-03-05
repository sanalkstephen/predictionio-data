package org.apache.predictionio.data.storage;
// no position
public  class BiMap$ implements scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final BiMap$ MODULE$ = null;
  public   BiMap$ () { throw new RuntimeException(); }
  public <K extends java.lang.Object, V extends java.lang.Object> org.apache.predictionio.data.storage.BiMap<K, V> apply (scala.collection.immutable.Map<K, V> x) { throw new RuntimeException(); }
  /** Create a BiMap[String, Long] from a set of String. The Long index starts
   * from 0.
   * @param keys a set of String
   * @return a String to Long BiMap
   */
  public  org.apache.predictionio.data.storage.BiMap<java.lang.String, java.lang.Object> stringLong (scala.collection.immutable.Set<java.lang.String> keys) { throw new RuntimeException(); }
  /** Create a BiMap[String, Long] from an array of String.
   * NOTE: the the array cannot have duplicated element.
   * The Long index starts from 0.
   * @param keys a set of String
   * @return a String to Long BiMap
   */
  public  org.apache.predictionio.data.storage.BiMap<java.lang.String, java.lang.Object> stringLong (java.lang.String[] keys) { throw new RuntimeException(); }
  /** Create a BiMap[String, Long] from RDD[String]. The Long index starts
   * from 0.
   * @param keys RDD of String
   * @return a String to Long BiMap
   */
  public  org.apache.predictionio.data.storage.BiMap<java.lang.String, java.lang.Object> stringLong (org.apache.spark.rdd.RDD<java.lang.String> keys) { throw new RuntimeException(); }
  /** Create a BiMap[String, Int] from a set of String. The Int index starts
   * from 0.
   * @param keys a set of String
   * @return a String to Int BiMap
   */
  public  org.apache.predictionio.data.storage.BiMap<java.lang.String, java.lang.Object> stringInt (scala.collection.immutable.Set<java.lang.String> keys) { throw new RuntimeException(); }
  /** Create a BiMap[String, Int] from an array of String.
   * NOTE: the the array cannot have duplicated element.
   * The Int index starts from 0.
   * @param keys a set of String
   * @return a String to Int BiMap
   */
  public  org.apache.predictionio.data.storage.BiMap<java.lang.String, java.lang.Object> stringInt (java.lang.String[] keys) { throw new RuntimeException(); }
  /** Create a BiMap[String, Int] from RDD[String]. The Int index starts
   * from 0.
   * @param keys RDD of String
   * @return a String to Int BiMap
   */
  public  org.apache.predictionio.data.storage.BiMap<java.lang.String, java.lang.Object> stringInt (org.apache.spark.rdd.RDD<java.lang.String> keys) { throw new RuntimeException(); }
  private  org.apache.predictionio.data.storage.BiMap<java.lang.String, java.lang.Object> stringDoubleImpl (scala.collection.Seq<java.lang.String> keys) { throw new RuntimeException(); }
  /** Create a BiMap[String, Double] from a set of String. The Double index
   * starts from 0.
   * @param keys a set of String
   * @return a String to Double BiMap
   */
  public  org.apache.predictionio.data.storage.BiMap<java.lang.String, java.lang.Object> stringDouble (scala.collection.immutable.Set<java.lang.String> keys) { throw new RuntimeException(); }
  /** Create a BiMap[String, Double] from an array of String.
   * NOTE: the the array cannot have duplicated element.
   * The Double index starts from 0.
   * @param keys a set of String
   * @return a String to Double BiMap
   */
  public  org.apache.predictionio.data.storage.BiMap<java.lang.String, java.lang.Object> stringDouble (java.lang.String[] keys) { throw new RuntimeException(); }
  /** Create a BiMap[String, Double] from RDD[String]. The Double index starts
   * from 0.
   * @param keys RDD of String
   * @return a String to Double BiMap
   */
  public  org.apache.predictionio.data.storage.BiMap<java.lang.String, java.lang.Object> stringDouble (org.apache.spark.rdd.RDD<java.lang.String> keys) { throw new RuntimeException(); }
}
