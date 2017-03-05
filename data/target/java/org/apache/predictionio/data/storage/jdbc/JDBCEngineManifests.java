package org.apache.predictionio.data.storage.jdbc;
/** JDBC implementation of {@link EngineManifests} */
public  class JDBCEngineManifests implements org.apache.predictionio.data.storage.EngineManifests, grizzled.slf4j.Logging {
  public   JDBCEngineManifests (java.lang.String client, org.apache.predictionio.data.storage.StorageClientConfig config, java.lang.String prefix) { throw new RuntimeException(); }
  /** Database table name for this data access object */
  public  scalikejdbc.interpolation.SQLSyntax tableName () { throw new RuntimeException(); }
  public  void insert (org.apache.predictionio.data.storage.EngineManifest m) { throw new RuntimeException(); }
  public  scala.Option<org.apache.predictionio.data.storage.EngineManifest> get (java.lang.String id, java.lang.String version) { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.predictionio.data.storage.EngineManifest> getAll () { throw new RuntimeException(); }
  public  void update (org.apache.predictionio.data.storage.EngineManifest m, boolean upsert) { throw new RuntimeException(); }
  public  void delete (java.lang.String id, java.lang.String version) { throw new RuntimeException(); }
  /** Convert JDBC results to {@link EngineManifest} */
  public  org.apache.predictionio.data.storage.EngineManifest resultToEngineManifest (scalikejdbc.WrappedResultSet rs) { throw new RuntimeException(); }
}
