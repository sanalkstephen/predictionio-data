package org.apache.predictionio.data.storage;
/** :: DeveloperApi ::
 * Any storage backend drivers will need to implement this trait with exactly
 * '''StorageClient''' as the class name. PredictionIO storage layer will look
 * for this class when it instantiates the actual backend for use by higher
 * level storage access APIs.
 * <p>
 * @group Storage System
 */
public  interface BaseStorageClient {
  /** Configuration of the '''StorageClient''' */
  public  org.apache.predictionio.data.storage.StorageClientConfig config () ;
  /** The actual client object. This could be a database connection or any kind
   * of database access object.
   */
  public  java.lang.Object client () ;
  /** Set a prefix for storage class discovery. As an example, if this prefix
   * is set as ''JDBC'', when the storage layer instantiates an implementation
   * of {@link Apps}, it will try to look for a class named ''JDBCApps''.
   */
  public  java.lang.String prefix () ;
}
