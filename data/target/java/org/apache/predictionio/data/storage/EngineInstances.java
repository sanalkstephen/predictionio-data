package org.apache.predictionio.data.storage;
/** :: DeveloperApi ::
 * Base trait of the {@link EngineInstance} data access object
 * <p>
 * @group Meta Data
 */
public  interface EngineInstances {
  /** Insert a new {@link EngineInstance} */
  public  java.lang.String insert (org.apache.predictionio.data.storage.EngineInstance i) ;
  /** Get an {@link EngineInstance} by ID */
  public  scala.Option<org.apache.predictionio.data.storage.EngineInstance> get (java.lang.String id) ;
  /** Get all {@link EngineInstance}s */
  public  scala.collection.Seq<org.apache.predictionio.data.storage.EngineInstance> getAll () ;
  /** Get an instance that has started training the latest and has trained to
   * completion
   */
  public  scala.Option<org.apache.predictionio.data.storage.EngineInstance> getLatestCompleted (java.lang.String engineId, java.lang.String engineVersion, java.lang.String engineVariant) ;
  /** Get all instances that has trained to completion */
  public  scala.collection.Seq<org.apache.predictionio.data.storage.EngineInstance> getCompleted (java.lang.String engineId, java.lang.String engineVersion, java.lang.String engineVariant) ;
  /** Update an {@link EngineInstance} */
  public  void update (org.apache.predictionio.data.storage.EngineInstance i) ;
  /** Delete an {@link EngineInstance} */
  public  void delete (java.lang.String id) ;
}
