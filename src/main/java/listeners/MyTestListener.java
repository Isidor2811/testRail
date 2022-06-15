package listeners;

import static testrail.TestRailClient.customResultFields;
import static testrail.TestRailClient.run;
import static testrail.TestRailClient.testRail;

import com.codepine.api.testrail.model.Result;
import io.qameta.allure.Issue;
import io.qameta.allure.Issues;
import io.qameta.allure.TmsLink;
import java.util.ArrayList;
import java.util.List;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyTestListener implements ITestListener {

  public static long sum;


  private int getTmsLink(ITestResult result) {
    TmsLink annotation = result.getMethod().getConstructorOrMethod().getMethod()
        .getAnnotation(TmsLink.class);
    return Integer.parseInt(annotation.value());
  }

  private List<String> getDefects(ITestResult result) {
    List<String> defects = new ArrayList<>();
    Issue issue = result.getMethod().getConstructorOrMethod().getMethod()
        .getAnnotation(Issue.class);
    Issues issues = result.getMethod().getConstructorOrMethod().getMethod()
        .getAnnotation(Issues.class);
    if (issue != null) {
      defects.add(issue.value());
    }

    if (issues != null) {
      for (Issue iss : issues.value()) {
        defects.add(iss.value());
      }
    }
    return defects;
  }

  //1-passed
  //5-failed

  public void onTestSuccess(ITestResult result) {
    int caseId = getTmsLink(result);

    long startTime = System.nanoTime();
    testRail.results()
        .addForCase(run.getId(), caseId, new Result().setStatusId(1), customResultFields).execute();
    long endTime = System.nanoTime();
    sum = sum + (endTime - startTime)/1000000;
  }

  public void onTestFailure(ITestResult result) {

    //set [failed] status
    Result tmsTestResult = new Result().setStatusId(5);

    //add failure message
    int caseId = getTmsLink(result);
    String failMassage = result.getThrowable().getMessage();
    tmsTestResult.setComment(failMassage);

    //add defects if exist
    List<String> defects = getDefects(result);
    if (defects.size() > 0) {
      tmsTestResult.setDefects(defects);
      //for allure (if we have defects linked to test and test was failed - in allure report we mark such test as skipped)
      result.setStatus(3);
    }

    long startTime = System.nanoTime();
    testRail.results()
        .addForCase(run.getId(), caseId, tmsTestResult, customResultFields).execute();
    long endTime = System.nanoTime();
    sum = sum + (endTime - startTime)/1000000;
  }

}
