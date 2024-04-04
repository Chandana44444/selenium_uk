package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToWorkWithDisplayed {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.skillrary.com/");
		Thread.sleep(4000);

		if (driver.findElement(By.partialLinkText("SIGN IN")).isDisplayed()) {
			System.out.println("the application is opened in English Language");
		} else {
			System.out.println("Other Language");
		}

		Thread.sleep(4000);
		driver.quit();
	}
}
