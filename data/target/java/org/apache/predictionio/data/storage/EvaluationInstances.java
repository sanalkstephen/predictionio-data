package org.apache.predictionio.data.storage;
/** :: DeveloperApi ::
 * Base trait of the {@link EvaluationInstance} data access object
 * <p>
 * @group Meta Data
 */
public  interface EvaluationInstances {
  /** Insert a new {@link EvaluationInstance} */
  public  java.lang.String insert (org.apache.predictionio.data.storage.EvaluationInstance i) ;
  /** Get an {@link EvaluationInstance} by ID */
  public  scala.Option<org.apache.predictionio.data.storage.EvaluationInstance> get (java.lang.String id) ;
  /** Get all {@link EvaluationInstances} */
  public  scala.collection.Seq<org.apache.predictionio.data.storage.EvaluationInstance> getAll () ;
  /** Get instances that are produced by evaluation and have run to completion,
   * reverse sorted by the start time
   */
  public  scala.collection.Seq<org.apache.predictionio.data.storage.EvaluationInstance> getCompleted () ;
  /** Update an {@link EvaluationInstance} */
  public  void update (org.apache.predictionio.data.storage.EvaluationInstance i) ;
  /** Delete an {@link EvaluationInstance} */
  public  void delete (java.lang.String id) ;
}
