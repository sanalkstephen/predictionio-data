package org.apache.predictionio.data.view;
public  class EventSeq {
  static public  scala.collection.immutable.List<org.apache.predictionio.data.storage.Event> eventSeqToList (org.apache.predictionio.data.view.EventSeq es) { throw new RuntimeException(); }
  static public  org.apache.predictionio.data.view.EventSeq listToEventSeq (scala.collection.immutable.List<org.apache.predictionio.data.storage.Event> l) { throw new RuntimeException(); }
  public  scala.collection.immutable.List<org.apache.predictionio.data.storage.Event> events () { throw new RuntimeException(); }
  // not preceding
  public   EventSeq (scala.collection.immutable.List<org.apache.predictionio.data.storage.Event> events) { throw new RuntimeException(); }
  public  org.apache.predictionio.data.view.EventSeq filter (scala.Option<java.lang.String> eventOpt, scala.Option<java.lang.String> entityTypeOpt, scala.Option<org.joda.time.DateTime> startTimeOpt, scala.Option<org.joda.time.DateTime> untilTimeOpt) { throw new RuntimeException(); }
  public  org.apache.predictionio.data.view.EventSeq filter (scala.Function1<org.apache.predictionio.data.storage.Event, java.lang.Object> p) { throw new RuntimeException(); }
  public <T extends java.lang.Object> scala.collection.immutable.Map<java.lang.String, T> aggregateByEntityOrdered (T init, scala.Function2<T, org.apache.predictionio.data.storage.Event, T> op) { throw new RuntimeException(); }
}
