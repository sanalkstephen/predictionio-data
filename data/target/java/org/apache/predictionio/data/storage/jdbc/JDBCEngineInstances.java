package org.apache.predictionio.data.storage.jdbc;
/** JDBC implementation of {@link EngineInstances} */
public  class JDBCEngineInstances implements org.apache.predictionio.data.storage.EngineInstances, grizzled.slf4j.Logging {
  public   JDBCEngineInstances (java.lang.String client, org.apache.predictionio.data.storage.StorageClientConfig config, java.lang.String prefix) { throw new RuntimeException(); }
  /** Database table name for this data access object */
  public  scalikejdbc.interpolation.SQLSyntax tableName () { throw new RuntimeException(); }
  public  java.lang.String insert (org.apache.predictionio.data.storage.EngineInstance i) { throw new RuntimeException(); }
  public  scala.Option<org.apache.predictionio.data.storage.EngineInstance> get (java.lang.String id) { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.predictionio.data.storage.EngineInstance> getAll () { throw new RuntimeException(); }
  public  scala.Option<org.apache.predictionio.data.storage.EngineInstance> getLatestCompleted (java.lang.String engineId, java.lang.String engineVersion, java.lang.String engineVariant) { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.predictionio.data.storage.EngineInstance> getCompleted (java.lang.String engineId, java.lang.String engineVersion, java.lang.String engineVariant) { throw new RuntimeException(); }
  public  void update (org.apache.predictionio.data.storage.EngineInstance i) { throw new RuntimeException(); }
  public  void delete (java.lang.String id) { throw new RuntimeException(); }
  /** Convert JDBC results to {@link EngineInstance} */
  public  org.apache.predictionio.data.storage.EngineInstance resultToEngineInstance (scalikejdbc.WrappedResultSet rs) { throw new RuntimeException(); }
}
