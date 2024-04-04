package javascriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWithDisabledElement {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.w3schools.com/cssref/tryit.php?filename=trycss3_enabled_disabled");
	Thread.sleep(10000);
	
	driver.switchTo().frame(0);
	Thread.sleep(4000);
	
	WebElement disabled_ele = driver.findElement(By.xpath("(//input[@type=\"text\"])[3]"));
	//disabled_ele.sendKeys("selenium");//ElementNotInteractableException
	
	driver.executeScript("arguments[0].value='selenium';", disabled_ele);
	
	Thread.sleep(3000);
	//driver.quit();
}
}
