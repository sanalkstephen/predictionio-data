package org.apache.predictionio.data.storage.jdbc;
/** JDBC implementations of {@link EvaluationInstances} */
public  class JDBCEvaluationInstances implements org.apache.predictionio.data.storage.EvaluationInstances, grizzled.slf4j.Logging {
  public   JDBCEvaluationInstances (java.lang.String client, org.apache.predictionio.data.storage.StorageClientConfig config, java.lang.String prefix) { throw new RuntimeException(); }
  /** Database table name for this data access object */
  public  scalikejdbc.interpolation.SQLSyntax tableName () { throw new RuntimeException(); }
  public  java.lang.String insert (org.apache.predictionio.data.storage.EvaluationInstance i) { throw new RuntimeException(); }
  public  scala.Option<org.apache.predictionio.data.storage.EvaluationInstance> get (java.lang.String id) { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.predictionio.data.storage.EvaluationInstance> getAll () { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.predictionio.data.storage.EvaluationInstance> getCompleted () { throw new RuntimeException(); }
  public  void update (org.apache.predictionio.data.storage.EvaluationInstance i) { throw new RuntimeException(); }
  public  void delete (java.lang.String id) { throw new RuntimeException(); }
  /** Convert JDBC results to {@link EvaluationInstance} */
  public  org.apache.predictionio.data.storage.EvaluationInstance resultToEvaluationInstance (scalikejdbc.WrappedResultSet rs) { throw new RuntimeException(); }
}
