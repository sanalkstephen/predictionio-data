package org.apache.predictionio.data.storage.hdfs;
public  class HDFSModels implements org.apache.predictionio.data.storage.Models, grizzled.slf4j.Logging {
  public   HDFSModels (org.apache.hadoop.fs.FileSystem fs, org.apache.predictionio.data.storage.StorageClientConfig config, java.lang.String prefix) { throw new RuntimeException(); }
  public  void insert (org.apache.predictionio.data.storage.Model i) { throw new RuntimeException(); }
  public  scala.Option<org.apache.predictionio.data.storage.Model> get (java.lang.String id) { throw new RuntimeException(); }
  public  void delete (java.lang.String id) { throw new RuntimeException(); }
}
