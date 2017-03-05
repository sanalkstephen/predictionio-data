package org.apache.predictionio.data.storage.hbase;
// no position
public  class HBEventsUtil {
  static public  class RowKey {
    public  byte[] b () { throw new RuntimeException(); }
    // not preceding
    public   RowKey (byte[] b) { throw new RuntimeException(); }
    public  byte[] entityHash () { throw new RuntimeException(); }
    public  long millis () { throw new RuntimeException(); }
    public  long uuidLow () { throw new RuntimeException(); }
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
    public  org.apache.predictionio.data.storage.hbase.HBEventsUtil.RowKey apply (java.lang.String entityType, java.lang.String entityId, long millis, long uuidLow) { throw new RuntimeException(); }
    public  org.apache.predictionio.data.storage.hbase.HBEventsUtil.RowKey apply (java.lang.String s) { throw new RuntimeException(); }
    public  org.apache.predictionio.data.storage.hbase.HBEventsUtil.RowKey apply (byte[] b) { throw new RuntimeException(); }
  }
  static public  class PartialRowKey implements scala.Product, scala.Serializable {
    public  java.lang.String entityType () { throw new RuntimeException(); }
    public  java.lang.String entityId () { throw new RuntimeException(); }
    public  scala.Option<java.lang.Object> millis () { throw new RuntimeException(); }
    // not preceding
    public   PartialRowKey (java.lang.String entityType, java.lang.String entityId, scala.Option<java.lang.Object> millis) { throw new RuntimeException(); }
    public  byte[] toBytes () { throw new RuntimeException(); }
  }
  // no position
  static public  class PartialRowKey$ extends scala.runtime.AbstractFunction3<java.lang.String, java.lang.String, scala.Option<java.lang.Object>, org.apache.predictionio.data.storage.hbase.HBEventsUtil.PartialRowKey> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final PartialRowKey$ MODULE$ = null;
    public   PartialRowKey$ () { throw new RuntimeException(); }
  }
  static public  class RowKeyException extends java.lang.Exception {
    public  java.lang.String msg () { throw new RuntimeException(); }
    public  java.lang.Exception cause () { throw new RuntimeException(); }
    // not preceding
    public   RowKeyException (java.lang.String msg, java.lang.Exception cause) { throw new RuntimeException(); }
    public   RowKeyException (java.lang.String msg) { throw new RuntimeException(); }
  }
  static public  org.json4s.DefaultFormats$ formats () { throw new RuntimeException(); }
  static public  java.lang.String tableName (java.lang.String namespace, int appId, scala.Option<java.lang.Object> channelId) { throw new RuntimeException(); }
  static public  scala.collection.immutable.Map<java.lang.String, byte[]> colNames () { throw new RuntimeException(); }
  static public  byte[] hash (java.lang.String entityType, java.lang.String entityId) { throw new RuntimeException(); }
  static public  scala.Tuple2<org.apache.hadoop.hbase.client.Put, org.apache.predictionio.data.storage.hbase.HBEventsUtil.RowKey> eventToPut (org.apache.predictionio.data.storage.Event event, int appId) { throw new RuntimeException(); }
  static public  org.apache.predictionio.data.storage.Event resultToEvent (org.apache.hadoop.hbase.client.Result result, int appId) { throw new RuntimeException(); }
  static public  org.apache.hadoop.hbase.client.Scan createScan (scala.Option<org.joda.time.DateTime> startTime, scala.Option<org.joda.time.DateTime> untilTime, scala.Option<java.lang.String> entityType, scala.Option<java.lang.String> entityId, scala.Option<scala.collection.Seq<java.lang.String>> eventNames, scala.Option<scala.Option<java.lang.String>> targetEntityType, scala.Option<scala.Option<java.lang.String>> targetEntityId, scala.Option<java.lang.Object> reversed) { throw new RuntimeException(); }
}
