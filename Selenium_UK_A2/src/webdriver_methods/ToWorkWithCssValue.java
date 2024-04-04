package webdriver_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWithCssValue {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demowebshop.tricentis.com/login");
		Thread.sleep(4000);

		WebElement login_btn = driver.findElement(By.xpath("//input[@value=\"Log in\"]"));
		login_btn.click();

		WebElement error_msg = driver.findElement(By.xpath("//div[@class='message-error']"));
		System.out.println("Error Message is:" + error_msg.getText());
		System.out.println("Colour is:"+error_msg.getCssValue("color"));
	    System.out.println("Font family:"+error_msg.getCssValue("font-family"));
	   System.out.println("Background color:"+error_msg.getCssValue("property name that is not present"));//blank,no error
		Thread.sleep(4000);
		driver.quit();
	}
}
