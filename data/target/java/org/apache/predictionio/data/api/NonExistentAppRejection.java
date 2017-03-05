package org.apache.predictionio.data.api;
/** the app doesn't exist */
public  class NonExistentAppRejection implements spray.routing.Rejection, scala.Product, scala.Serializable {
  public  java.lang.String msg () { throw new RuntimeException(); }
  // not preceding
  public   NonExistentAppRejection (java.lang.String msg) { throw new RuntimeException(); }
}
