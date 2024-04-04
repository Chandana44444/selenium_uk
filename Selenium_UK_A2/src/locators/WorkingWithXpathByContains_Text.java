package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithXpathByContains_Text {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/apparel-shoes");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[contains(text(),'Genuine Leather Handbag')]")).click();
		Thread.sleep(4000);
		driver.quit();
	}
}
