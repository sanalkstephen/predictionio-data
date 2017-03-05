package org.apache.predictionio.data.webhooks.segmentio;
public  class Common implements scala.Product, scala.Serializable {
  static public  class Integrations implements scala.Product, scala.Serializable {
    public  boolean All () { throw new RuntimeException(); }
    public  boolean Mixpanel () { throw new RuntimeException(); }
    public  boolean Marketo () { throw new RuntimeException(); }
    public  boolean Salesforse () { throw new RuntimeException(); }
    // not preceding
    public   Integrations (boolean All, boolean Mixpanel, boolean Marketo, boolean Salesforse) { throw new RuntimeException(); }
  }
  // no position
  static public  class Integrations$ extends scala.runtime.AbstractFunction4<java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, org.apache.predictionio.data.webhooks.segmentio.Common.Integrations> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final Integrations$ MODULE$ = null;
    public   Integrations$ () { throw new RuntimeException(); }
  }
  static public  class Context implements scala.Product, scala.Serializable {
    public  java.lang.String ip () { throw new RuntimeException(); }
    public  org.apache.predictionio.data.webhooks.segmentio.Common.Library library () { throw new RuntimeException(); }
    public  java.lang.String user_agent () { throw new RuntimeException(); }
    public  scala.Option<org.apache.predictionio.data.webhooks.segmentio.Common.App> app () { throw new RuntimeException(); }
    public  scala.Option<org.apache.predictionio.data.webhooks.segmentio.Common.Campaign> campaign () { throw new RuntimeException(); }
    public  scala.Option<org.apache.predictionio.data.webhooks.segmentio.Common.Device> device () { throw new RuntimeException(); }
    public  scala.Option<org.apache.predictionio.data.webhooks.segmentio.Common.Network> network () { throw new RuntimeException(); }
    public  scala.Option<org.apache.predictionio.data.webhooks.segmentio.Common.Location> location () { throw new RuntimeException(); }
    public  scala.Option<org.apache.predictionio.data.webhooks.segmentio.Common.OS> os () { throw new RuntimeException(); }
    public  scala.Option<org.apache.predictionio.data.webhooks.segmentio.Common.Referrer> referrer () { throw new RuntimeException(); }
    public  scala.Option<org.apache.predictionio.data.webhooks.segmentio.Common.Screen> screen () { throw new RuntimeException(); }
    public  scala.Option<java.lang.String> timezone () { throw new RuntimeException(); }
    // not preceding
    public   Context (java.lang.String ip, org.apache.predictionio.data.webhooks.segmentio.Common.Library library, java.lang.String user_agent, scala.Option<org.apache.predictionio.data.webhooks.segmentio.Common.App> app, scala.Option<org.apache.predictionio.data.webhooks.segmentio.Common.Campaign> campaign, scala.Option<org.apache.predictionio.data.webhooks.segmentio.Common.Device> device, scala.Option<org.apache.predictionio.data.webhooks.segmentio.Common.Network> network, scala.Option<org.apache.predictionio.data.webhooks.segmentio.Common.Location> location, scala.Option<org.apache.predictionio.data.webhooks.segmentio.Common.OS> os, scala.Option<org.apache.predictionio.data.webhooks.segmentio.Common.Referrer> referrer, scala.Option<org.apache.predictionio.data.webhooks.segmentio.Common.Screen> screen, scala.Option<java.lang.String> timezone) { throw new RuntimeException(); }
  }
  // no position
  static public  class Context$ extends scala.runtime.AbstractFunction12<java.lang.String, org.apache.predictionio.data.webhooks.segmentio.Common.Library, java.lang.String, scala.Option<org.apache.predictionio.data.webhooks.segmentio.Common.App>, scala.Option<org.apache.predictionio.data.webhooks.segmentio.Common.Campaign>, scala.Option<org.apache.predictionio.data.webhooks.segmentio.Common.Device>, scala.Option<org.apache.predictionio.data.webhooks.segmentio.Common.Network>, scala.Option<org.apache.predictionio.data.webhooks.segmentio.Common.Location>, scala.Option<org.apache.predictionio.data.webhooks.segmentio.Common.OS>, scala.Option<org.apache.predictionio.data.webhooks.segmentio.Common.Referrer>, scala.Option<org.apache.predictionio.data.webhooks.segmentio.Common.Screen>, scala.Option<java.lang.String>, org.apache.predictionio.data.webhooks.segmentio.Common.Context> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final Context$ MODULE$ = null;
    public   Context$ () { throw new RuntimeException(); }
  }
  static public  class Screen implements scala.Product, scala.Serializable {
    public  int width () { throw new RuntimeException(); }
    public  int height () { throw new RuntimeException(); }
    public  int density () { throw new RuntimeException(); }
    // not preceding
    public   Screen (int width, int height, int density) { throw new RuntimeException(); }
  }
  // no position
  static public  class Screen$ extends scala.runtime.AbstractFunction3<java.lang.Object, java.lang.Object, java.lang.Object, org.apache.predictionio.data.webhooks.segmentio.Common.Screen> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final Screen$ MODULE$ = null;
    public   Screen$ () { throw new RuntimeException(); }
  }
  static public  class Referrer implements scala.Product, scala.Serializable {
    public  java.lang.String id () { throw new RuntimeException(); }
    public  java.lang.String type () { throw new RuntimeException(); }
    // not preceding
    public   Referrer (java.lang.String id, java.lang.String type) { throw new RuntimeException(); }
  }
  // no position
  static public  class Referrer$ extends scala.runtime.AbstractFunction2<java.lang.String, java.lang.String, org.apache.predictionio.data.webhooks.segmentio.Common.Referrer> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final Referrer$ MODULE$ = null;
    public   Referrer$ () { throw new RuntimeException(); }
  }
  static public  class OS implements scala.Product, scala.Serializable {
    public  java.lang.String name () { throw new RuntimeException(); }
    public  java.lang.String version () { throw new RuntimeException(); }
    // not preceding
    public   OS (java.lang.String name, java.lang.String version) { throw new RuntimeException(); }
  }
  // no position
  static public  class OS$ extends scala.runtime.AbstractFunction2<java.lang.String, java.lang.String, org.apache.predictionio.data.webhooks.segmentio.Common.OS> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final OS$ MODULE$ = null;
    public   OS$ () { throw new RuntimeException(); }
  }
  static public  class Location implements scala.Product, scala.Serializable {
    public  scala.Option<java.lang.String> city () { throw new RuntimeException(); }
    public  scala.Option<java.lang.String> country () { throw new RuntimeException(); }
    public  scala.Option<java.lang.Object> latitude () { throw new RuntimeException(); }
    public  scala.Option<java.lang.Object> longitude () { throw new RuntimeException(); }
    public  scala.Option<java.lang.Object> speed () { throw new RuntimeException(); }
    // not preceding
    public   Location (scala.Option<java.lang.String> city, scala.Option<java.lang.String> country, scala.Option<java.lang.Object> latitude, scala.Option<java.lang.Object> longitude, scala.Option<java.lang.Object> speed) { throw new RuntimeException(); }
  }
  // no position
  static public  class Location$ extends scala.runtime.AbstractFunction5<scala.Option<java.lang.String>, scala.Option<java.lang.String>, scala.Option<java.lang.Object>, scala.Option<java.lang.Object>, scala.Option<java.lang.Object>, org.apache.predictionio.data.webhooks.segmentio.Common.Location> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final Location$ MODULE$ = null;
    public   Location$ () { throw new RuntimeException(); }
  }
  static public  class Page implements scala.Product, scala.Serializable {
    public  java.lang.String path () { throw new RuntimeException(); }
    public  java.lang.String referrer () { throw new RuntimeException(); }
    public  java.lang.String search () { throw new RuntimeException(); }
    public  java.lang.String title () { throw new RuntimeException(); }
    public  java.lang.String url () { throw new RuntimeException(); }
    // not preceding
    public   Page (java.lang.String path, java.lang.String referrer, java.lang.String search, java.lang.String title, java.lang.String url) { throw new RuntimeException(); }
  }
  // no position
  static public  class Page$ extends scala.runtime.AbstractFunction5<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, org.apache.predictionio.data.webhooks.segmentio.Common.Page> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final Page$ MODULE$ = null;
    public   Page$ () { throw new RuntimeException(); }
  }
  static public  class Network implements scala.Product, scala.Serializable {
    public  scala.Option<java.lang.Object> bluetooth () { throw new RuntimeException(); }
    public  scala.Option<java.lang.String> carrier () { throw new RuntimeException(); }
    public  scala.Option<java.lang.Object> cellular () { throw new RuntimeException(); }
    public  scala.Option<java.lang.Object> wifi () { throw new RuntimeException(); }
    // not preceding
    public   Network (scala.Option<java.lang.Object> bluetooth, scala.Option<java.lang.String> carrier, scala.Option<java.lang.Object> cellular, scala.Option<java.lang.Object> wifi) { throw new RuntimeException(); }
  }
  // no position
  static public  class Network$ extends scala.runtime.AbstractFunction4<scala.Option<java.lang.Object>, scala.Option<java.lang.String>, scala.Option<java.lang.Object>, scala.Option<java.lang.Object>, org.apache.predictionio.data.webhooks.segmentio.Common.Network> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final Network$ MODULE$ = null;
    public   Network$ () { throw new RuntimeException(); }
  }
  static public  class Library implements scala.Product, scala.Serializable {
    public  java.lang.String name () { throw new RuntimeException(); }
    public  java.lang.String version () { throw new RuntimeException(); }
    // not preceding
    public   Library (java.lang.String name, java.lang.String version) { throw new RuntimeException(); }
  }
  // no position
  static public  class Library$ extends scala.runtime.AbstractFunction2<java.lang.String, java.lang.String, org.apache.predictionio.data.webhooks.segmentio.Common.Library> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final Library$ MODULE$ = null;
    public   Library$ () { throw new RuntimeException(); }
  }
  static public  class Device implements scala.Product, scala.Serializable {
    public  scala.Option<java.lang.String> id () { throw new RuntimeException(); }
    public  scala.Option<java.lang.String> advertising_id () { throw new RuntimeException(); }
    public  scala.Option<java.lang.Object> ad_tracking_enabled () { throw new RuntimeException(); }
    public  scala.Option<java.lang.String> manufacturer () { throw new RuntimeException(); }
    public  scala.Option<java.lang.String> model () { throw new RuntimeException(); }
    public  scala.Option<java.lang.String> name () { throw new RuntimeException(); }
    public  scala.Option<java.lang.String> type () { throw new RuntimeException(); }
    public  scala.Option<java.lang.String> token () { throw new RuntimeException(); }
    // not preceding
    public   Device (scala.Option<java.lang.String> id, scala.Option<java.lang.String> advertising_id, scala.Option<java.lang.Object> ad_tracking_enabled, scala.Option<java.lang.String> manufacturer, scala.Option<java.lang.String> model, scala.Option<java.lang.String> name, scala.Option<java.lang.String> type, scala.Option<java.lang.String> token) { throw new RuntimeException(); }
  }
  // no position
  static public  class Device$ extends scala.runtime.AbstractFunction8<scala.Option<java.lang.String>, scala.Option<java.lang.String>, scala.Option<java.lang.Object>, scala.Option<java.lang.String>, scala.Option<java.lang.String>, scala.Option<java.lang.String>, scala.Option<java.lang.String>, scala.Option<java.lang.String>, org.apache.predictionio.data.webhooks.segmentio.Common.Device> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final Device$ MODULE$ = null;
    public   Device$ () { throw new RuntimeException(); }
  }
  static public  class Campaign implements scala.Product, scala.Serializable {
    public  scala.Option<java.lang.String> name () { throw new RuntimeException(); }
    public  scala.Option<java.lang.String> source () { throw new RuntimeException(); }
    public  scala.Option<java.lang.String> medium () { throw new RuntimeException(); }
    public  scala.Option<java.lang.String> term () { throw new RuntimeException(); }
    public  scala.Option<java.lang.String> content () { throw new RuntimeException(); }
    // not preceding
    public   Campaign (scala.Option<java.lang.String> name, scala.Option<java.lang.String> source, scala.Option<java.lang.String> medium, scala.Option<java.lang.String> term, scala.Option<java.lang.String> content) { throw new RuntimeException(); }
  }
  // no position
  static public  class Campaign$ extends scala.runtime.AbstractFunction5<scala.Option<java.lang.String>, scala.Option<java.lang.String>, scala.Option<java.lang.String>, scala.Option<java.lang.String>, scala.Option<java.lang.String>, org.apache.predictionio.data.webhooks.segmentio.Common.Campaign> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final Campaign$ MODULE$ = null;
    public   Campaign$ () { throw new RuntimeException(); }
  }
  static public  class App implements scala.Product, scala.Serializable {
    public  scala.Option<java.lang.String> name () { throw new RuntimeException(); }
    public  scala.Option<java.lang.String> version () { throw new RuntimeException(); }
    public  scala.Option<java.lang.String> build () { throw new RuntimeException(); }
    // not preceding
    public   App (scala.Option<java.lang.String> name, scala.Option<java.lang.String> version, scala.Option<java.lang.String> build) { throw new RuntimeException(); }
  }
  // no position
  static public  class App$ extends scala.runtime.AbstractFunction3<scala.Option<java.lang.String>, scala.Option<java.lang.String>, scala.Option<java.lang.String>, org.apache.predictionio.data.webhooks.segmentio.Common.App> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final App$ MODULE$ = null;
    public   App$ () { throw new RuntimeException(); }
  }
  public  java.lang.String type () { throw new RuntimeException(); }
  public  java.lang.String sent_at () { throw new RuntimeException(); }
  public  java.lang.String timestamp () { throw new RuntimeException(); }
  public  java.lang.String version () { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> anonymous_id () { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> user_id () { throw new RuntimeException(); }
  public  scala.Option<org.apache.predictionio.data.webhooks.segmentio.Common.Context> context () { throw new RuntimeException(); }
  public  scala.Option<org.apache.predictionio.data.webhooks.segmentio.Common.Integrations> integrations () { throw new RuntimeException(); }
  // not preceding
  public   Common (java.lang.String type, java.lang.String sent_at, java.lang.String timestamp, java.lang.String version, scala.Option<java.lang.String> anonymous_id, scala.Option<java.lang.String> user_id, scala.Option<org.apache.predictionio.data.webhooks.segmentio.Common.Context> context, scala.Option<org.apache.predictionio.data.webhooks.segmentio.Common.Integrations> integrations) { throw new RuntimeException(); }
}
