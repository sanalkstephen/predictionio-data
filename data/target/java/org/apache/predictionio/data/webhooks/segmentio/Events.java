package org.apache.predictionio.data.webhooks.segmentio;
// no position
public  class Events {
  static public  class Track implements scala.Product, scala.Serializable {
    public  java.lang.String event () { throw new RuntimeException(); }
    public  scala.Option<org.json4s.JsonAST.JObject> properties () { throw new RuntimeException(); }
    // not preceding
    public   Track (java.lang.String event, scala.Option<org.json4s.JsonAST.JObject> properties) { throw new RuntimeException(); }
  }
  // no position
  static public  class Track$ extends scala.runtime.AbstractFunction2<java.lang.String, scala.Option<org.json4s.JsonAST.JObject>, org.apache.predictionio.data.webhooks.segmentio.Events.Track> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final Track$ MODULE$ = null;
    public   Track$ () { throw new RuntimeException(); }
  }
  static public  class Alias implements scala.Product, scala.Serializable {
    public  java.lang.String previous_id () { throw new RuntimeException(); }
    public  java.lang.String user_id () { throw new RuntimeException(); }
    // not preceding
    public   Alias (java.lang.String previous_id, java.lang.String user_id) { throw new RuntimeException(); }
  }
  // no position
  static public  class Alias$ extends scala.runtime.AbstractFunction2<java.lang.String, java.lang.String, org.apache.predictionio.data.webhooks.segmentio.Events.Alias> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final Alias$ MODULE$ = null;
    public   Alias$ () { throw new RuntimeException(); }
  }
  static public  class Group implements scala.Product, scala.Serializable {
    public  java.lang.String group_id () { throw new RuntimeException(); }
    public  scala.Option<org.json4s.JsonAST.JObject> traits () { throw new RuntimeException(); }
    // not preceding
    public   Group (java.lang.String group_id, scala.Option<org.json4s.JsonAST.JObject> traits) { throw new RuntimeException(); }
  }
  // no position
  static public  class Group$ extends scala.runtime.AbstractFunction2<java.lang.String, scala.Option<org.json4s.JsonAST.JObject>, org.apache.predictionio.data.webhooks.segmentio.Events.Group> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final Group$ MODULE$ = null;
    public   Group$ () { throw new RuntimeException(); }
  }
  static public  class Screen implements scala.Product, scala.Serializable {
    public  scala.Option<java.lang.String> name () { throw new RuntimeException(); }
    public  scala.Option<org.json4s.JsonAST.JObject> properties () { throw new RuntimeException(); }
    // not preceding
    public   Screen (scala.Option<java.lang.String> name, scala.Option<org.json4s.JsonAST.JObject> properties) { throw new RuntimeException(); }
  }
  // no position
  static public  class Screen$ extends scala.runtime.AbstractFunction2<scala.Option<java.lang.String>, scala.Option<org.json4s.JsonAST.JObject>, org.apache.predictionio.data.webhooks.segmentio.Events.Screen> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final Screen$ MODULE$ = null;
    public   Screen$ () { throw new RuntimeException(); }
  }
  static public  class Page implements scala.Product, scala.Serializable {
    public  scala.Option<java.lang.String> name () { throw new RuntimeException(); }
    public  scala.Option<org.json4s.JsonAST.JObject> properties () { throw new RuntimeException(); }
    // not preceding
    public   Page (scala.Option<java.lang.String> name, scala.Option<org.json4s.JsonAST.JObject> properties) { throw new RuntimeException(); }
  }
  // no position
  static public  class Page$ extends scala.runtime.AbstractFunction2<scala.Option<java.lang.String>, scala.Option<org.json4s.JsonAST.JObject>, org.apache.predictionio.data.webhooks.segmentio.Events.Page> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final Page$ MODULE$ = null;
    public   Page$ () { throw new RuntimeException(); }
  }
  static public  class Identify implements scala.Product, scala.Serializable {
    public  java.lang.String user_id () { throw new RuntimeException(); }
    public  scala.Option<org.json4s.JsonAST.JObject> traits () { throw new RuntimeException(); }
    // not preceding
    public   Identify (java.lang.String user_id, scala.Option<org.json4s.JsonAST.JObject> traits) { throw new RuntimeException(); }
  }
  // no position
  static public  class Identify$ extends scala.runtime.AbstractFunction2<java.lang.String, scala.Option<org.json4s.JsonAST.JObject>, org.apache.predictionio.data.webhooks.segmentio.Events.Identify> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final Identify$ MODULE$ = null;
    public   Identify$ () { throw new RuntimeException(); }
  }
}
