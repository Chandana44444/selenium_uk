package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWithSubmit {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/");
	Thread.sleep(3000);
//	driver.findElement(By.xpath("(//input[@type=\"submit\"])[1]")).submit();
//	Thread.sleep(3000);
	driver.findElement(By.id("newsletter-subscribe-button")).submit();
	Thread.sleep(3000);
	driver.quit();
	
}
}
