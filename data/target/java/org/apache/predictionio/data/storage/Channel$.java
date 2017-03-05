package org.apache.predictionio.data.storage;
// no position
// not preceding
public  class Channel$ implements scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final Channel$ MODULE$ = null;
  public   Channel$ () { throw new RuntimeException(); }
  /** Examine whether the supplied channel name is valid. A valid channel name
   * must consists of 1 to 16 alphanumeric and '-' characters.
   * <p>
   * @param s Channel name to examine
   * @return true if channel name is valid, false otherwise
   */
  public  boolean isValidName (java.lang.String s) { throw new RuntimeException(); }
  /** For consistent error message display */
  public  java.lang.String nameConstraint () { throw new RuntimeException(); }
}
