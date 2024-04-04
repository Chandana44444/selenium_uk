package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToWorkWithRightClick {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	Thread.sleep(2000);
	
	WebElement right_click_ele = driver.findElement(By.xpath("//span[text()='right click me']"));
	
	Actions act=new Actions(driver);
	act.contextClick(right_click_ele).perform();
	
	Thread.sleep(4000);
	//driver.quit();
}
}
