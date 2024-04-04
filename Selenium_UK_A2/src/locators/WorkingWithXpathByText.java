package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithXpathByText {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/login");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		Thread.sleep(4000);
		driver.quit();
	}
}
