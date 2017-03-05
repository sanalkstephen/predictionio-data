package org.apache.predictionio.data.webhooks.segmentio;
// no position
public  class SegmentIOConnector$ implements org.apache.predictionio.data.webhooks.JsonConnector {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final SegmentIOConnector$ MODULE$ = null;
  public   SegmentIOConnector$ () { throw new RuntimeException(); }
  public  org.json4s.Formats json4sFormats () { throw new RuntimeException(); }
  public  org.json4s.JsonAST.JObject toEventJson (org.json4s.JsonAST.JObject data) { throw new RuntimeException(); }
  public  org.json4s.JsonAST.JObject toEventJson (org.apache.predictionio.data.webhooks.segmentio.Common common, org.apache.predictionio.data.webhooks.segmentio.Events.Identify identify) { throw new RuntimeException(); }
  public  org.json4s.JsonAST.JObject toEventJson (org.apache.predictionio.data.webhooks.segmentio.Common common, org.apache.predictionio.data.webhooks.segmentio.Events.Track track) { throw new RuntimeException(); }
  public  org.json4s.JsonAST.JObject toEventJson (org.apache.predictionio.data.webhooks.segmentio.Common common, org.apache.predictionio.data.webhooks.segmentio.Events.Alias alias) { throw new RuntimeException(); }
  public  org.json4s.JsonAST.JObject toEventJson (org.apache.predictionio.data.webhooks.segmentio.Common common, org.apache.predictionio.data.webhooks.segmentio.Events.Screen screen) { throw new RuntimeException(); }
  public  org.json4s.JsonAST.JObject toEventJson (org.apache.predictionio.data.webhooks.segmentio.Common common, org.apache.predictionio.data.webhooks.segmentio.Events.Page page) { throw new RuntimeException(); }
  public  org.json4s.JsonAST.JObject toEventJson (org.apache.predictionio.data.webhooks.segmentio.Common common, org.apache.predictionio.data.webhooks.segmentio.Events.Group group) { throw new RuntimeException(); }
  private  org.json4s.JsonAST.JObject toJson (org.apache.predictionio.data.webhooks.segmentio.Common common, org.json4s.JsonAST.JObject props) { throw new RuntimeException(); }
  private  org.json4s.JsonAST.JObject properties (org.apache.predictionio.data.webhooks.segmentio.Common common, org.json4s.JsonAST.JObject eventProps) { throw new RuntimeException(); }
  private  org.json4s.JsonAST.JObject commonToJson (org.apache.predictionio.data.webhooks.segmentio.Common common) { throw new RuntimeException(); }
  private  org.json4s.JsonAST.JObject commonToJson (org.apache.predictionio.data.webhooks.segmentio.Common common, java.lang.String typ) { throw new RuntimeException(); }
}
