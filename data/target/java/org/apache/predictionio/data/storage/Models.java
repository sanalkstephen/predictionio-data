package org.apache.predictionio.data.storage;
/** :: DeveloperApi ::
 * Base trait for of the {@link Model} data access object
 * <p>
 * @group Model Data
 */
public  interface Models {
  /** Insert a new {@link Model} */
  public  void insert (org.apache.predictionio.data.storage.Model i) ;
  /** Get a {@link Model} by ID */
  public  scala.Option<org.apache.predictionio.data.storage.Model> get (java.lang.String id) ;
  /** Delete a {@link Model} */
  public  void delete (java.lang.String id) ;
}
