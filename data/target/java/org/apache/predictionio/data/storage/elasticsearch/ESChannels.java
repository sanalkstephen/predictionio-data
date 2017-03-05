package org.apache.predictionio.data.storage.elasticsearch;
public  class ESChannels implements org.apache.predictionio.data.storage.Channels, grizzled.slf4j.Logging {
  public   ESChannels (org.elasticsearch.client.Client client, org.apache.predictionio.data.storage.StorageClientConfig config, java.lang.String index) { throw new RuntimeException(); }
  public  org.json4s.Formats formats () { throw new RuntimeException(); }
  private  java.lang.String estype () { throw new RuntimeException(); }
  private  org.apache.predictionio.data.storage.elasticsearch.ESSequences seq () { throw new RuntimeException(); }
  private  java.lang.String seqName () { throw new RuntimeException(); }
  public  org.elasticsearch.client.IndicesAdminClient indices () { throw new RuntimeException(); }
  public  org.elasticsearch.action.admin.indices.exists.indices.IndicesExistsResponse indexExistResponse () { throw new RuntimeException(); }
  public  org.elasticsearch.action.admin.indices.exists.types.TypesExistsResponse typeExistResponse () { throw new RuntimeException(); }
  public  scala.Option<java.lang.Object> insert (org.apache.predictionio.data.storage.Channel channel) { throw new RuntimeException(); }
  public  scala.Option<org.apache.predictionio.data.storage.Channel> get (int id) { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.predictionio.data.storage.Channel> getByAppid (int appid) { throw new RuntimeException(); }
  public  boolean update (org.apache.predictionio.data.storage.Channel channel) { throw new RuntimeException(); }
  public  void delete (int id) { throw new RuntimeException(); }
}
