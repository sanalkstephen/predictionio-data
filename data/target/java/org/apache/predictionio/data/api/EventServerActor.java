package org.apache.predictionio.data.api;
public  class EventServerActor implements akka.actor.Actor, akka.actor.ActorLogging {
  public  org.apache.predictionio.data.storage.LEvents eventClient () { throw new RuntimeException(); }
  public  org.apache.predictionio.data.storage.AccessKeys accessKeysClient () { throw new RuntimeException(); }
  public  org.apache.predictionio.data.storage.Channels channelsClient () { throw new RuntimeException(); }
  public  org.apache.predictionio.data.api.EventServerConfig config () { throw new RuntimeException(); }
  // not preceding
  public   EventServerActor (org.apache.predictionio.data.storage.LEvents eventClient, org.apache.predictionio.data.storage.AccessKeys accessKeysClient, org.apache.predictionio.data.storage.Channels channelsClient, org.apache.predictionio.data.api.EventServerConfig config) { throw new RuntimeException(); }
  public  akka.actor.ActorRef child () { throw new RuntimeException(); }
  public  akka.actor.ActorSystem system () { throw new RuntimeException(); }
  public  scala.PartialFunction<java.lang.Object, scala.runtime.BoxedUnit> receive () { throw new RuntimeException(); }
}
