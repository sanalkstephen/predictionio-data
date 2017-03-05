package org.apache.predictionio.data.view;
public  class EventOp implements scala.Serializable, scala.Product {
  static public  org.apache.predictionio.data.view.EventOp apply (org.apache.predictionio.data.storage.Event e) { throw new RuntimeException(); }
  public  scala.Option<org.apache.predictionio.data.view.SetProp> setProp () { throw new RuntimeException(); }
  public  scala.Option<org.apache.predictionio.data.view.UnsetProp> unsetProp () { throw new RuntimeException(); }
  public  scala.Option<org.apache.predictionio.data.view.DeleteEntity> deleteEntity () { throw new RuntimeException(); }
  // not preceding
  public   EventOp (scala.Option<org.apache.predictionio.data.view.SetProp> setProp, scala.Option<org.apache.predictionio.data.view.UnsetProp> unsetProp, scala.Option<org.apache.predictionio.data.view.DeleteEntity> deleteEntity) { throw new RuntimeException(); }
  public  scala.Option<org.apache.predictionio.data.storage.DataMap> toDataMap () { throw new RuntimeException(); }
}
