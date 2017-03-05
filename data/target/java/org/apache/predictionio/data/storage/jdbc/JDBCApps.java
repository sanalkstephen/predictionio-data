package org.apache.predictionio.data.storage.jdbc;
/** JDBC implementation of {@link Apps} */
public  class JDBCApps implements org.apache.predictionio.data.storage.Apps, grizzled.slf4j.Logging {
  public   JDBCApps (java.lang.String client, org.apache.predictionio.data.storage.StorageClientConfig config, java.lang.String prefix) { throw new RuntimeException(); }
  /** Database table name for this data access object */
  public  scalikejdbc.interpolation.SQLSyntax tableName () { throw new RuntimeException(); }
  public  scala.Option<java.lang.Object> insert (org.apache.predictionio.data.storage.App app) { throw new RuntimeException(); }
  public  scala.Option<org.apache.predictionio.data.storage.App> get (int id) { throw new RuntimeException(); }
  public  scala.Option<org.apache.predictionio.data.storage.App> getByName (java.lang.String name) { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.predictionio.data.storage.App> getAll () { throw new RuntimeException(); }
  public  void update (org.apache.predictionio.data.storage.App app) { throw new RuntimeException(); }
  public  void delete (int id) { throw new RuntimeException(); }
}
