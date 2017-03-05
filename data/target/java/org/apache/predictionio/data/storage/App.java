package org.apache.predictionio.data.storage;
/** :: DeveloperApi ::
 * Stores mapping of app IDs and names
 * <p>
 * @param id ID of the app.
 * @param name Name of the app.
 * @param description Long description of the app.
 * @group Meta Data
 */
public  class App implements scala.Product, scala.Serializable {
  public  int id () { throw new RuntimeException(); }
  public  java.lang.String name () { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> description () { throw new RuntimeException(); }
  // not preceding
  public   App (int id, java.lang.String name, scala.Option<java.lang.String> description) { throw new RuntimeException(); }
}
