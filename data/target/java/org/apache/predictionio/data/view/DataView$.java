package org.apache.predictionio.data.view;
// no position
/** :: Experimental :: */
public  class DataView$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final DataView$ MODULE$ = null;
  public   DataView$ () { throw new RuntimeException(); }
  /**
   * :: Experimental ::
   * <p>
   * Create a DataFrame from events of a specified app.
   * <p>
   * @param appName return events of this app
   * @param channelName use events of this channel (default channel if it's None)
   * @param startTime return events with eventTime >= startTime
   * @param untilTime return events with eventTime < untilTime
   * @param conversionFunction a function that turns raw Events into events of interest.
   *                           If conversionFunction returns None, such events are dropped.
   * @param name identify the DataFrame created
   * @param version used to track changes to the conversionFunction, e.g. version = "20150413"
   *                and update whenever the function is changed.
   * @param sqlContext SQL context
   * @tparam E the output type of the conversion function. The type needs to extend Product
   *           (e.g. case class)
   * @return a DataFrame of events
   */
  public <E extends scala.Product> org.apache.spark.sql.DataFrame create (java.lang.String appName, scala.Option<java.lang.String> channelName, scala.Option<org.joda.time.DateTime> startTime, scala.Option<org.joda.time.DateTime> untilTime, scala.Function1<org.apache.predictionio.data.storage.Event, scala.Option<E>> conversionFunction, java.lang.String name, java.lang.String version, org.apache.spark.sql.SQLContext sqlContext, scala.reflect.api.TypeTags.TypeTag<E> evidence$1, scala.reflect.ClassTag<E> evidence$2) { throw new RuntimeException(); }
}
