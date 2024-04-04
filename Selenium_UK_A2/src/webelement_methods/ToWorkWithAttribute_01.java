package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToWorkWithAttribute_01 {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/login");
		Thread.sleep(4000);

		WebElement email_text_box = driver.findElement(By.id("Email"));
		System.out.println("Before entering the data:"+email_text_box.getAttribute("value"));//blank
		email_text_box.sendKeys("Selenium");
		System.out.println("the data entered is:"+email_text_box.getAttribute("value"));
		Thread.sleep(4000);
		driver.quit();
	}
}
