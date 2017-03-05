package org.apache.predictionio.data.storage;
/** :: DeveloperApi ::
 * Stores model for each engine instance
 * <p>
 * @param id ID of the model, which should be the same as engine instance ID
 * @param models Trained models of all algorithms
 * @group Model Data
 */
public  class Model implements scala.Product, scala.Serializable {
  public  java.lang.String id () { throw new RuntimeException(); }
  public  byte[] models () { throw new RuntimeException(); }
  // not preceding
  public   Model (java.lang.String id, byte[] models) { throw new RuntimeException(); }
}
