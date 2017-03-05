package org.apache.predictionio.data.api;
public  class Stats {
  public  org.joda.time.DateTime startTime () { throw new RuntimeException(); }
  // not preceding
  public   Stats (org.joda.time.DateTime startTime) { throw new RuntimeException(); }
  public  scala.collection.mutable.Map<scala.Tuple2<java.lang.Object, spray.http.StatusCode>, java.lang.Object> statusCodeCount () { throw new RuntimeException(); }
  public  scala.collection.mutable.Map<scala.Tuple2<java.lang.Object, org.apache.predictionio.data.api.EntityTypesEvent>, java.lang.Object> eteCount () { throw new RuntimeException(); }
  public  void cutoff (org.joda.time.DateTime endTime) { throw new RuntimeException(); }
  public  void update (int appId, spray.http.StatusCode statusCode, org.apache.predictionio.data.storage.Event event) { throw new RuntimeException(); }
  public <K extends java.lang.Object, V extends java.lang.Object> scala.collection.Seq<org.apache.predictionio.data.api.KV<K, V>> extractByAppId (int appId, scala.collection.mutable.Map<scala.Tuple2<java.lang.Object, K>, V> m) { throw new RuntimeException(); }
  public  org.apache.predictionio.data.api.StatsSnapshot get (int appId) { throw new RuntimeException(); }
}
