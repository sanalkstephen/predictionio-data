package org.apache.predictionio.data.storage;
/** :: DeveloperApi ::
 * A wrapper of storage client configuration that will be populated by
 * PredictionIO automatically, and passed to the StorageClient during
 * instantiation.
 * <p>
 * @param parallel   This is set to true by PredictionIO when the storage client
 *                   is instantiated in a parallel data source.
 * @param test       This is set to true by PredictionIO when tests are being run.
 * @param properties This is populated by PredictionIO automatically from
 *                   environmental configuration variables. If you have these
 *                   variables,
 *                   - PIO_STORAGE_SOURCES_PGSQL_TYPE=jdbc
 *                   - PIO_STORAGE_SOURCES_PGSQL_USERNAME=abc
 *                   - PIO_STOARGE_SOURCES_PGSQL_PASSWORD=xyz
 * <p>
 *                   this field will be filled as a map of string to string:
 *                   - TYPE -> jdbc
 *                   - USERNAME -> abc
 *                   - PASSWORD -> xyz
 * @group Storage System
 */
public  class StorageClientConfig implements scala.Product, scala.Serializable {
  public  boolean parallel () { throw new RuntimeException(); }
  public  boolean test () { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, java.lang.String> properties () { throw new RuntimeException(); }
  // not preceding
  public   StorageClientConfig (boolean parallel, boolean test, scala.collection.immutable.Map<java.lang.String, java.lang.String> properties) { throw new RuntimeException(); }
}
