package org.apache.predictionio.data.webhooks;
/** Connector for Webhooks connection */
public  interface JsonConnector {
  /** Convert from original JObject to Event JObject
   * @param data original JObject recevived through webhooks
   * @return Event JObject
   */
  public  org.json4s.JsonAST.JObject toEventJson (org.json4s.JsonAST.JObject data) ;
}
