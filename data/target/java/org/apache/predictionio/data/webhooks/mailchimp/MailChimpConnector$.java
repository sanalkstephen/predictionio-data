package org.apache.predictionio.data.webhooks.mailchimp;
// no position
public  class MailChimpConnector$ implements org.apache.predictionio.data.webhooks.FormConnector {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final MailChimpConnector$ MODULE$ = null;
  public   MailChimpConnector$ () { throw new RuntimeException(); }
  public  org.json4s.JsonAST.JObject toEventJson (scala.collection.immutable.Map<java.lang.String, java.lang.String> data) { throw new RuntimeException(); }
  public  org.joda.time.format.DateTimeFormatter mailChimpDateTimeFormat () { throw new RuntimeException(); }
  public  org.joda.time.DateTime parseMailChimpDateTime (java.lang.String s) { throw new RuntimeException(); }
  public  org.json4s.JsonAST.JObject subscribeToEventJson (scala.collection.immutable.Map<java.lang.String, java.lang.String> data) { throw new RuntimeException(); }
  public  org.json4s.JsonAST.JObject unsubscribeToEventJson (scala.collection.immutable.Map<java.lang.String, java.lang.String> data) { throw new RuntimeException(); }
  public  org.json4s.JsonAST.JObject profileToEventJson (scala.collection.immutable.Map<java.lang.String, java.lang.String> data) { throw new RuntimeException(); }
  public  org.json4s.JsonAST.JObject upemailToEventJson (scala.collection.immutable.Map<java.lang.String, java.lang.String> data) { throw new RuntimeException(); }
  public  org.json4s.JsonAST.JObject cleanedToEventJson (scala.collection.immutable.Map<java.lang.String, java.lang.String> data) { throw new RuntimeException(); }
  public  org.json4s.JsonAST.JObject campaignToEventJson (scala.collection.immutable.Map<java.lang.String, java.lang.String> data) { throw new RuntimeException(); }
}
