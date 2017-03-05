package org.apache.predictionio.data.storage;
/** :: DeveloperApi ::
 * Base trait of the {@link EngineManifest} data access object
 * <p>
 * @group Meta Data
 */
public  interface EngineManifests {
  /** Inserts an {@link EngineManifest} */
  public  void insert (org.apache.predictionio.data.storage.EngineManifest engineManifest) ;
  /** Get an {@link EngineManifest} by its ID */
  public  scala.Option<org.apache.predictionio.data.storage.EngineManifest> get (java.lang.String id, java.lang.String version) ;
  /** Get all {@link EngineManifest} */
  public  scala.collection.Seq<org.apache.predictionio.data.storage.EngineManifest> getAll () ;
  /** Updates an {@link EngineManifest} */
  public  void update (org.apache.predictionio.data.storage.EngineManifest engineInfo, boolean upsert) ;
  /** Delete an {@link EngineManifest} by its ID */
  public  void delete (java.lang.String id, java.lang.String version) ;
}
