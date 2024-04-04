package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithXpathByDependantAndIndependant {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/apparel-shoes");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[text()='Blue Jeans']/../../..//input[@value=\"Add to cart\"]")).click();
		Thread.sleep(4000);
		driver.quit();
	}
}
