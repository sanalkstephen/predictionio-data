package org.apache.predictionio.data.storage;
/** Each event in the Event Store can be represented by fields in this case
 * class.
 * <p>
 * @param eventId Unique ID of this event.
 * @param event Name of this event.
 * @param entityType Type of the entity associated with this event.
 * @param entityId ID of the entity associated with this event.
 * @param targetEntityType Type of the target entity associated with this
 *                         event.
 * @param targetEntityId ID of the target entity associated with this event.
 * @param properties Properties associated with this event.
 * @param eventTime Time of the happening of this event.
 * @param tags Tags of this event.
 * @param prId PredictedResultId of this event.
 * @param creationTime Time of creation in the system of this event.
 * @group Event Data
 */
public  class Event implements scala.Product, scala.Serializable {
  public  scala.Option<java.lang.String> eventId () { throw new RuntimeException(); }
  public  java.lang.String event () { throw new RuntimeException(); }
  public  java.lang.String entityType () { throw new RuntimeException(); }
  public  java.lang.String entityId () { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> targetEntityType () { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> targetEntityId () { throw new RuntimeException(); }
  public  org.apache.predictionio.data.storage.DataMap properties () { throw new RuntimeException(); }
  public  org.joda.time.DateTime eventTime () { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.String> tags () { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> prId () { throw new RuntimeException(); }
  public  org.joda.time.DateTime creationTime () { throw new RuntimeException(); }
  // not preceding
  public   Event (scala.Option<java.lang.String> eventId, java.lang.String event, java.lang.String entityType, java.lang.String entityId, scala.Option<java.lang.String> targetEntityType, scala.Option<java.lang.String> targetEntityId, org.apache.predictionio.data.storage.DataMap properties, org.joda.time.DateTime eventTime, scala.collection.Seq<java.lang.String> tags, scala.Option<java.lang.String> prId, org.joda.time.DateTime creationTime) { throw new RuntimeException(); }
  public  java.lang.String toString () { throw new RuntimeException(); }
}
