package org.apache.predictionio.data.api;
// no position
public  class Webhooks$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final Webhooks$ MODULE$ = null;
  public   Webhooks$ () { throw new RuntimeException(); }
  public  scala.concurrent.Future<scala.Tuple2<spray.http.StatusCode, scala.collection.immutable.Map<java.lang.String, java.lang.String>>> postJson (int appId, scala.Option<java.lang.Object> channelId, java.lang.String web, org.json4s.JsonAST.JObject data, org.apache.predictionio.data.storage.LEvents eventClient, akka.event.LoggingAdapter log, boolean stats, akka.actor.ActorSelection statsActorRef, scala.concurrent.ExecutionContext ec) { throw new RuntimeException(); }
  public  scala.concurrent.Future<scala.Tuple2<spray.http.StatusCode, scala.collection.immutable.Map<java.lang.String, java.lang.String>>> getJson (int appId, scala.Option<java.lang.Object> channelId, java.lang.String web, akka.event.LoggingAdapter log, scala.concurrent.ExecutionContext ec) { throw new RuntimeException(); }
  public  scala.concurrent.Future<scala.Tuple2<spray.http.StatusCode, scala.collection.immutable.Map<java.lang.String, java.lang.String>>> postForm (int appId, scala.Option<java.lang.Object> channelId, java.lang.String web, spray.http.FormData data, org.apache.predictionio.data.storage.LEvents eventClient, akka.event.LoggingAdapter log, boolean stats, akka.actor.ActorSelection statsActorRef, scala.concurrent.ExecutionContext ec) { throw new RuntimeException(); }
  public  scala.concurrent.Future<scala.Tuple2<spray.http.StatusCode, scala.collection.immutable.Map<java.lang.String, java.lang.String>>> getForm (int appId, scala.Option<java.lang.Object> channelId, java.lang.String web, akka.event.LoggingAdapter log, scala.concurrent.ExecutionContext ec) { throw new RuntimeException(); }
}
