package org.apache.predictionio.data.storage.elasticsearch;
public  class ESEngineManifests implements org.apache.predictionio.data.storage.EngineManifests, grizzled.slf4j.Logging {
  public   ESEngineManifests (org.elasticsearch.client.Client client, org.apache.predictionio.data.storage.StorageClientConfig config, java.lang.String index) { throw new RuntimeException(); }
  public  org.json4s.Formats formats () { throw new RuntimeException(); }
  private  java.lang.String estype () { throw new RuntimeException(); }
  private  java.lang.String esid (java.lang.String id, java.lang.String version) { throw new RuntimeException(); }
  public  void insert (org.apache.predictionio.data.storage.EngineManifest engineManifest) { throw new RuntimeException(); }
  public  scala.Option<org.apache.predictionio.data.storage.EngineManifest> get (java.lang.String id, java.lang.String version) { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.predictionio.data.storage.EngineManifest> getAll () { throw new RuntimeException(); }
  public  void update (org.apache.predictionio.data.storage.EngineManifest engineManifest, boolean upsert) { throw new RuntimeException(); }
  public  void delete (java.lang.String id, java.lang.String version) { throw new RuntimeException(); }
}
