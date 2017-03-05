package org.apache.predictionio.data.api;
public  class EventServerPluginContext {
  static public  org.apache.predictionio.data.api.EventServerPluginContext apply (akka.event.LoggingAdapter log) { throw new RuntimeException(); }
  public  scala.collection.mutable.Map<java.lang.String, scala.collection.mutable.Map<java.lang.String, org.apache.predictionio.data.api.EventServerPlugin>> plugins () { throw new RuntimeException(); }
  public  akka.event.LoggingAdapter log () { throw new RuntimeException(); }
  // not preceding
  public   EventServerPluginContext (scala.collection.mutable.Map<java.lang.String, scala.collection.mutable.Map<java.lang.String, org.apache.predictionio.data.api.EventServerPlugin>> plugins, akka.event.LoggingAdapter log) { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, org.apache.predictionio.data.api.EventServerPlugin> inputBlockers () { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, org.apache.predictionio.data.api.EventServerPlugin> inputSniffers () { throw new RuntimeException(); }
}
