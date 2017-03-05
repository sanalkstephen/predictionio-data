package org.apache.predictionio.data.storage.hbase.upgrade;
// no position
/** :: Experimental :: */
public  class HB_0_8_0 {
  static public  class RowKey {
    public  int appId () { throw new RuntimeException(); }
    public  long millis () { throw new RuntimeException(); }
    public  long uuidLow () { throw new RuntimeException(); }
    // not preceding
    public   RowKey (int appId, long millis, long uuidLow) { throw new RuntimeException(); }
    public  byte[] toBytes () { throw new RuntimeException(); }
    public  java.lang.String toString () { throw new RuntimeException(); }
  }
  // no position
  static public  class RowKey$ {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final RowKey$ MODULE$ = null;
    public   RowKey$ () { throw new RuntimeException(); }
    public  org.apache.predictionio.data.storage.hbase.upgrade.HB_0_8_0.RowKey apply (java.lang.String s) { throw new RuntimeException(); }
    public  org.apache.predictionio.data.storage.hbase.upgrade.HB_0_8_0.RowKey apply (byte[] b) { throw new RuntimeException(); }
  }
  static public  class PartialRowKey implements scala.Product, scala.Serializable {
    public  int appId () { throw new RuntimeException(); }
    public  scala.Option<java.lang.Object> millis () { throw new RuntimeException(); }
    // not preceding
    public   PartialRowKey (int appId, scala.Option<java.lang.Object> millis) { throw new RuntimeException(); }
    public  byte[] toBytes () { throw new RuntimeException(); }
  }
  // no position
  static public  class PartialRowKey$ extends scala.runtime.AbstractFunction2<java.lang.Object, scala.Option<java.lang.Object>, org.apache.predictionio.data.storage.hbase.upgrade.HB_0_8_0.PartialRowKey> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final PartialRowKey$ MODULE$ = null;
    public   PartialRowKey$ () { throw new RuntimeException(); }
  }
  static public  class RowKeyException extends java.lang.Exception {
    public   RowKeyException (java.lang.String msg, java.lang.Exception cause) { throw new RuntimeException(); }
    public   RowKeyException (java.lang.String msg) { throw new RuntimeException(); }
  }
  static public  org.json4s.DefaultFormats$ formats () { throw new RuntimeException(); }
  static public  scala.collection.Iterator<org.apache.predictionio.data.storage.Event> getByAppId (org.apache.hadoop.hbase.client.HConnection connection, java.lang.String namespace, int appId) { throw new RuntimeException(); }
  static public  scala.collection.immutable.Map<java.lang.String, byte[]> colNames () { throw new RuntimeException(); }
  static public  org.apache.predictionio.data.storage.Event resultToEvent (org.apache.hadoop.hbase.client.Result result) { throw new RuntimeException(); }
}
