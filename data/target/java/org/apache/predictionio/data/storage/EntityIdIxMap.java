package org.apache.predictionio.data.storage;
/** :: Experimental :: */
public  class EntityIdIxMap implements scala.Serializable {
  public  org.apache.predictionio.data.storage.BiMap<java.lang.String, java.lang.Object> idToIx () { throw new RuntimeException(); }
  // not preceding
  public   EntityIdIxMap (org.apache.predictionio.data.storage.BiMap<java.lang.String, java.lang.Object> idToIx) { throw new RuntimeException(); }
  public  org.apache.predictionio.data.storage.BiMap<java.lang.Object, java.lang.String> ixToId () { throw new RuntimeException(); }
  public  long apply (java.lang.String id) { throw new RuntimeException(); }
  public  java.lang.String apply (long ix) { throw new RuntimeException(); }
  public  boolean contains (java.lang.String id) { throw new RuntimeException(); }
  public  boolean contains (long ix) { throw new RuntimeException(); }
  public  scala.Option<java.lang.Object> get (java.lang.String id) { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> get (long ix) { throw new RuntimeException(); }
  public  long getOrElse (java.lang.String id, scala.Function0<java.lang.Object> default_) { throw new RuntimeException(); }
  public  java.lang.String getOrElse (long ix, scala.Function0<java.lang.String> default_) { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, java.lang.Object> toMap () { throw new RuntimeException(); }
  public  long size () { throw new RuntimeException(); }
  public  org.apache.predictionio.data.storage.EntityIdIxMap take (int n) { throw new RuntimeException(); }
  public  java.lang.String toString () { throw new RuntimeException(); }
}
