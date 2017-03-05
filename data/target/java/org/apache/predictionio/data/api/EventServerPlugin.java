package org.apache.predictionio.data.api;
public  interface EventServerPlugin {
  public  java.lang.String pluginName () ;
  public  java.lang.String pluginDescription () ;
  public  java.lang.String pluginType () ;
  public  void start (org.apache.predictionio.data.api.EventServerPluginContext context) ;
  public  void process (org.apache.predictionio.data.api.EventInfo eventInfo, org.apache.predictionio.data.api.EventServerPluginContext context) ;
  public  java.lang.String handleREST (int appId, scala.Option<java.lang.Object> channelId, scala.collection.Seq<java.lang.String> arguments) ;
}
