package org.apache.predictionio.data.storage.hbase;
public  class HBClient implements scala.Product, scala.Serializable {
  public  org.apache.hadoop.conf.Configuration conf () { throw new RuntimeException(); }
  public  org.apache.hadoop.hbase.client.HConnection connection () { throw new RuntimeException(); }
  public  org.apache.hadoop.hbase.client.HBaseAdmin admin () { throw new RuntimeException(); }
  // not preceding
  public   HBClient (org.apache.hadoop.conf.Configuration conf, org.apache.hadoop.hbase.client.HConnection connection, org.apache.hadoop.hbase.client.HBaseAdmin admin) { throw new RuntimeException(); }
}
