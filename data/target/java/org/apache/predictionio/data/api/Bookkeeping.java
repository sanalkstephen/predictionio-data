package org.apache.predictionio.data.api;
public  class Bookkeeping implements scala.Product, scala.Serializable {
  public  int appId () { throw new RuntimeException(); }
  public  spray.http.StatusCode statusCode () { throw new RuntimeException(); }
  public  org.apache.predictionio.data.storage.Event event () { throw new RuntimeException(); }
  // not preceding
  public   Bookkeeping (int appId, spray.http.StatusCode statusCode, org.apache.predictionio.data.storage.Event event) { throw new RuntimeException(); }
}
