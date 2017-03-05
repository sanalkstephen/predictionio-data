package org.apache.predictionio.data.webhooks.examplejson;
// no position
/** Example JsonConnector with following types of webhooks JSON input:
 * <p>
 * UserAction
 * <p>
 * {
 *   "type": "userAction"
 *   "userId": "as34smg4",
 *   "event": "do_something",
 *   "context": {
 *     "ip": "24.5.68.47",
 *     "prop1": 2.345,
 *     "prop2": "value1"
 *   },
 *   "anotherProperty1": 100,
 *   "anotherProperty2": "optional1",
 *   "timestamp": "2015-01-02T00:30:12.984Z"
 * }
 * <p>
 * UserActionItem
 * <p>
 * {
 *   "type": "userActionItem"
 *   "userId": "as34smg4",
 *   "event": "do_something_on",
 *   "itemId": "kfjd312bc",
 *   "context": {
 *     "ip": "1.23.4.56",
 *     "prop1": 2.345,
 *     "prop2": "value1"
 *   },
 *   "anotherPropertyA": 4.567,
 *   "anotherPropertyB": false,
 *   "timestamp": "2015-01-15T04:20:23.567Z"
 * }
 */
public  class ExampleJsonConnector implements org.apache.predictionio.data.webhooks.JsonConnector {
  static public  class Common implements scala.Product, scala.Serializable {
    public  java.lang.String type () { throw new RuntimeException(); }
    // not preceding
    public   Common (java.lang.String type) { throw new RuntimeException(); }
  }
  // no position
  static public  class Common$ extends scala.runtime.AbstractFunction1<java.lang.String, org.apache.predictionio.data.webhooks.examplejson.ExampleJsonConnector.Common> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final Common$ MODULE$ = null;
    public   Common$ () { throw new RuntimeException(); }
  }
  static public  class UserAction implements scala.Product, scala.Serializable {
    public  java.lang.String userId () { throw new RuntimeException(); }
    public  java.lang.String event () { throw new RuntimeException(); }
    public  scala.Option<org.json4s.JsonAST.JObject> context () { throw new RuntimeException(); }
    public  int anotherProperty1 () { throw new RuntimeException(); }
    public  scala.Option<java.lang.String> anotherProperty2 () { throw new RuntimeException(); }
    public  java.lang.String timestamp () { throw new RuntimeException(); }
    // not preceding
    public   UserAction (java.lang.String userId, java.lang.String event, scala.Option<org.json4s.JsonAST.JObject> context, int anotherProperty1, scala.Option<java.lang.String> anotherProperty2, java.lang.String timestamp) { throw new RuntimeException(); }
  }
  // no position
  static public  class UserAction$ extends scala.runtime.AbstractFunction6<java.lang.String, java.lang.String, scala.Option<org.json4s.JsonAST.JObject>, java.lang.Object, scala.Option<java.lang.String>, java.lang.String, org.apache.predictionio.data.webhooks.examplejson.ExampleJsonConnector.UserAction> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final UserAction$ MODULE$ = null;
    public   UserAction$ () { throw new RuntimeException(); }
  }
  static public  class UserActionItem implements scala.Product, scala.Serializable {
    public  java.lang.String userId () { throw new RuntimeException(); }
    public  java.lang.String event () { throw new RuntimeException(); }
    public  java.lang.String itemId () { throw new RuntimeException(); }
    public  org.json4s.JsonAST.JObject context () { throw new RuntimeException(); }
    public  scala.Option<java.lang.Object> anotherPropertyA () { throw new RuntimeException(); }
    public  scala.Option<java.lang.Object> anotherPropertyB () { throw new RuntimeException(); }
    public  java.lang.String timestamp () { throw new RuntimeException(); }
    // not preceding
    public   UserActionItem (java.lang.String userId, java.lang.String event, java.lang.String itemId, org.json4s.JsonAST.JObject context, scala.Option<java.lang.Object> anotherPropertyA, scala.Option<java.lang.Object> anotherPropertyB, java.lang.String timestamp) { throw new RuntimeException(); }
  }
  // no position
  static public  class UserActionItem$ extends scala.runtime.AbstractFunction7<java.lang.String, java.lang.String, java.lang.String, org.json4s.JsonAST.JObject, scala.Option<java.lang.Object>, scala.Option<java.lang.Object>, java.lang.String, org.apache.predictionio.data.webhooks.examplejson.ExampleJsonConnector.UserActionItem> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final UserActionItem$ MODULE$ = null;
    public   UserActionItem$ () { throw new RuntimeException(); }
  }
  static public  org.json4s.Formats json4sFormats () { throw new RuntimeException(); }
  static public  org.json4s.JsonAST.JObject toEventJson (org.json4s.JsonAST.JObject data) { throw new RuntimeException(); }
  static public  org.json4s.JsonAST.JObject toEventJson (org.apache.predictionio.data.webhooks.examplejson.ExampleJsonConnector.Common common, org.apache.predictionio.data.webhooks.examplejson.ExampleJsonConnector.UserAction userAction) { throw new RuntimeException(); }
  static public  org.json4s.JsonAST.JObject toEventJson (org.apache.predictionio.data.webhooks.examplejson.ExampleJsonConnector.Common common, org.apache.predictionio.data.webhooks.examplejson.ExampleJsonConnector.UserActionItem userActionItem) { throw new RuntimeException(); }
}
