package org.apache.predictionio.data.storage.jdbc;
// no position
/** JDBC related utilities */
public  class JDBCUtils$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final JDBCUtils$ MODULE$ = null;
  public   JDBCUtils$ () { throw new RuntimeException(); }
  /** Extract JDBC driver type from URL
   * <p>
   * @param url JDBC URL
   * @return The driver type, e.g. postgresql
   */
  public  java.lang.String driverType (java.lang.String url) { throw new RuntimeException(); }
  // not preceding
  public  scalikejdbc.interpolation.SQLSyntax binaryColumnType (java.lang.String url) { throw new RuntimeException(); }
  /** Determines UNIX timestamp conversion function from JDBC URL
   * <p>
   * @param url JDBC URL
   * @return Timestamp conversion function, e.g. TO_TIMESTAMP
   */
  public  java.lang.String timestampFunction (java.lang.String url) { throw new RuntimeException(); }
  /** Converts Map of String to String to comma-separated list of key=value
   * <p>
   * @param m Map of String to String
   * @return Comma-separated list, e.g. FOO=BAR,X=Y,...
   */
  public  java.lang.String mapToString (scala.collection.immutable.Map<java.lang.String, java.lang.String> m) { throw new RuntimeException(); }
  /** Inverse of mapToString
   * <p>
   * @param str Comma-separated list, e.g. FOO=BAR,X=Y,...
   * @return Map of String to String, e.g. Map("FOO" -> "BAR", "X" -> "Y", ...)
   */
  public  scala.collection.immutable.Map<java.lang.String, java.lang.String> stringToMap (java.lang.String str) { throw new RuntimeException(); }
  /** Generate 32-character random ID using UUID with - stripped */
  public  java.lang.String generateId () { throw new RuntimeException(); }
  /** Prefix a table name
   * <p>
   * @param prefix Table prefix
   * @param table Table name
   * @return Prefixed table name
   */
  public  scalikejdbc.interpolation.SQLSyntax prefixTableName (java.lang.String prefix, java.lang.String table) { throw new RuntimeException(); }
  /** Derive event table name
   * <p>
   * @param namespace Namespace of event tables
   * @param appId App ID
   * @param channelId Optional channel ID
   * @return Full event table name
   */
  public  java.lang.String eventTableName (java.lang.String namespace, int appId, scala.Option<java.lang.Object> channelId) { throw new RuntimeException(); }
}
