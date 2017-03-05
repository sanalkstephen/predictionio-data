package org.apache.predictionio.data.storage.cassandra;
public  class StorageClient implements org.apache.predictionio.data.storage.BaseStorageClient, grizzled.slf4j.Logging {
  public  org.apache.predictionio.data.storage.StorageClientConfig config () { throw new RuntimeException(); }
  // not preceding
  public   StorageClient (org.apache.predictionio.data.storage.StorageClientConfig config) { throw new RuntimeException(); }
  public  com.datastax.driver.core.Cluster cluster () { throw new RuntimeException(); }
  public  com.datastax.driver.core.Metadata metadata () { throw new RuntimeException(); }
  public  com.datastax.driver.core.Session session () { throw new RuntimeException(); }
  public  org.apache.predictionio.data.storage.cassandra.CassandraClient client () { throw new RuntimeException(); }
  public  java.lang.String prefix () { throw new RuntimeException(); }
}
