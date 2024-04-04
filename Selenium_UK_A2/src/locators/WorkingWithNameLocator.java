package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithNameLocator {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.skillrary.com/user/login");
	Thread.sleep(3000);
	driver.findElement(By.name("email")).sendKeys("selenium@gmail.com");
	Thread.sleep(4000);
	driver.findElement(By.name("password")).sendKeys("selenium@123");
	Thread.sleep(4000);
	driver.quit();
}
}
