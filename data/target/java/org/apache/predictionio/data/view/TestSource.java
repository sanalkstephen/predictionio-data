package org.apache.predictionio.data.view;
public  class TestSource {
  public  int appId () { throw new RuntimeException(); }
  // not preceding
  public   TestSource (int appId) { throw new RuntimeException(); }
  public  grizzled.slf4j.Logger logger () { throw new RuntimeException(); }
  public  org.apache.predictionio.data.view.LBatchView batchView () { throw new RuntimeException(); }
  public  void run () { throw new RuntimeException(); }
}
