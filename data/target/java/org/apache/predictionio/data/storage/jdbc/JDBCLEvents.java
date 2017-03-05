package org.apache.predictionio.data.storage.jdbc;
/** JDBC implementation of {@link LEvents} */
public  class JDBCLEvents implements org.apache.predictionio.data.storage.LEvents, grizzled.slf4j.Logging {
  public   JDBCLEvents (java.lang.String client, org.apache.predictionio.data.storage.StorageClientConfig config, java.lang.String namespace) { throw new RuntimeException(); }
  private  org.json4s.DefaultFormats$ formats () { throw new RuntimeException(); }
  public  boolean init (int appId, scala.Option<java.lang.Object> channelId) { throw new RuntimeException(); }
  public  boolean remove (int appId, scala.Option<java.lang.Object> channelId) { throw new RuntimeException(); }
  public  void close () { throw new RuntimeException(); }
  public  scala.concurrent.Future<java.lang.String> futureInsert (org.apache.predictionio.data.storage.Event event, int appId, scala.Option<java.lang.Object> channelId, scala.concurrent.ExecutionContext ec) { throw new RuntimeException(); }
  public  scala.concurrent.Future<scala.Option<org.apache.predictionio.data.storage.Event>> futureGet (java.lang.String eventId, int appId, scala.Option<java.lang.Object> channelId, scala.concurrent.ExecutionContext ec) { throw new RuntimeException(); }
  public  scala.concurrent.Future<java.lang.Object> futureDelete (java.lang.String eventId, int appId, scala.Option<java.lang.Object> channelId, scala.concurrent.ExecutionContext ec) { throw new RuntimeException(); }
  public  scala.concurrent.Future<scala.collection.Iterator<org.apache.predictionio.data.storage.Event>> futureFind (int appId, scala.Option<java.lang.Object> channelId, scala.Option<org.joda.time.DateTime> startTime, scala.Option<org.joda.time.DateTime> untilTime, scala.Option<java.lang.String> entityType, scala.Option<java.lang.String> entityId, scala.Option<scala.collection.Seq<java.lang.String>> eventNames, scala.Option<scala.Option<java.lang.String>> targetEntityType, scala.Option<scala.Option<java.lang.String>> targetEntityId, scala.Option<java.lang.Object> limit, scala.Option<java.lang.Object> reversed, scala.concurrent.ExecutionContext ec) { throw new RuntimeException(); }
  public  org.apache.predictionio.data.storage.Event resultToEvent (scalikejdbc.WrappedResultSet rs) { throw new RuntimeException(); }
}
