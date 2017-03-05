package org.apache.predictionio.data.storage;
public  class EventOp implements scala.Serializable, scala.Product {
  static public  org.apache.predictionio.data.storage.EventOp apply (org.apache.predictionio.data.storage.Event e) { throw new RuntimeException(); }
  public  scala.Option<org.apache.predictionio.data.storage.SetProp> setProp () { throw new RuntimeException(); }
  public  scala.Option<org.apache.predictionio.data.storage.UnsetProp> unsetProp () { throw new RuntimeException(); }
  public  scala.Option<org.apache.predictionio.data.storage.DeleteEntity> deleteEntity () { throw new RuntimeException(); }
  public  scala.Option<org.joda.time.DateTime> firstUpdated () { throw new RuntimeException(); }
  public  scala.Option<org.joda.time.DateTime> lastUpdated () { throw new RuntimeException(); }
  // not preceding
  public   EventOp (scala.Option<org.apache.predictionio.data.storage.SetProp> setProp, scala.Option<org.apache.predictionio.data.storage.UnsetProp> unsetProp, scala.Option<org.apache.predictionio.data.storage.DeleteEntity> deleteEntity, scala.Option<org.joda.time.DateTime> firstUpdated, scala.Option<org.joda.time.DateTime> lastUpdated) { throw new RuntimeException(); }
  public  scala.Option<org.apache.predictionio.data.storage.PropertyMap> toPropertyMap () { throw new RuntimeException(); }
}
