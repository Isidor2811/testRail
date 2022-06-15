package tests;

import io.qameta.allure.Issue;
import io.qameta.allure.TmsLink;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Smoke {


  //should be skipped because of issue
  @Test
  @TmsLink("35")
  @Issue("https://jira.bla.bla.bla")
  public void loginTest() {
    Assert.assertEquals(3, 10, "Expected result should be 10");
  }

  //should be red in allure report (failed without @Issue)
  @Test
  @TmsLink("36")
  public void signUpTest() {
    Assert.assertEquals(4, 10, "Expected result should be 10");
  }

  @Test
  @TmsLink("37")
  public void addToCartTest() {
    Assert.assertTrue(true);
  }

  @Test
  @TmsLink("38")
  public void makeOrderTest() {
    Assert.assertTrue(true);
  }

  @Test
  @TmsLink("39")
  public void checkoutTest() {
    Assert.assertTrue(true);
  }

  @Test
  @TmsLink("40")
  public void checkOrderDetailsTest() {
    Assert.assertTrue(true);
  }

}
