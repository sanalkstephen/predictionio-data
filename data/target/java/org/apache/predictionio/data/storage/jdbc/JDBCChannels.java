package org.apache.predictionio.data.storage.jdbc;
/** JDBC implementation of {@link Channels} */
public  class JDBCChannels implements org.apache.predictionio.data.storage.Channels, grizzled.slf4j.Logging {
  public   JDBCChannels (java.lang.String client, org.apache.predictionio.data.storage.StorageClientConfig config, java.lang.String prefix) { throw new RuntimeException(); }
  /** Database table name for this data access object */
  public  scalikejdbc.interpolation.SQLSyntax tableName () { throw new RuntimeException(); }
  public  scala.Option<java.lang.Object> insert (org.apache.predictionio.data.storage.Channel channel) { throw new RuntimeException(); }
  public  scala.Option<org.apache.predictionio.data.storage.Channel> get (int id) { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.predictionio.data.storage.Channel> getByAppid (int appid) { throw new RuntimeException(); }
  public  void delete (int id) { throw new RuntimeException(); }
  public  org.apache.predictionio.data.storage.Channel resultToChannel (scalikejdbc.WrappedResultSet rs) { throw new RuntimeException(); }
}
