package org.apache.predictionio.data.storage;
/** :: DeveloperApi ::
 * Base trait of the {@link App} data access object
 * <p>
 * @group Meta Data
 */
public  interface Apps {
  /** Insert a new {@link App}. Returns a generated app ID if the supplied app ID is 0. */
  public  scala.Option<java.lang.Object> insert (org.apache.predictionio.data.storage.App app) ;
  /** Get an {@link App} by app ID */
  public  scala.Option<org.apache.predictionio.data.storage.App> get (int id) ;
  /** Get an {@link App} by app name */
  public  scala.Option<org.apache.predictionio.data.storage.App> getByName (java.lang.String name) ;
  /** Get all {@link App}s */
  public  scala.collection.Seq<org.apache.predictionio.data.storage.App> getAll () ;
  /** Update an {@link App} */
  public  void update (org.apache.predictionio.data.storage.App app) ;
  /** Delete an {@link App} */
  public  void delete (int id) ;
}
