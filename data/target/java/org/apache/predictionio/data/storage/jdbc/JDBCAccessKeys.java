package org.apache.predictionio.data.storage.jdbc;
/** JDBC implementation of {@link AccessKeys} */
public  class JDBCAccessKeys implements org.apache.predictionio.data.storage.AccessKeys, grizzled.slf4j.Logging {
  public   JDBCAccessKeys (java.lang.String client, org.apache.predictionio.data.storage.StorageClientConfig config, java.lang.String prefix) { throw new RuntimeException(); }
  /** Database table name for this data access object */
  public  scalikejdbc.interpolation.SQLSyntax tableName () { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> insert (org.apache.predictionio.data.storage.AccessKey accessKey) { throw new RuntimeException(); }
  public  scala.Option<org.apache.predictionio.data.storage.AccessKey> get (java.lang.String key) { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.predictionio.data.storage.AccessKey> getAll () { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.predictionio.data.storage.AccessKey> getByAppid (int appid) { throw new RuntimeException(); }
  public  void update (org.apache.predictionio.data.storage.AccessKey accessKey) { throw new RuntimeException(); }
  public  void delete (java.lang.String key) { throw new RuntimeException(); }
  /** Convert JDBC results to {@link AccessKey} */
  public  org.apache.predictionio.data.storage.AccessKey resultToAccessKey (scalikejdbc.WrappedResultSet rs) { throw new RuntimeException(); }
}
