package listeners;

import static testrail.TestRailClient.customResultFields;
import static testrail.TestRailClient.run;
import static testrail.TestRailClient.testRail;

import com.codepine.api.testrail.model.Result;
import java.io.File;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import lombok.Getter;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.testng.ISuite;
import org.testng.ISuiteListener;

@Slf4j
@Getter
public class MyISuiteListener implements ISuiteListener {

  public static File file;
  public static FileWriter writer;

  @SneakyThrows
  public void onStart(ISuite suite) {
    file = new File(
        System.getProperty("user.dir") + "/src/main/resources/" + suite.getName() + ".csv");

    //delete file if exist (every tun should create a new file)
    boolean isDeleted = file.delete();
    if (isDeleted) {
      log.info("File {} was successfully deleted", file.getName());
    } else {
      log.info("File {} not exist yet", file.getName());
    }

    boolean isCreated = file.createNewFile();
    if (isCreated) {
      log.info("File {} was successfully created", file.getName());
    }

    writer = new FileWriter(file, true);
    writer.write("id,status,comment,defectLink\n");

  }

  @SneakyThrows
  public void onFinish(ISuite suite) {

    writer.flush();

    List<String> rows = Files.readAllLines(Paths.get(file.getPath())).stream().skip(1).collect(
        Collectors.toList());

    List<Result> results = new ArrayList<>();

    for (String row : rows) {
      List<String> split = Arrays.asList(row.split(","));

      Result result = new Result();
      result.setCaseId(Integer.valueOf(split.get(0)));
      result.setStatusId(Integer.valueOf(split.get(1)));

      //set failure message
      if (!split.get(2).equals("null")) {
        result.setComment(split.get(2));
      }

      //set defects
      if (!split.get(3).equals("null")) {
        List<String> defectsInFile = split.stream().skip(3).collect(Collectors.toList());
        for (String defect : defectsInFile) {
          result.addDefect(defect);
        }
      }

      results.add(result);
    }

    long startTime = System.nanoTime();
    testRail.results().addForCases(run.getId(), results, customResultFields).execute();
    long endTime = System.nanoTime();
    long duration = (endTime - startTime) / 1000000;

    System.out.println("Time for add results to TestRail is: " + duration + " milliseconds");
    testRail.runs().close(run.getId()).execute();

  }

}
