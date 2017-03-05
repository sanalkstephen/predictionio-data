package org.apache.predictionio.data.storage.elasticsearch;
/** Elasticsearch implementation of AccessKeys. */
public  class ESAccessKeys implements org.apache.predictionio.data.storage.AccessKeys, grizzled.slf4j.Logging {
  public   ESAccessKeys (org.elasticsearch.client.Client client, org.apache.predictionio.data.storage.StorageClientConfig config, java.lang.String index) { throw new RuntimeException(); }
  public  org.json4s.Formats formats () { throw new RuntimeException(); }
  private  java.lang.String estype () { throw new RuntimeException(); }
  public  org.elasticsearch.client.IndicesAdminClient indices () { throw new RuntimeException(); }
  public  org.elasticsearch.action.admin.indices.exists.indices.IndicesExistsResponse indexExistResponse () { throw new RuntimeException(); }
  public  org.elasticsearch.action.admin.indices.exists.types.TypesExistsResponse typeExistResponse () { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> insert (org.apache.predictionio.data.storage.AccessKey accessKey) { throw new RuntimeException(); }
  public  scala.Option<org.apache.predictionio.data.storage.AccessKey> get (java.lang.String key) { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.predictionio.data.storage.AccessKey> getAll () { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.predictionio.data.storage.AccessKey> getByAppid (int appid) { throw new RuntimeException(); }
  public  void update (org.apache.predictionio.data.storage.AccessKey accessKey) { throw new RuntimeException(); }
  public  void delete (java.lang.String key) { throw new RuntimeException(); }
}
