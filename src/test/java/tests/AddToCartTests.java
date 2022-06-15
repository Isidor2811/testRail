package tests;

import io.qameta.allure.Issue;
import io.qameta.allure.Issues;
import io.qameta.allure.TmsLink;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddToCartTests {


  @Test
  @TmsLink("271")
  @Issue("https://https://jira-OX-78.com")
  public void addToCartTest() {
    Assert.assertEquals(3, 10, "Expected result should be 10");
  }
  
  @Test
  @TmsLink("272")
  public void addToCartTest_1() {
    Assert.assertEquals(4, 10, "Expected result should be 10");
  }

  @Test
  @Issues({@Issue("https://jira-OX-323.com"), @Issue("https://jira-OX-753.com")})
  @TmsLink("273")
  public void addToCartTest_2() {
    Assert.assertEquals("Login unsuccessful", "Login successful", "Expected result should be [Login successful]");
  }

  @Test
  @TmsLink("274")
  public void addToCartTest_3() {
    Assert.assertTrue(true);
  }

  @Test
  @TmsLink("275")
  public void addToCartTest_4() {
    Assert.assertTrue(true);
  }

  @Test
  @TmsLink("276")
  public void addToCartTest_5() {
    Assert.assertTrue(true);
  }

  @Test
  @TmsLink("277")
  public void addToCartTest_6() {
    Assert.assertTrue(true);
  }

  @Test
  @TmsLink("278")
  public void addToCartTest_7() {
    Assert.assertTrue(true);
  }

  @Test
  @TmsLink("279")
  public void addToCartTest_8() {
    Assert.assertTrue(true);
  }

  @Test
  @TmsLink("280")
  public void addToCartTest_9() {
    Assert.assertTrue(true);
  }

  @Test
  @TmsLink("281")
  public void addToCartTest_10() {
    Assert.assertTrue(true);
  }

  @Test
  @TmsLink("282")
  public void addToCartTest_11() {
    Assert.assertTrue(true);
  }

  @Test
  @TmsLink("283")
  public void addToCartTest_12() {
    Assert.assertTrue(true);
  }

  @Test
  @TmsLink("284")
  public void addToCartTest_13() {
    Assert.assertTrue(true);
  }

  @Test
  @TmsLink("285")
  public void addToCartTest_14() {
    Assert.assertTrue(true);
  }

  @Test
  @TmsLink("286")
  public void addToCartTest_15() {
    Assert.assertTrue(true);
  }

  @Test
  @TmsLink("287")
  public void addToCartTest_16() {
    Assert.assertTrue(true);
  }

  @Test
  @TmsLink("288")
  public void addToCartTest_17() {
    Assert.assertTrue(true);
  }

  @Test
  @TmsLink("289")
  public void addToCartTest_18() {
    Assert.assertTrue(true);
  }

  @Test
  @TmsLink("290")
  public void addToCartTest_19() {
    Assert.assertTrue(true);
  }

  @Test
  @TmsLink("291")
  public void addToCartTest_20() {
    Assert.assertTrue(true);
  }
  

}
