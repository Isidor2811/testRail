package listeners;


import static listeners.MyTestListener.sum;
import static testrail.TestRailClient.run;
import static testrail.TestRailClient.testRail;

import org.testng.ISuite;
import org.testng.ISuiteListener;

public class MySuiteListener implements ISuiteListener {

  @Override
  public void onFinish(ISuite suite) {
    testRail.runs().close(run.getId()).execute();
    System.out.println("Time for add results to TestRail is: " + sum + " milliseconds");
  }
}
