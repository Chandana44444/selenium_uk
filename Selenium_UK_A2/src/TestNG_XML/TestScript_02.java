package TestNG_XML;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestScript_02 extends BaseClass{
@Test
public void functionaltest_01() {
	Reporter.log("test script-02,method-01 started",true);
	driver.findElement(By.id("newsletter-email")).sendKeys("selenium");
}
//@Test
//public void functionaltest_02() {
//	Reporter.log("script-02 started",true);
//	driver.findElement(By.id("pollanswers-1")).click();
//}
}
