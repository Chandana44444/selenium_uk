package TestNG_XML;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestScript_01 extends BaseClass{
@Test
public void functionaltest_01() {
	Reporter.log("test script-01,method-01 started",true);
	driver.findElement(By.id("small-searchterms")).sendKeys("books");
	driver.findElement(By.cssSelector("input[value=\"Search\"]")).click();
}
@Test
public void functionaltest_02() {
	Reporter.log("test script-01,method-02 started",true);
	driver.findElement(By.id("pollanswers-1")).click();
}
}
