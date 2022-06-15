package tests;

import io.qameta.allure.Issue;
import io.qameta.allure.Issues;
import io.qameta.allure.TmsLink;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DashBoardTests {


  @Test
  @TmsLink("250")
  @Issue("https://https://jira-OX-78.com")
  public void dashBoardTest() {
    Assert.assertEquals(3, 10, "Expected result should be 10");
  }
  
  @Test
  @TmsLink("251")
  public void dashBoardTest_1() {
    Assert.assertEquals(4, 10, "Expected result should be 10");
  }

  @Test
  @Issues({@Issue("https://jira-OX-323.com"), @Issue("https://jira-OX-753.com")})
  @TmsLink("252")
  public void dashBoardTest_2() {
    Assert.assertEquals("Login unsuccessful", "Login successful", "Expected result should be [Login successful]");
  }

  @Test
  @TmsLink("253")
  public void dashBoardTest_3() {
    Assert.assertTrue(true);
  }

  @Test
  @TmsLink("254")
  public void dashBoardTest_4() {
    Assert.assertTrue(true);
  }

  @Test
  @TmsLink("255")
  public void dashBoardTest_5() {
    Assert.assertTrue(true);
  }

  @Test
  @TmsLink("256")
  public void dashBoardTest_6() {
    Assert.assertTrue(true);
  }

  @Test
  @TmsLink("257")
  public void dashBoardTest_7() {
    Assert.assertTrue(true);
  }

  @Test
  @TmsLink("258")
  public void dashBoardTest_8() {
    Assert.assertTrue(true);
  }

  @Test
  @TmsLink("259")
  public void dashBoardTest_9() {
    Assert.assertTrue(true);
  }

  @Test
  @TmsLink("260")
  public void dashBoardTest_10() {
    Assert.assertTrue(true);
  }

  @Test
  @TmsLink("261")
  public void dashBoardTest_11() {
    Assert.assertTrue(true);
  }

  @Test
  @TmsLink("262")
  public void dashBoardTest_12() {
    Assert.assertTrue(true);
  }

  @Test
  @TmsLink("263")
  public void dashBoardTest_13() {
    Assert.assertTrue(true);
  }

  @Test
  @TmsLink("264")
  public void dashBoardTest_14() {
    Assert.assertTrue(true);
  }

  @Test
  @TmsLink("265")
  public void dashBoardTest_15() {
    Assert.assertTrue(true);
  }

  @Test
  @TmsLink("266")
  public void dashBoardTest_16() {
    Assert.assertTrue(true);
  }

  @Test
  @TmsLink("267")
  public void dashBoardTest_17() {
    Assert.assertTrue(true);
  }

  @Test
  @TmsLink("268")
  public void dashBoardTest_18() {
    Assert.assertTrue(true);
  }

  @Test
  @TmsLink("269")
  public void dashBoardTest_19() {
    Assert.assertTrue(true);
  }

  @Test
  @TmsLink("270")
  public void dashBoardTest_20() {
    Assert.assertTrue(true);
  }
  

}
