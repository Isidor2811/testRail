package tests;

import io.qameta.allure.Issue;
import io.qameta.allure.Issues;
import io.qameta.allure.TmsLink;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests {


  @Test
  @TmsLink("208")
  @Issue("https://https://jira-OX-78.com")
  public void loginTest() {
    Assert.assertEquals(3, 10, "Expected result should be 10");
  }
  
  @Test
  @TmsLink("209")
  public void loginTest_1() {
    Assert.assertEquals(4, 10, "Expected result should be 10");
  }

  @Test
  @Issues({@Issue("https://jira-OX-323.com"), @Issue("https://jira-OX-753.com")})
  @TmsLink("210")
  public void loginTest_2() {
    Assert.assertEquals("Login unsuccessful", "Login successful", "Expected result should be [Login successful]");
  }

  @Test
  @TmsLink("211")
  public void loginTest_3() {
    Assert.assertTrue(true);
  }

  @Test
  @TmsLink("212")
  public void loginTest_4() {
    Assert.assertTrue(true);
  }

  @Test
  @TmsLink("213")
  public void loginTest_5() {
    Assert.assertTrue(true);
  }

  @Test
  @TmsLink("214")
  public void loginTest_6() {
    Assert.assertTrue(true);
  }

  @Test
  @TmsLink("215")
  public void loginTest_7() {
    Assert.assertTrue(true);
  }

  @Test
  @TmsLink("216")
  public void loginTest_8() {
    Assert.assertTrue(true);
  }

  @Test
  @TmsLink("217")
  public void loginTest_9() {
    Assert.assertTrue(true);
  }

  @Test
  @TmsLink("218")
  public void loginTest_10() {
    Assert.assertTrue(true);
  }

  @Test
  @TmsLink("219")
  public void loginTest_11() {
    Assert.assertTrue(true);
  }

  @Test
  @TmsLink("220")
  public void loginTest_12() {
    Assert.assertTrue(true);
  }

  @Test
  @TmsLink("221")
  public void loginTest_13() {
    Assert.assertTrue(true);
  }

  @Test
  @TmsLink("222")
  public void loginTest_14() {
    Assert.assertTrue(true);
  }

  @Test
  @TmsLink("223")
  public void loginTest_15() {
    Assert.assertTrue(true);
  }

  @Test
  @TmsLink("224")
  public void loginTest_16() {
    Assert.assertTrue(true);
  }

  @Test
  @TmsLink("225")
  public void loginTest_17() {
    Assert.assertTrue(true);
  }

  @Test
  @TmsLink("226")
  public void loginTest_18() {
    Assert.assertTrue(true);
  }

  @Test
  @TmsLink("227")
  public void loginTest_19() {
    Assert.assertTrue(true);
  }

  @Test
  @TmsLink("228")
  public void loginTest_20() {
    Assert.assertTrue(true);
  }


}
