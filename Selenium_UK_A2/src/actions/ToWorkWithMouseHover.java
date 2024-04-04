package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToWorkWithMouseHover {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://demowebshop.tricentis.com/");
	Thread.sleep(3000);
	
	WebElement ele = driver.findElement(By.partialLinkText("COMPUTERS"));
	Thread.sleep(3000);

	Actions act=new Actions(driver);
	act.moveToElement(ele).perform();
	
	Thread.sleep(4000);
	driver.quit();
}
}
