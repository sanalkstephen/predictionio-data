package org.apache.predictionio.data.storage;
/** :: Experimental :: */
public  class EntityMap<A extends java.lang.Object> extends org.apache.predictionio.data.storage.EntityIdIxMap {
  public  scala.collection.immutable.Map<java.lang.String, A> idToData () { throw new RuntimeException(); }
  public  org.apache.predictionio.data.storage.BiMap<java.lang.String, java.lang.Object> idToIx () { throw new RuntimeException(); }
  // not preceding
  public   EntityMap (scala.collection.immutable.Map<java.lang.String, A> idToData, org.apache.predictionio.data.storage.BiMap<java.lang.String, java.lang.Object> idToIx) { throw new RuntimeException(); }
  public   EntityMap (scala.collection.immutable.Map<java.lang.String, A> idToData) { throw new RuntimeException(); }
  public  A data (java.lang.String id) { throw new RuntimeException(); }
  public  A data (long ix) { throw new RuntimeException(); }
  public  scala.Option<A> getData (java.lang.String id) { throw new RuntimeException(); }
  public  scala.Option<A> getData (long ix) { throw new RuntimeException(); }
  public  A getOrElseData (java.lang.String id, scala.Function0<A> default_) { throw new RuntimeException(); }
  public  A getOrElseData (long ix, scala.Function0<A> default_) { throw new RuntimeException(); }
  public  org.apache.predictionio.data.storage.EntityMap<A> take (int n) { throw new RuntimeException(); }
  public  java.lang.String toString () { throw new RuntimeException(); }
}
