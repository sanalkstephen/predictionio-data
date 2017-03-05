package org.apache.predictionio.data.storage;
// no position
/** Backend-agnostic storage utilities. */
public  class Utils {
  /** Add prefix to custom attribute keys. */
  static public <T extends java.lang.Object> scala.collection.immutable.Map<java.lang.String, T> addPrefixToAttributeKeys (scala.collection.immutable.Map<java.lang.String, T> attributes, java.lang.String prefix) { throw new RuntimeException(); }
  /** Remove prefix from custom attribute keys. */
  static public <T extends java.lang.Object> scala.collection.immutable.Map<java.lang.String, T> removePrefixFromAttributeKeys (scala.collection.immutable.Map<java.lang.String, T> attributes, java.lang.String prefix) { throw new RuntimeException(); }
  /** Appends App ID to any ID.
   * Used for distinguishing different app's data within a single collection.
   */
  static public  java.lang.String idWithAppid (int appid, java.lang.String id) { throw new RuntimeException(); }
  static public  org.joda.time.DateTime stringToDateTime (java.lang.String dt) { throw new RuntimeException(); }
}
