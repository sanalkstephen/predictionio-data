package org.apache.predictionio.data.api;
public  class EventServiceActor extends spray.routing.HttpServiceActor {
  public  org.apache.predictionio.data.storage.LEvents eventClient () { throw new RuntimeException(); }
  public  org.apache.predictionio.data.storage.AccessKeys accessKeysClient () { throw new RuntimeException(); }
  public  org.apache.predictionio.data.storage.Channels channelsClient () { throw new RuntimeException(); }
  public  org.apache.predictionio.data.api.EventServerConfig config () { throw new RuntimeException(); }
  // not preceding
  public   EventServiceActor (org.apache.predictionio.data.storage.LEvents eventClient, org.apache.predictionio.data.storage.AccessKeys accessKeysClient, org.apache.predictionio.data.storage.Channels channelsClient, org.apache.predictionio.data.api.EventServerConfig config) { throw new RuntimeException(); }
  // no position
  public  class Json4sProtocol implements spray.httpx.Json4sSupport {
    public   Json4sProtocol () { throw new RuntimeException(); }
    public  org.json4s.Formats json4sFormats () { throw new RuntimeException(); }
  }
  // not preceding
  public  org.apache.predictionio.data.api.EventServiceActor.Json4sProtocol$ Json4sProtocol () { throw new RuntimeException(); }
  public  int MaxNumberOfEventsPerBatchRequest () { throw new RuntimeException(); }
  public  akka.event.LoggingAdapter logger () { throw new RuntimeException(); }
  public  scala.concurrent.ExecutionContext executionContext () { throw new RuntimeException(); }
  public  akka.util.Timeout timeout () { throw new RuntimeException(); }
  public  spray.routing.RejectionHandler rejectionHandler () { throw new RuntimeException(); }
  public  scala.util.matching.Regex jsonPath () { throw new RuntimeException(); }
  public  scala.util.matching.Regex formPath () { throw new RuntimeException(); }
  public  org.apache.predictionio.data.api.EventServerPluginContext pluginContext () { throw new RuntimeException(); }
  private  sun.misc.BASE64Decoder base64Decoder () { throw new RuntimeException(); }
  public  class AuthData implements scala.Product, scala.Serializable {
    public  int appId () { throw new RuntimeException(); }
    public  scala.Option<java.lang.Object> channelId () { throw new RuntimeException(); }
    public  scala.collection.Seq<java.lang.String> events () { throw new RuntimeException(); }
    // not preceding
    public   AuthData (int appId, scala.Option<java.lang.Object> channelId, scala.collection.Seq<java.lang.String> events) { throw new RuntimeException(); }
  }
  // no position
  public  class AuthData extends scala.runtime.AbstractFunction3<java.lang.Object, scala.Option<java.lang.Object>, scala.collection.Seq<java.lang.String>, org.apache.predictionio.data.api.EventServiceActor.AuthData> implements scala.Serializable {
    public   AuthData () { throw new RuntimeException(); }
  }
  public  scala.Function1<spray.routing.RequestContext, scala.concurrent.Future<scala.util.Either<spray.routing.Rejection, org.apache.predictionio.data.api.EventServiceActor.AuthData>>> withAccessKey () { throw new RuntimeException(); }
  private  scala.util.Left<spray.routing.AuthenticationFailedRejection, scala.runtime.Nothing$> FailedAuth () { throw new RuntimeException(); }
  private  scala.util.Left<spray.routing.AuthenticationFailedRejection, scala.runtime.Nothing$> MissedAuth () { throw new RuntimeException(); }
  public  akka.actor.ActorSelection statsActorRef () { throw new RuntimeException(); }
  public  akka.actor.ActorSelection pluginsActorRef () { throw new RuntimeException(); }
  public  scala.Function1<spray.routing.RequestContext, scala.runtime.BoxedUnit> route () { throw new RuntimeException(); }
  public  scala.PartialFunction<java.lang.Object, scala.runtime.BoxedUnit> receive () { throw new RuntimeException(); }
}
