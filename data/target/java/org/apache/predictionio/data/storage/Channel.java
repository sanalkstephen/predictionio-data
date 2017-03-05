package org.apache.predictionio.data.storage;
/** :: DeveloperApi ::
 * Stores mapping of channel IDs, names and app ID
 * <p>
 * @param id ID of the channel
 * @param name Name of the channel (must be unique within the same app)
 * @param appid ID of the app which this channel belongs to
 * @group Meta Data
 */
public  class Channel implements scala.Product, scala.Serializable {
  /** Examine whether the supplied channel name is valid. A valid channel name
   * must consists of 1 to 16 alphanumeric and '-' characters.
   * <p>
   * @param s Channel name to examine
   * @return true if channel name is valid, false otherwise
   */
  static public  boolean isValidName (java.lang.String s) { throw new RuntimeException(); }
  /** For consistent error message display */
  static public  java.lang.String nameConstraint () { throw new RuntimeException(); }
  public  int id () { throw new RuntimeException(); }
  public  java.lang.String name () { throw new RuntimeException(); }
  public  int appid () { throw new RuntimeException(); }
  // not preceding
  public   Channel (int id, java.lang.String name, int appid) { throw new RuntimeException(); }
}
