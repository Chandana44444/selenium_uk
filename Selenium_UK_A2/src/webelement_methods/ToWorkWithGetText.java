package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWithGetText {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demowebshop.tricentis.com/login");
		Thread.sleep(4000);

		WebElement login_btn = driver.findElement(By.xpath("//input[@value=\"Log in\"]"));
		login_btn.click();

		WebElement error_msg = driver.findElement(By.xpath("//div[@class='message-error']"));
		System.out.println("Error Message is:" + error_msg.getText());

		Thread.sleep(4000);
		driver.quit();
	}
}
