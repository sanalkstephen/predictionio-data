package org.apache.predictionio.data.api;
public  class StatsActor implements akka.actor.Actor {
  public   StatsActor () { throw new RuntimeException(); }
  public  akka.actor.ActorSystem system () { throw new RuntimeException(); }
  public  akka.event.LoggingAdapter log () { throw new RuntimeException(); }
  public  org.joda.time.DateTime getCurrent () { throw new RuntimeException(); }
  public  org.apache.predictionio.data.api.Stats longLiveStats () { throw new RuntimeException(); }
  public  org.apache.predictionio.data.api.Stats hourlyStats () { throw new RuntimeException(); }
  public  org.apache.predictionio.data.api.Stats prevHourlyStats () { throw new RuntimeException(); }
  public  void bookkeeping (int appId, spray.http.StatusCode statusCode, org.apache.predictionio.data.storage.Event event) { throw new RuntimeException(); }
  public  scala.PartialFunction<java.lang.Object, scala.runtime.BoxedUnit> receive () { throw new RuntimeException(); }
}
