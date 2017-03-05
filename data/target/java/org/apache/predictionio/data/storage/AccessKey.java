package org.apache.predictionio.data.storage;
/** :: DeveloperApi ::
 * Stores mapping of access keys, app IDs, and lists of allowed event names
 * <p>
 * @param key Access key
 * @param appid App ID
 * @param events List of allowed events for this particular app key
 * @group Meta Data
 */
public  class AccessKey implements scala.Product, scala.Serializable {
  public  java.lang.String key () { throw new RuntimeException(); }
  public  int appid () { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.String> events () { throw new RuntimeException(); }
  // not preceding
  public   AccessKey (java.lang.String key, int appid, scala.collection.Seq<java.lang.String> events) { throw new RuntimeException(); }
}
