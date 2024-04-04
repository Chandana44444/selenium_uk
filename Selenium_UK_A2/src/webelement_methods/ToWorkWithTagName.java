package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWithTagName {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://demowebshop.tricentis.com/register");
	Thread.sleep(3000);
	
	WebElement first_name_field = driver.findElement(By.id("FirstName"));
	System.out.println("first name text box is developed using: "+first_name_field.getTagName()+" tag name");
	
	Thread.sleep(4000);
	driver.quit();

}
}
