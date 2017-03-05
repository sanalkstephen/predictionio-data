package org.apache.predictionio.data.storage.hdfs;
public  class StorageClient implements org.apache.predictionio.data.storage.BaseStorageClient, grizzled.slf4j.Logging {
  public  org.apache.predictionio.data.storage.StorageClientConfig config () { throw new RuntimeException(); }
  // not preceding
  public   StorageClient (org.apache.predictionio.data.storage.StorageClientConfig config) { throw new RuntimeException(); }
  public  java.lang.String prefix () { throw new RuntimeException(); }
  public  org.apache.hadoop.conf.Configuration conf () { throw new RuntimeException(); }
  public  org.apache.hadoop.fs.FileSystem fs () { throw new RuntimeException(); }
  public  org.apache.hadoop.fs.FileSystem client () { throw new RuntimeException(); }
}
