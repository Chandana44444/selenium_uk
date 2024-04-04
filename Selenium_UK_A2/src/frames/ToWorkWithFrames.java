package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWithFrames {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.dream11.com/");
	Thread.sleep(3000);
	
	//driver.switchTo().frame(0);
	//driver.switchTo().frame("send-sms-iframe");
	WebElement frame_01 = driver.findElement(By.cssSelector("iframe[id=\"send-sms-iframe\"]"));
	driver.switchTo().frame(frame_01);
	driver.findElement(By.id("regEmail")).sendKeys("1325436");
	driver.switchTo().parentFrame();//its immediate parent frame
	driver.switchTo().defaultContent();//main frame
	driver.findElement(By.id("menu_parent")).click();
	
	Thread.sleep(5000);
	driver.quit();
}
}
