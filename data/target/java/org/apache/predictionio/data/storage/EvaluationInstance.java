package org.apache.predictionio.data.storage;
/** :: DeveloperApi ::
 * Stores meta information for each evaluation instance.
 * <p>
 * @param id Instance ID.
 * @param status Status of this instance.
 * @param startTime Start time of this instance.
 * @param endTime End time of this instance.
 * @param evaluationClass Evaluation class name of this instance.
 * @param engineParamsGeneratorClass Engine parameters generator class name of this instance.
 * @param batch Batch label of this instance.
 * @param env The environment in which this instance was created.
 * @param evaluatorResults Results of the evaluator.
 * @param evaluatorResultsHTML HTML results of the evaluator.
 * @param evaluatorResultsJSON JSON results of the evaluator.
 * @group Meta Data
 */
public  class EvaluationInstance implements scala.Product, scala.Serializable {
  public  java.lang.String id () { throw new RuntimeException(); }
  public  java.lang.String status () { throw new RuntimeException(); }
  public  org.joda.time.DateTime startTime () { throw new RuntimeException(); }
  public  org.joda.time.DateTime endTime () { throw new RuntimeException(); }
  public  java.lang.String evaluationClass () { throw new RuntimeException(); }
  public  java.lang.String engineParamsGeneratorClass () { throw new RuntimeException(); }
  public  java.lang.String batch () { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, java.lang.String> env () { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, java.lang.String> sparkConf () { throw new RuntimeException(); }
  public  java.lang.String evaluatorResults () { throw new RuntimeException(); }
  public  java.lang.String evaluatorResultsHTML () { throw new RuntimeException(); }
  public  java.lang.String evaluatorResultsJSON () { throw new RuntimeException(); }
  // not preceding
  public   EvaluationInstance (java.lang.String id, java.lang.String status, org.joda.time.DateTime startTime, org.joda.time.DateTime endTime, java.lang.String evaluationClass, java.lang.String engineParamsGeneratorClass, java.lang.String batch, scala.collection.immutable.Map<java.lang.String, java.lang.String> env, scala.collection.immutable.Map<java.lang.String, java.lang.String> sparkConf, java.lang.String evaluatorResults, java.lang.String evaluatorResultsHTML, java.lang.String evaluatorResultsJSON) { throw new RuntimeException(); }
}
