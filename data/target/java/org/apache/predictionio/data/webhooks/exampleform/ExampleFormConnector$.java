package org.apache.predictionio.data.webhooks.exampleform;
// no position
/** Example FormConnector with following types of webhook form data inputs:
 * <p>
 * UserAction
 * <p>
 *   "type"="userAction"
 *   "userId"="as34smg4",
 *   "event"="do_something",
 *   "context[ip]"="24.5.68.47", // optional
 *   "context[prop1]"="2.345", // optional
 *   "context[prop2]"="value1" // optional
 *   "anotherProperty1"="100",
 *   "anotherProperty2"="optional1", // optional
 *   "timestamp"="2015-01-02T00:30:12.984Z"
 * <p>
 * UserActionItem
 * <p>
 *   "type"="userActionItem"
 *   "userId"="as34smg4",
 *   "event"="do_something_on",
 *   "itemId"="kfjd312bc",
 *   "context[ip]"="1.23.4.56",
 *   "context[prop1]"="2.345",
 *   "context[prop2]"="value1",
 *   "anotherPropertyA"="4.567", // optional
 *   "anotherPropertyB"="false", // optional
 *   "timestamp"="2015-01-15T04:20:23.567Z"
 * <p>
 */
public  class ExampleFormConnector$ implements org.apache.predictionio.data.webhooks.FormConnector {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final ExampleFormConnector$ MODULE$ = null;
  public   ExampleFormConnector$ () { throw new RuntimeException(); }
  public  org.json4s.JsonAST.JObject toEventJson (scala.collection.immutable.Map<java.lang.String, java.lang.String> data) { throw new RuntimeException(); }
  public  org.json4s.JsonAST.JObject userActionToEventJson (scala.collection.immutable.Map<java.lang.String, java.lang.String> data) { throw new RuntimeException(); }
  public  org.json4s.JsonAST.JObject userActionItemToEventJson (scala.collection.immutable.Map<java.lang.String, java.lang.String> data) { throw new RuntimeException(); }
}
