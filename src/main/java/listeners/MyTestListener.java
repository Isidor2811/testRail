package listeners;

import static listeners.MyISuiteListener.writer;

import io.qameta.allure.Issue;
import io.qameta.allure.Issues;
import io.qameta.allure.TmsLink;
import java.util.ArrayList;
import java.util.List;
import lombok.SneakyThrows;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyTestListener implements ITestListener {

  //get TMS link (test case id in TestRail) from @TmsLink annotation
  private int getTmsLink(ITestResult result) {
    TmsLink annotation = result.getMethod().getConstructorOrMethod().getMethod()
        .getAnnotation(TmsLink.class);
    return Integer.parseInt(annotation.value());
  }

  //get defect list from the @Issue and @Issues annotations
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


  @SneakyThrows
  private synchronized void writeResultsToFile(String caseId, String status, String failureMessage,
      List<String> defectsList) {
    String defectsToWrite = defectsList != null ? String.join(",", defectsList) : null;
    String stringToWrite = String.join(",", caseId, status, failureMessage, defectsToWrite);
    writer.write(stringToWrite + "\n");
  }

  @SneakyThrows
  public void onTestSuccess(ITestResult result) {
    String caseId = String.valueOf(getTmsLink(result));
    writeResultsToFile(caseId, "1", null, null);
  }

  @SneakyThrows
  public void onTestFailure(ITestResult result) {
    String caseId = String.valueOf(getTmsLink(result));
    String failMassage = result.getThrowable().getMessage();
    List<String> issueLinks = getDefects(result);
    List<String> defects = issueLinks.size() > 0 ? issueLinks : null;
    writeResultsToFile(caseId, "5", failMassage, defects);
    //for allure (if we have defects linked to test and test was failed - in allure report we mark such test as skipped)
    if (issueLinks.size() > 0) {
      result.setStatus(3);
    }

  }

}
