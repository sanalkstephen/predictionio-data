package org.apache.predictionio.data.storage.hbase;
public  class StorageClient implements org.apache.predictionio.data.storage.BaseStorageClient, grizzled.slf4j.Logging {
  public  org.apache.predictionio.data.storage.StorageClientConfig config () { throw new RuntimeException(); }
  // not preceding
  public   StorageClient (org.apache.predictionio.data.storage.StorageClientConfig config) { throw new RuntimeException(); }
  public  org.apache.hadoop.conf.Configuration conf () { throw new RuntimeException(); }
  public  org.apache.hadoop.hbase.client.HConnection connection () { throw new RuntimeException(); }
  public  org.apache.predictionio.data.storage.hbase.HBClient client () { throw new RuntimeException(); }
  public  java.lang.String prefix () { throw new RuntimeException(); }
}
