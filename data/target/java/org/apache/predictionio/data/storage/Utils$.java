package org.apache.predictionio.data.storage;
// no position
/** Backend-agnostic storage utilities. */
public  class Utils$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final Utils$ MODULE$ = null;
  public   Utils$ () { throw new RuntimeException(); }
  /** Add prefix to custom attribute keys. */
  public <T extends java.lang.Object> scala.collection.immutable.Map<java.lang.String, T> addPrefixToAttributeKeys (scala.collection.immutable.Map<java.lang.String, T> attributes, java.lang.String prefix) { throw new RuntimeException(); }
  /** Remove prefix from custom attribute keys. */
  public <T extends java.lang.Object> scala.collection.immutable.Map<java.lang.String, T> removePrefixFromAttributeKeys (scala.collection.immutable.Map<java.lang.String, T> attributes, java.lang.String prefix) { throw new RuntimeException(); }
  /** Appends App ID to any ID.
   * Used for distinguishing different app's data within a single collection.
   */
  public  java.lang.String idWithAppid (int appid, java.lang.String id) { throw new RuntimeException(); }
  public  org.joda.time.DateTime stringToDateTime (java.lang.String dt) { throw new RuntimeException(); }
}
