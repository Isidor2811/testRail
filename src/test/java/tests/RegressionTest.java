package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RegressionTest {


  //should be skipped because of issue
  @Test
  public void filterTest() {
    Assert.assertEquals(3, 10, "Expected result should be 10");
  }

  //should be red in allure report (failed without @Issue)
  @Test
  public void orderTest() {
    Assert.assertEquals(4, 10, "Expected result should be 10");
  }

  @Test
  public void sliderTest() {
    Assert.assertTrue(true);
  }

  @Test
  public void removeAccountTest() {
    Assert.assertTrue(true);
  }

}
