package org.apache.predictionio.data.storage;
/** :: DeveloperApi ::
 * Base trait of the {@link AccessKey} data access object
 * <p>
 * @group Meta Data
 */
public  interface AccessKeys {
  /** Insert a new {@link AccessKey}. If the key field is empty, a key will be
   * generated.
   */
  public  scala.Option<java.lang.String> insert (org.apache.predictionio.data.storage.AccessKey k) ;
  /** Get an {@link AccessKey} by key */
  public  scala.Option<org.apache.predictionio.data.storage.AccessKey> get (java.lang.String k) ;
  /** Get all {@link AccessKey}s */
  public  scala.collection.Seq<org.apache.predictionio.data.storage.AccessKey> getAll () ;
  /** Get all {@link AccessKey}s for a particular app ID */
  public  scala.collection.Seq<org.apache.predictionio.data.storage.AccessKey> getByAppid (int appid) ;
  /** Update an {@link AccessKey} */
  public  void update (org.apache.predictionio.data.storage.AccessKey k) ;
  /** Delete an {@link AccessKey} */
  public  void delete (java.lang.String k) ;
  /** Default implementation of key generation */
  public  java.lang.String generateKey () ;
}
