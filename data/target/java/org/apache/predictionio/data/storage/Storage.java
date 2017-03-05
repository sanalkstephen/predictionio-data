package org.apache.predictionio.data.storage;
// no position
/** Backend-agnostic data storage layer with lazy initialization. Use this
 * object when you need to interface with Event Store in your engine.
 * <p>
 * @group Storage System
 */
public  class Storage implements grizzled.slf4j.Logging {
  static private  class ClientMeta implements scala.Product, scala.Serializable {
    public  java.lang.String sourceType () { throw new RuntimeException(); }
    public  org.apache.predictionio.data.storage.BaseStorageClient client () { throw new RuntimeException(); }
    public  org.apache.predictionio.data.storage.StorageClientConfig config () { throw new RuntimeException(); }
    // not preceding
    public   ClientMeta (java.lang.String sourceType, org.apache.predictionio.data.storage.BaseStorageClient client, org.apache.predictionio.data.storage.StorageClientConfig config) { throw new RuntimeException(); }
  }
  // no position
  static private  class ClientMeta$ extends scala.runtime.AbstractFunction3<java.lang.String, org.apache.predictionio.data.storage.BaseStorageClient, org.apache.predictionio.data.storage.StorageClientConfig, org.apache.predictionio.data.storage.Storage.ClientMeta> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final ClientMeta$ MODULE$ = null;
    public   ClientMeta$ () { throw new RuntimeException(); }
  }
  static private  class DataObjectMeta implements scala.Product, scala.Serializable {
    public  java.lang.String sourceName () { throw new RuntimeException(); }
    public  java.lang.String namespace () { throw new RuntimeException(); }
    // not preceding
    public   DataObjectMeta (java.lang.String sourceName, java.lang.String namespace) { throw new RuntimeException(); }
  }
  // no position
  static private  class DataObjectMeta$ extends scala.runtime.AbstractFunction2<java.lang.String, java.lang.String, org.apache.predictionio.data.storage.Storage.DataObjectMeta> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final DataObjectMeta$ MODULE$ = null;
    public   DataObjectMeta$ () { throw new RuntimeException(); }
  }
  static private  int errors () { throw new RuntimeException(); }
  static private  java.lang.String sourcesPrefix () { throw new RuntimeException(); }
  static private  scala.util.matching.Regex sourceTypesRegex () { throw new RuntimeException(); }
  static private  scala.collection.Seq<java.lang.String> sourceKeys () { throw new RuntimeException(); }
  static private  scala.collection.mutable.Map<java.lang.String, scala.Option<org.apache.predictionio.data.storage.Storage.ClientMeta>> s2cm () { throw new RuntimeException(); }
  /** Reference to the app data repository. */
  static private  java.lang.String EventDataRepository () { throw new RuntimeException(); }
  static private  java.lang.String ModelDataRepository () { throw new RuntimeException(); }
  static private  java.lang.String MetaDataRepository () { throw new RuntimeException(); }
  static private  java.lang.String repositoriesPrefix () { throw new RuntimeException(); }
  static private  scala.util.matching.Regex repositoryNamesRegex () { throw new RuntimeException(); }
  static private  scala.collection.Seq<java.lang.String> repositoryKeys () { throw new RuntimeException(); }
  static private  scala.collection.Seq<java.lang.String> requiredRepositories () { throw new RuntimeException(); }
  static private  scala.collection.immutable.Map<java.lang.String, org.apache.predictionio.data.storage.Storage.DataObjectMeta> repositoriesToDataObjectMeta () { throw new RuntimeException(); }
  static private  java.lang.String prefixPath (java.lang.String prefix, java.lang.String body) { throw new RuntimeException(); }
  static private  java.lang.String sourcesPrefixPath (java.lang.String body) { throw new RuntimeException(); }
  static private  java.lang.String repositoriesPrefixPath (java.lang.String body) { throw new RuntimeException(); }
  static private  scala.Option<org.apache.predictionio.data.storage.Storage.ClientMeta> sourcesToClientMeta (java.lang.String source, boolean parallel, boolean test) { throw new RuntimeException(); }
  static private  org.apache.predictionio.data.storage.BaseStorageClient getClient (org.apache.predictionio.data.storage.StorageClientConfig clientConfig, java.lang.String pkg) { throw new RuntimeException(); }
  /** Get the StorageClient config data from PIO Framework's environment variables */
  static public  scala.Option<org.apache.predictionio.data.storage.StorageClientConfig> getConfig (java.lang.String sourceName) { throw new RuntimeException(); }
  static private  scala.Option<org.apache.predictionio.data.storage.Storage.ClientMeta> updateS2CM (java.lang.String k, boolean parallel, boolean test) { throw new RuntimeException(); }
  static public <T extends java.lang.Object> T getDataObjectFromRepo (java.lang.String repo, boolean test, scala.reflect.api.TypeTags.TypeTag<T> tag) { throw new RuntimeException(); }
  static public <T extends java.lang.Object> T getPDataObject (java.lang.String repo, scala.reflect.api.TypeTags.TypeTag<T> tag) { throw new RuntimeException(); }
  static public <T extends java.lang.Object> T getDataObject (java.lang.String sourceName, java.lang.String namespace, boolean parallel, boolean test, scala.reflect.api.TypeTags.TypeTag<T> tag) { throw new RuntimeException(); }
  static private <T extends java.lang.Object> T getPDataObject (java.lang.String sourceName, java.lang.String databaseName, scala.reflect.api.TypeTags.TypeTag<T> tag) { throw new RuntimeException(); }
  static private  scala.collection.Seq<java.lang.Object> dataObjectCtorArgs (org.apache.predictionio.data.storage.BaseStorageClient client, java.lang.String namespace) { throw new RuntimeException(); }
  static public  void verifyAllDataObjects () { throw new RuntimeException(); }
  static public  org.apache.predictionio.data.storage.EngineManifests getMetaDataEngineManifests () { throw new RuntimeException(); }
  static public  org.apache.predictionio.data.storage.EngineInstances getMetaDataEngineInstances () { throw new RuntimeException(); }
  static public  org.apache.predictionio.data.storage.EvaluationInstances getMetaDataEvaluationInstances () { throw new RuntimeException(); }
  static public  org.apache.predictionio.data.storage.Apps getMetaDataApps () { throw new RuntimeException(); }
  static public  org.apache.predictionio.data.storage.AccessKeys getMetaDataAccessKeys () { throw new RuntimeException(); }
  static public  org.apache.predictionio.data.storage.Channels getMetaDataChannels () { throw new RuntimeException(); }
  static public  org.apache.predictionio.data.storage.Models getModelDataModels () { throw new RuntimeException(); }
  /** Obtains a data access object that returns {@link Event} related local data
   * structure.
   */
  static public  org.apache.predictionio.data.storage.LEvents getLEvents (boolean test) { throw new RuntimeException(); }
  /** Obtains a data access object that returns {@link Event} related RDD data
   * structure.
   */
  static public  org.apache.predictionio.data.storage.PEvents getPEvents () { throw new RuntimeException(); }
  static public  scala.collection.immutable.Map<java.lang.String, scala.collection.immutable.Map<java.lang.String, scala.collection.immutable.Map<java.lang.String, java.lang.String>>> config () { throw new RuntimeException(); }
}
