package org.apache.predictionio.data.store.java;
// no position
/** Used by Java-based engines to mock Some and None */
public  class OptionHelper$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final OptionHelper$ MODULE$ = null;
  public   OptionHelper$ () { throw new RuntimeException(); }
  /** Mimics a None from Java-based engine */
  public <T extends java.lang.Object> scala.Option<T> none () { throw new RuntimeException(); }
  /** Mimics a Some from Java-based engine */
  public <T extends java.lang.Object> scala.Option<T> some (T value) { throw new RuntimeException(); }
}
