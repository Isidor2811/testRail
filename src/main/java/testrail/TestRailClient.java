package testrail;

import com.codepine.api.testrail.TestRail;
import com.codepine.api.testrail.model.Project;
import com.codepine.api.testrail.model.ResultField;
import com.codepine.api.testrail.model.Run;
import com.codepine.api.testrail.model.Suite;
import java.time.LocalDateTime;
import java.util.List;

public class TestRailClient {

  public static final TestRail testRail;
  public static final Run run;
  public static List<ResultField> customResultFields;

  static {

    testRail = TestRail.builder("https://odatsiuk.testrail.io/",
        "olegdatsiuk2811@gmail.com", "e1Tpk7ydLU9p7eYl4ar6").build();

    Project project = testRail.projects().list().execute().get(0);

    Suite smokeSuite = testRail.suites().list(project.getId()).execute().stream()
        .filter(s -> s.getName().equals("Smoke suite")).findFirst().orElseThrow(
            () -> new IllegalArgumentException(
                "There is no section (suite) with name [Smoke suite]"));

    run = testRail.runs()
        .add(project.getId(),
            new Run().setSuiteId(smokeSuite.getId()).setName("Smoke run_" + LocalDateTime.now()))
        .execute();

    customResultFields = testRail.resultFields().list().execute();
  }

}
