package org.apache.predictionio.data.webhooks.segmentio;
// no position
public  class SegmentIOConnector implements org.apache.predictionio.data.webhooks.JsonConnector {
  static public  org.json4s.Formats json4sFormats () { throw new RuntimeException(); }
  static public  org.json4s.JsonAST.JObject toEventJson (org.json4s.JsonAST.JObject data) { throw new RuntimeException(); }
  static public  org.json4s.JsonAST.JObject toEventJson (org.apache.predictionio.data.webhooks.segmentio.Common common, org.apache.predictionio.data.webhooks.segmentio.Events.Identify identify) { throw new RuntimeException(); }
  static public  org.json4s.JsonAST.JObject toEventJson (org.apache.predictionio.data.webhooks.segmentio.Common common, org.apache.predictionio.data.webhooks.segmentio.Events.Track track) { throw new RuntimeException(); }
  static public  org.json4s.JsonAST.JObject toEventJson (org.apache.predictionio.data.webhooks.segmentio.Common common, org.apache.predictionio.data.webhooks.segmentio.Events.Alias alias) { throw new RuntimeException(); }
  static public  org.json4s.JsonAST.JObject toEventJson (org.apache.predictionio.data.webhooks.segmentio.Common common, org.apache.predictionio.data.webhooks.segmentio.Events.Screen screen) { throw new RuntimeException(); }
  static public  org.json4s.JsonAST.JObject toEventJson (org.apache.predictionio.data.webhooks.segmentio.Common common, org.apache.predictionio.data.webhooks.segmentio.Events.Page page) { throw new RuntimeException(); }
  static public  org.json4s.JsonAST.JObject toEventJson (org.apache.predictionio.data.webhooks.segmentio.Common common, org.apache.predictionio.data.webhooks.segmentio.Events.Group group) { throw new RuntimeException(); }
  static private  org.json4s.JsonAST.JObject toJson (org.apache.predictionio.data.webhooks.segmentio.Common common, org.json4s.JsonAST.JObject props) { throw new RuntimeException(); }
  static private  org.json4s.JsonAST.JObject properties (org.apache.predictionio.data.webhooks.segmentio.Common common, org.json4s.JsonAST.JObject eventProps) { throw new RuntimeException(); }
  static private  org.json4s.JsonAST.JObject commonToJson (org.apache.predictionio.data.webhooks.segmentio.Common common) { throw new RuntimeException(); }
  static private  org.json4s.JsonAST.JObject commonToJson (org.apache.predictionio.data.webhooks.segmentio.Common common, java.lang.String typ) { throw new RuntimeException(); }
}
