package testng_concepts;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToWorkWithTimeOut {//testng class
@Test(timeOut = 3000)
public void demo_02() throws InterruptedException {
	Reporter.log("hi testng2",true);//on console
	ChromeDriver driver=new ChromeDriver();
//	driver.get("https://www.shoppersstack.com/");//TimeOutException
	driver.get("https://demowebshop.tricentis.com/");
	Thread.sleep(3000);
	driver.quit();
}
}
