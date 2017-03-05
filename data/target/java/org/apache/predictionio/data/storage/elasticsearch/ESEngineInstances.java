package org.apache.predictionio.data.storage.elasticsearch;
public  class ESEngineInstances implements org.apache.predictionio.data.storage.EngineInstances, grizzled.slf4j.Logging {
  public   ESEngineInstances (org.elasticsearch.client.Client client, org.apache.predictionio.data.storage.StorageClientConfig config, java.lang.String index) { throw new RuntimeException(); }
  public  org.json4s.Formats formats () { throw new RuntimeException(); }
  private  java.lang.String estype () { throw new RuntimeException(); }
  public  org.elasticsearch.client.IndicesAdminClient indices () { throw new RuntimeException(); }
  public  org.elasticsearch.action.admin.indices.exists.indices.IndicesExistsResponse indexExistResponse () { throw new RuntimeException(); }
  public  org.elasticsearch.action.admin.indices.exists.types.TypesExistsResponse typeExistResponse () { throw new RuntimeException(); }
  public  java.lang.String insert (org.apache.predictionio.data.storage.EngineInstance i) { throw new RuntimeException(); }
  public  scala.Option<org.apache.predictionio.data.storage.EngineInstance> get (java.lang.String id) { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.predictionio.data.storage.EngineInstance> getAll () { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.predictionio.data.storage.EngineInstance> getCompleted (java.lang.String engineId, java.lang.String engineVersion, java.lang.String engineVariant) { throw new RuntimeException(); }
  public  scala.Option<org.apache.predictionio.data.storage.EngineInstance> getLatestCompleted (java.lang.String engineId, java.lang.String engineVersion, java.lang.String engineVariant) { throw new RuntimeException(); }
  public  void update (org.apache.predictionio.data.storage.EngineInstance i) { throw new RuntimeException(); }
  public  void delete (java.lang.String id) { throw new RuntimeException(); }
}
