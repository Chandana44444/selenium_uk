package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToWorkWithClickAndHold{
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://selenium08.blogspot.com/2020/01/click-and-hold.html");
	Thread.sleep(4000);
	
	WebElement click_hold_ele = driver.findElement(By.name("C"));
	
	Actions act=new Actions(driver);
	act.clickAndHold(click_hold_ele).perform();
	
	Thread.sleep(4000);
	//driver.quit();
	
	
}
}
