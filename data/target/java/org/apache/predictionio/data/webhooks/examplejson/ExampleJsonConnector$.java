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
public  class ExampleJsonConnector$ implements org.apache.predictionio.data.webhooks.JsonConnector {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final ExampleJsonConnector$ MODULE$ = null;
  public   ExampleJsonConnector$ () { throw new RuntimeException(); }
  public  org.json4s.Formats json4sFormats () { throw new RuntimeException(); }
  public  org.json4s.JsonAST.JObject toEventJson (org.json4s.JsonAST.JObject data) { throw new RuntimeException(); }
  public  org.json4s.JsonAST.JObject toEventJson (org.apache.predictionio.data.webhooks.examplejson.ExampleJsonConnector.Common common, org.apache.predictionio.data.webhooks.examplejson.ExampleJsonConnector.UserAction userAction) { throw new RuntimeException(); }
  public  org.json4s.JsonAST.JObject toEventJson (org.apache.predictionio.data.webhooks.examplejson.ExampleJsonConnector.Common common, org.apache.predictionio.data.webhooks.examplejson.ExampleJsonConnector.UserActionItem userActionItem) { throw new RuntimeException(); }
}
