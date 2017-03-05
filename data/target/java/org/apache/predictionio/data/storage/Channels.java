package org.apache.predictionio.data.storage;
/** :: DeveloperApi ::
 * Base trait of the {@link Channel} data access object
 * <p>
 * @group Meta Data
 */
public  interface Channels {
  /** Insert a new {@link Channel}. Returns a generated channel ID if original ID is 0. */
  public  scala.Option<java.lang.Object> insert (org.apache.predictionio.data.storage.Channel channel) ;
  /** Get a {@link Channel} by channel ID */
  public  scala.Option<org.apache.predictionio.data.storage.Channel> get (int id) ;
  /** Get all {@link Channel} by app ID */
  public  scala.collection.Seq<org.apache.predictionio.data.storage.Channel> getByAppid (int appid) ;
  /** Delete a {@link Channel} */
  public  void delete (int id) ;
}
