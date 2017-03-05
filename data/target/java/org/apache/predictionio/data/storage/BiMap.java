package org.apache.predictionio.data.storage;
/** Immutable Bi-directional Map
 * <p>
 */
public  class BiMap<K extends java.lang.Object, V extends java.lang.Object> implements scala.Serializable {
  /** Create a BiMap[String, Long] from a set of String. The Long index starts
   * from 0.
   * @param keys a set of String
   * @return a String to Long BiMap
   */
  static public  org.apache.predictionio.data.storage.BiMap<java.lang.String, java.lang.Object> stringLong (scala.collection.immutable.Set<java.lang.String> keys) { throw new RuntimeException(); }
  /** Create a BiMap[String, Long] from an array of String.
   * NOTE: the the array cannot have duplicated element.
   * The Long index starts from 0.
   * @param keys a set of String
   * @return a String to Long BiMap
   */
  static public  org.apache.predictionio.data.storage.BiMap<java.lang.String, java.lang.Object> stringLong (java.lang.String[] keys) { throw new RuntimeException(); }
  /** Create a BiMap[String, Long] from RDD[String]. The Long index starts
   * from 0.
   * @param keys RDD of String
   * @return a String to Long BiMap
   */
  static public  org.apache.predictionio.data.storage.BiMap<java.lang.String, java.lang.Object> stringLong (org.apache.spark.rdd.RDD<java.lang.String> keys) { throw new RuntimeException(); }
  /** Create a BiMap[String, Int] from a set of String. The Int index starts
   * from 0.
   * @param keys a set of String
   * @return a String to Int BiMap
   */
  static public  org.apache.predictionio.data.storage.BiMap<java.lang.String, java.lang.Object> stringInt (scala.collection.immutable.Set<java.lang.String> keys) { throw new RuntimeException(); }
  /** Create a BiMap[String, Int] from an array of String.
   * NOTE: the the array cannot have duplicated element.
   * The Int index starts from 0.
   * @param keys a set of String
   * @return a String to Int BiMap
   */
  static public  org.apache.predictionio.data.storage.BiMap<java.lang.String, java.lang.Object> stringInt (java.lang.String[] keys) { throw new RuntimeException(); }
  /** Create a BiMap[String, Int] from RDD[String]. The Int index starts
   * from 0.
   * @param keys RDD of String
   * @return a String to Int BiMap
   */
  static public  org.apache.predictionio.data.storage.BiMap<java.lang.String, java.lang.Object> stringInt (org.apache.spark.rdd.RDD<java.lang.String> keys) { throw new RuntimeException(); }
  static private  org.apache.predictionio.data.storage.BiMap<java.lang.String, java.lang.Object> stringDoubleImpl (scala.collection.Seq<java.lang.String> keys) { throw new RuntimeException(); }
  /** Create a BiMap[String, Double] from a set of String. The Double index
   * starts from 0.
   * @param keys a set of String
   * @return a String to Double BiMap
   */
  static public  org.apache.predictionio.data.storage.BiMap<java.lang.String, java.lang.Object> stringDouble (scala.collection.immutable.Set<java.lang.String> keys) { throw new RuntimeException(); }
  /** Create a BiMap[String, Double] from an array of String.
   * NOTE: the the array cannot have duplicated element.
   * The Double index starts from 0.
   * @param keys a set of String
   * @return a String to Double BiMap
   */
  static public  org.apache.predictionio.data.storage.BiMap<java.lang.String, java.lang.Object> stringDouble (java.lang.String[] keys) { throw new RuntimeException(); }
  /** Create a BiMap[String, Double] from RDD[String]. The Double index starts
   * from 0.
   * @param keys RDD of String
   * @return a String to Double BiMap
   */
  static public  org.apache.predictionio.data.storage.BiMap<java.lang.String, java.lang.Object> stringDouble (org.apache.spark.rdd.RDD<java.lang.String> keys) { throw new RuntimeException(); }
  private  scala.collection.immutable.Map<K, V> m () { throw new RuntimeException(); }
  private  scala.Option<org.apache.predictionio.data.storage.BiMap<V, K>> i () { throw new RuntimeException(); }
  // not preceding
  public   BiMap (scala.collection.immutable.Map<K, V> m, scala.Option<org.apache.predictionio.data.storage.BiMap<V, K>> i) { throw new RuntimeException(); }
  public  org.apache.predictionio.data.storage.BiMap<V, K> inverse () { throw new RuntimeException(); }
  public  scala.Option<V> get (K k) { throw new RuntimeException(); }
  public  V getOrElse (K k, scala.Function0<V> default_) { throw new RuntimeException(); }
  public  boolean contains (K k) { throw new RuntimeException(); }
  public  V apply (K k) { throw new RuntimeException(); }
  /** Converts to a map.
   * @return a map of type immutable.Map[K, V]
   */
  public  scala.collection.immutable.Map<K, V> toMap () { throw new RuntimeException(); }
  /** Converts to a sequence.
   * @return a sequence containing all elements of this map
   */
  public  scala.collection.Seq<scala.Tuple2<K, V>> toSeq () { throw new RuntimeException(); }
  public  int size () { throw new RuntimeException(); }
  public  org.apache.predictionio.data.storage.BiMap<K, V> take (int n) { throw new RuntimeException(); }
  public  java.lang.String toString () { throw new RuntimeException(); }
}
