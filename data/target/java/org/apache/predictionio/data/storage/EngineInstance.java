package org.apache.predictionio.data.storage;
/** :: DeveloperApi ::
 * Stores parameters, model, and other information for each engine instance
 * <p>
 * @param id Engine instance ID.
 * @param status Status of the engine instance.
 * @param startTime Start time of the training/evaluation.
 * @param endTime End time of the training/evaluation.
 * @param engineId Engine ID of the instance.
 * @param engineVersion Engine version of the instance.
 * @param engineVariant Engine variant ID of the instance.
 * @param engineFactory Engine factory class for the instance.
 * @param batch A batch label of the engine instance.
 * @param env The environment in which the instance was created.
 * @param sparkConf Custom Spark configuration of the instance.
 * @param dataSourceParams Data source parameters of the instance.
 * @param preparatorParams Preparator parameters of the instance.
 * @param algorithmsParams Algorithms parameters of the instance.
 * @param servingParams Serving parameters of the instance.
 * @group Meta Data
 */
public  class EngineInstance implements scala.Product, scala.Serializable {
  public  java.lang.String id () { throw new RuntimeException(); }
  public  java.lang.String status () { throw new RuntimeException(); }
  public  org.joda.time.DateTime startTime () { throw new RuntimeException(); }
  public  org.joda.time.DateTime endTime () { throw new RuntimeException(); }
  public  java.lang.String engineId () { throw new RuntimeException(); }
  public  java.lang.String engineVersion () { throw new RuntimeException(); }
  public  java.lang.String engineVariant () { throw new RuntimeException(); }
  public  java.lang.String engineFactory () { throw new RuntimeException(); }
  public  java.lang.String batch () { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, java.lang.String> env () { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, java.lang.String> sparkConf () { throw new RuntimeException(); }
  public  java.lang.String dataSourceParams () { throw new RuntimeException(); }
  public  java.lang.String preparatorParams () { throw new RuntimeException(); }
  public  java.lang.String algorithmsParams () { throw new RuntimeException(); }
  public  java.lang.String servingParams () { throw new RuntimeException(); }
  // not preceding
  public   EngineInstance (java.lang.String id, java.lang.String status, org.joda.time.DateTime startTime, org.joda.time.DateTime endTime, java.lang.String engineId, java.lang.String engineVersion, java.lang.String engineVariant, java.lang.String engineFactory, java.lang.String batch, scala.collection.immutable.Map<java.lang.String, java.lang.String> env, scala.collection.immutable.Map<java.lang.String, java.lang.String> sparkConf, java.lang.String dataSourceParams, java.lang.String preparatorParams, java.lang.String algorithmsParams, java.lang.String servingParams) { throw new RuntimeException(); }
}
