package org.apache.predictionio.data.storage;
// no position
public  class BatchEventsJson4sSupport {
  static public  class APISerializer extends org.json4s.CustomSerializer<scala.collection.Seq<scala.util.Try<org.apache.predictionio.data.storage.Event>>> {
    public   APISerializer () { throw new RuntimeException(); }
  }
  static public  org.json4s.DefaultFormats$ formats () { throw new RuntimeException(); }
  static public  scala.PartialFunction<org.json4s.JsonAST.JValue, scala.collection.Seq<scala.util.Try<org.apache.predictionio.data.storage.Event>>> readJson () { throw new RuntimeException(); }
}
