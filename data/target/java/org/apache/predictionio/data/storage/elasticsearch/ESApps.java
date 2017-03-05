package org.apache.predictionio.data.storage.elasticsearch;
/** Elasticsearch implementation of Items. */
public  class ESApps implements org.apache.predictionio.data.storage.Apps, grizzled.slf4j.Logging {
  public   ESApps (org.elasticsearch.client.Client client, org.apache.predictionio.data.storage.StorageClientConfig config, java.lang.String index) { throw new RuntimeException(); }
  public  org.json4s.Formats formats () { throw new RuntimeException(); }
  private  java.lang.String estype () { throw new RuntimeException(); }
  private  org.apache.predictionio.data.storage.elasticsearch.ESSequences seq () { throw new RuntimeException(); }
  public  org.elasticsearch.client.IndicesAdminClient indices () { throw new RuntimeException(); }
  public  org.elasticsearch.action.admin.indices.exists.indices.IndicesExistsResponse indexExistResponse () { throw new RuntimeException(); }
  public  org.elasticsearch.action.admin.indices.exists.types.TypesExistsResponse typeExistResponse () { throw new RuntimeException(); }
  public  scala.Option<java.lang.Object> insert (org.apache.predictionio.data.storage.App app) { throw new RuntimeException(); }
  public  scala.Option<org.apache.predictionio.data.storage.App> get (int id) { throw new RuntimeException(); }
  public  scala.Option<org.apache.predictionio.data.storage.App> getByName (java.lang.String name) { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.predictionio.data.storage.App> getAll () { throw new RuntimeException(); }
  public  void update (org.apache.predictionio.data.storage.App app) { throw new RuntimeException(); }
  public  void delete (int id) { throw new RuntimeException(); }
}
