package org.apache.predictionio.data.storage;
/** :: DeveloperApi ::
 * Thrown by data access objects when they run into exceptional conditions
 * <p>
 * @param message Exception error message
 * @param cause   The underlying exception that caused the exception
 * @group Storage System
 */
public  class StorageException extends java.lang.Exception {
  public   StorageException (java.lang.String message, java.lang.Throwable cause) { throw new RuntimeException(); }
  public   StorageException (java.lang.String message) { throw new RuntimeException(); }
}
