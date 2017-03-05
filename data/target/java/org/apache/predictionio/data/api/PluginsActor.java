package org.apache.predictionio.data.api;
public  class PluginsActor implements akka.actor.Actor {
  static public  class HandleREST implements scala.Product, scala.Serializable {
    public  java.lang.String pluginName () { throw new RuntimeException(); }
    public  int appId () { throw new RuntimeException(); }
    public  scala.Option<java.lang.Object> channelId () { throw new RuntimeException(); }
    public  scala.collection.Seq<java.lang.String> pluginArgs () { throw new RuntimeException(); }
    // not preceding
    public   HandleREST (java.lang.String pluginName, int appId, scala.Option<java.lang.Object> channelId, scala.collection.Seq<java.lang.String> pluginArgs) { throw new RuntimeException(); }
  }
  // no position
  // not preceding
  static public  class HandleREST$ extends scala.runtime.AbstractFunction4<java.lang.String, java.lang.Object, scala.Option<java.lang.Object>, scala.collection.Seq<java.lang.String>, org.apache.predictionio.data.api.PluginsActor.HandleREST> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final HandleREST$ MODULE$ = null;
    public   HandleREST$ () { throw new RuntimeException(); }
  }
  public   PluginsActor () { throw new RuntimeException(); }
  public  akka.actor.ActorSystem system () { throw new RuntimeException(); }
  public  akka.event.LoggingAdapter log () { throw new RuntimeException(); }
  public  org.apache.predictionio.data.api.EventServerPluginContext pluginContext () { throw new RuntimeException(); }
  public  scala.PartialFunction<java.lang.Object, scala.runtime.BoxedUnit> receive () { throw new RuntimeException(); }
}
