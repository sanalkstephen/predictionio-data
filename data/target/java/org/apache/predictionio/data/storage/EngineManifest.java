package org.apache.predictionio.data.storage;
/** :: DeveloperApi ::
 * Provides a way to discover engines by ID and version in a distributed
 * environment
 * <p>
 * @param id Unique identifier of an engine.
 * @param version Engine version string.
 * @param name A short and descriptive name for the engine.
 * @param description A long description of the engine.
 * @param files Paths to engine files.
 * @param engineFactory Engine's factory class name.
 * @group Meta Data
 */
public  class EngineManifest implements scala.Product, scala.Serializable {
  public  java.lang.String id () { throw new RuntimeException(); }
  public  java.lang.String version () { throw new RuntimeException(); }
  public  java.lang.String name () { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> description () { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.String> files () { throw new RuntimeException(); }
  public  java.lang.String engineFactory () { throw new RuntimeException(); }
  // not preceding
  public   EngineManifest (java.lang.String id, java.lang.String version, java.lang.String name, scala.Option<java.lang.String> description, scala.collection.Seq<java.lang.String> files, java.lang.String engineFactory) { throw new RuntimeException(); }
}
