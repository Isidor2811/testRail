package tests;

import io.qameta.allure.Issue;
import io.qameta.allure.Issues;
import io.qameta.allure.TmsLink;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MakeOrderTests {


  @Test
  @TmsLink("292")
  @Issue("https://https://jira-OX-78.com")
  public void makeOrderTest() {
    Assert.assertEquals(3, 10, "Expected result should be 10");
  }
  
  @Test
  @TmsLink("293")
  public void makeOrderTest_1() {
    Assert.assertEquals(4, 10, "Expected result should be 10");
  }

  @Test
  @Issues({@Issue("https://jira-OX-323.com"), @Issue("https://jira-OX-753.com")})
  @TmsLink("294")
  public void makeOrderTest_2() {
    Assert.assertEquals("Login unsuccessful", "Login successful", "Expected result should be [Login successful]");
  }

  @Test
  @TmsLink("295")
  public void makeOrderTest_3() {
    Assert.assertTrue(true);
  }

  @Test
  @TmsLink("296")
  public void makeOrderTest_4() {
    Assert.assertTrue(true);
  }

  @Test
  @TmsLink("297")
  public void makeOrderTest_5() {
    Assert.assertTrue(true);
  }

  @Test
  @TmsLink("298")
  public void makeOrderTest_6() {
    Assert.assertTrue(true);
  }

  @Test
  @TmsLink("299")
  public void makeOrderTest_7() {
    Assert.assertTrue(true);
  }

  @Test
  @TmsLink("300")
  public void makeOrderTest_8() {
    Assert.assertTrue(true);
  }

  @Test
  @TmsLink("301")
  public void makeOrderTest_9() {
    Assert.assertTrue(true);
  }

  @Test
  @TmsLink("302")
  public void makeOrderTest_10() {
    Assert.assertTrue(true);
  }

  @Test
  @TmsLink("303")
  public void makeOrderTest_11() {
    Assert.assertTrue(true);
  }

  @Test
  @TmsLink("304")
  public void makeOrderTest_12() {
    Assert.assertTrue(true);
  }

  @Test
  @TmsLink("305")
  public void makeOrderTest_13() {
    Assert.assertTrue(true);
  }

  @Test
  @TmsLink("306")
  public void makeOrderTest_14() {
    Assert.assertTrue(true);
  }

  @Test
  @TmsLink("307")
  public void makeOrderTest_15() {
    Assert.assertTrue(true);
  }

  @Test
  @TmsLink("308")
  public void makeOrderTest_16() {
    Assert.assertTrue(true);
  }

  @Test
  @TmsLink("309")
  public void makeOrderTest_17() {
    Assert.assertTrue(true);
  }

  @Test
  @TmsLink("310")
  public void makeOrderTest_18() {
    Assert.assertTrue(true);
  }

  @Test
  @TmsLink("311")
  public void makeOrderTest_19() {
    Assert.assertTrue(true);
  }

  @Test
  @TmsLink("312")
  public void makeOrderTest_20() {
    Assert.assertTrue(true);
  }
  

}
