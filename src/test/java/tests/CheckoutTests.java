package tests;

import io.qameta.allure.Issue;
import io.qameta.allure.Issues;
import io.qameta.allure.TmsLink;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckoutTests {


  @Test
  @TmsLink("313")
  @Issue("https://https://jira-OX-78.com")
  public void checkoutTest() {
    Assert.assertEquals(3, 10, "Expected result should be 10");
  }
  
  @Test
  @TmsLink("314")
  public void checkoutTest_1() {
    Assert.assertEquals(4, 10, "Expected result should be 10");
  }

  @Test
  @Issues({@Issue("https://jira-OX-323.com"), @Issue("https://jira-OX-753.com")})
  @TmsLink("315")
  public void checkoutTest_2() {
    Assert.assertEquals("Login unsuccessful", "Login successful", "Expected result should be [Login successful]");
  }

  @Test
  @TmsLink("316")
  public void checkoutTest_3() {
    Assert.assertTrue(true);
  }

  @Test
  @TmsLink("317")
  public void checkoutTest_4() {
    Assert.assertTrue(true);
  }

  @Test
  @TmsLink("318")
  public void checkoutTest_5() {
    Assert.assertTrue(true);
  }

  @Test
  @TmsLink("319")
  public void checkoutTest_6() {
    Assert.assertTrue(true);
  }

  @Test
  @TmsLink("320")
  public void checkoutTest_7() {
    Assert.assertTrue(true);
  }

  @Test
  @TmsLink("321")
  public void checkoutTest_8() {
    Assert.assertTrue(true);
  }

  @Test
  @TmsLink("322")
  public void checkoutTest_9() {
    Assert.assertTrue(true);
  }

  @Test
  @TmsLink("323")
  public void checkoutTest_10() {
    Assert.assertTrue(true);
  }

  @Test
  @TmsLink("324")
  public void checkoutTest_11() {
    Assert.assertTrue(true);
  }

  @Test
  @TmsLink("325")
  public void checkoutTest_12() {
    Assert.assertTrue(true);
  }

  @Test
  @TmsLink("326")
  public void checkoutTest_13() {
    Assert.assertTrue(true);
  }

  @Test
  @TmsLink("327")
  public void checkoutTest_14() {
    Assert.assertTrue(true);
  }

  @Test
  @TmsLink("328")
  public void checkoutTest_15() {
    Assert.assertTrue(true);
  }

  @Test
  @TmsLink("329")
  public void checkoutTest_16() {
    Assert.assertTrue(true);
  }

  @Test
  @TmsLink("330")
  public void checkoutTest_17() {
    Assert.assertTrue(true);
  }

  @Test
  @TmsLink("331")
  public void checkoutTest_18() {
    Assert.assertTrue(true);
  }

  @Test
  @TmsLink("332")
  public void checkoutTest_19() {
    Assert.assertTrue(true);
  }

  @Test
  @TmsLink("333")
  public void checkoutTest_20() {
    Assert.assertTrue(true);
  }
  

}
