package tests;

import io.qameta.allure.Issue;
import io.qameta.allure.Issues;
import io.qameta.allure.TmsLink;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignUpTests {


  @Test
  @TmsLink("229")
  @Issue("https://https://jira-OX-78.com")
  public void signupTest() {
    Assert.assertEquals(3, 10, "Expected result should be 10");
  }
  
  @Test
  @TmsLink("230")
  public void signupTest_1() {
    Assert.assertEquals(4, 10, "Expected result should be 10");
  }

  @Test
  @Issues({@Issue("https://jira-OX-323.com"), @Issue("https://jira-OX-753.com")})
  @TmsLink("231")
  public void signupTest_2() {
    Assert.assertEquals("Login unsuccessful", "Login successful", "Expected result should be [Login successful]");
  }

  @Test
  @TmsLink("232")
  public void signupTest_3() {
    Assert.assertTrue(true);
  }

  @Test
  @TmsLink("233")
  public void signupTest_4() {
    Assert.assertTrue(true);
  }

  @Test
  @TmsLink("234")
  public void signupTest_5() {
    Assert.assertTrue(true);
  }

  @Test
  @TmsLink("235")
  public void signupTest_6() {
    Assert.assertTrue(true);
  }

  @Test
  @TmsLink("236")
  public void signupTest_7() {
    Assert.assertTrue(true);
  }

  @Test
  @TmsLink("237")
  public void signupTest_8() {
    Assert.assertTrue(true);
  }

  @Test
  @TmsLink("238")
  public void signupTest_9() {
    Assert.assertTrue(true);
  }

  @Test
  @TmsLink("239")
  public void signupTest_10() {
    Assert.assertTrue(true);
  }

  @Test
  @TmsLink("240")
  public void signupTest_11() {
    Assert.assertTrue(true);
  }

  @Test
  @TmsLink("241")
  public void signupTest_12() {
    Assert.assertTrue(true);
  }

  @Test
  @TmsLink("242")
  public void signupTest_13() {
    Assert.assertTrue(true);
  }

  @Test
  @TmsLink("243")
  public void signupTest_14() {
    Assert.assertTrue(true);
  }

  @Test
  @TmsLink("244")
  public void signupTest_15() {
    Assert.assertTrue(true);
  }

  @Test
  @TmsLink("245")
  public void signupTest_16() {
    Assert.assertTrue(true);
  }

  @Test
  @TmsLink("246")
  public void signupTest_17() {
    Assert.assertTrue(true);
  }

  @Test
  @TmsLink("247")
  public void signupTest_18() {
    Assert.assertTrue(true);
  }

  @Test
  @TmsLink("248")
  public void signupTest_19() {
    Assert.assertTrue(true);
  }

  @Test
  @TmsLink("249")
  public void signupTest_20() {
    Assert.assertTrue(true);
  }
  

}
