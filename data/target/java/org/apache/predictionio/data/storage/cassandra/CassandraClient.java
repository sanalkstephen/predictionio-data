package org.apache.predictionio.data.storage.cassandra;
public  class CassandraClient implements scala.Product, scala.Serializable {
  public  com.datastax.driver.core.Cluster cluster () { throw new RuntimeException(); }
  public  com.datastax.driver.core.Session session () { throw new RuntimeException(); }
  // not preceding
  public   CassandraClient (com.datastax.driver.core.Cluster cluster, com.datastax.driver.core.Session session) { throw new RuntimeException(); }
}
