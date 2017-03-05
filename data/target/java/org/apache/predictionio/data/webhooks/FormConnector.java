package org.apache.predictionio.data.webhooks;
/** Connector for Webhooks connection with Form submission data format
 */
public  interface FormConnector {
  /** Convert from original Form submission data to Event JObject
   * @param data Map of key-value pairs in String type received through webhooks
   * @return Event JObject
   */
  public  org.json4s.JsonAST.JObject toEventJson (scala.collection.immutable.Map<java.lang.String, java.lang.String> data) ;
}
