package org.apache.predictionio.data.webhooks;
/** Webhooks Connnector Exception
 * <p>
 * @param message the detail message
 * @param cause the cause
 */
public  class ConnectorException extends java.lang.Exception {
  public   ConnectorException (java.lang.String message, java.lang.Throwable cause) { throw new RuntimeException(); }
  /** Webhooks Connnector Exception with cause being set to null
   * <p>
   * @param message the detail message
   */
  public   ConnectorException (java.lang.String message) { throw new RuntimeException(); }
}
