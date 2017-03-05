package org.apache.predictionio.data.view;
public  class LBatchView {
  public  int appId () { throw new RuntimeException(); }
  public  scala.Option<org.joda.time.DateTime> startTime () { throw new RuntimeException(); }
  public  scala.Option<org.joda.time.DateTime> untilTime () { throw new RuntimeException(); }
  // not preceding
  public   LBatchView (int appId, scala.Option<org.joda.time.DateTime> startTime, scala.Option<org.joda.time.DateTime> untilTime) { throw new RuntimeException(); }
  public  org.apache.predictionio.data.storage.LEvents eventsDb () { throw new RuntimeException(); }
  public  scala.collection.immutable.List<org.apache.predictionio.data.storage.Event> _events () { throw new RuntimeException(); }
  public  org.apache.predictionio.data.view.EventSeq events () { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, org.apache.predictionio.data.storage.DataMap> aggregateProperties (java.lang.String entityType, scala.Option<org.joda.time.DateTime> startTimeOpt, scala.Option<org.joda.time.DateTime> untilTimeOpt) { throw new RuntimeException(); }
}
