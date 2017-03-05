package org.apache.predictionio.data.storage.jdbc;
/** JDBC implementation of {@link Models} */
public  class JDBCModels implements org.apache.predictionio.data.storage.Models, grizzled.slf4j.Logging {
  public   JDBCModels (java.lang.String client, org.apache.predictionio.data.storage.StorageClientConfig config, java.lang.String prefix) { throw new RuntimeException(); }
  /** Database table name for this data access object */
  public  scalikejdbc.interpolation.SQLSyntax tableName () { throw new RuntimeException(); }
  /** Determines binary column type based on JDBC driver type */
  public  scalikejdbc.interpolation.SQLSyntax binaryColumnType () { throw new RuntimeException(); }
  public  void insert (org.apache.predictionio.data.storage.Model i) { throw new RuntimeException(); }
  public  scala.Option<org.apache.predictionio.data.storage.Model> get (java.lang.String id) { throw new RuntimeException(); }
  public  void delete (java.lang.String id) { throw new RuntimeException(); }
}
