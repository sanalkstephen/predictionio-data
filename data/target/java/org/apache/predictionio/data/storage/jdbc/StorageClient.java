package org.apache.predictionio.data.storage.jdbc;
/** JDBC implementation of {@link BaseStorageClient} */
public  class StorageClient implements org.apache.predictionio.data.storage.BaseStorageClient, grizzled.slf4j.Logging {
  public  org.apache.predictionio.data.storage.StorageClientConfig config () { throw new RuntimeException(); }
  // not preceding
  public   StorageClient (org.apache.predictionio.data.storage.StorageClientConfig config) { throw new RuntimeException(); }
  public  java.lang.String prefix () { throw new RuntimeException(); }
  public  int maxSize () { throw new RuntimeException(); }
  public  scalikejdbc.ConnectionPoolSettings settings () { throw new RuntimeException(); }
  /** JDBC connection URL. Connections are managed by ScalikeJDBC. */
  public  java.lang.String client () { throw new RuntimeException(); }
}
