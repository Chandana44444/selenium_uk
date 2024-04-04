package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWithSizeandLocation {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://demowebshop.tricentis.com/register");
	Thread.sleep(3000);
	
	WebElement first_name_field = driver.findElement(By.id("FirstName"));
	int height = first_name_field.getSize().getHeight();
	System.out.println(height);
	int width = first_name_field.getSize().getWidth();
	System.out.println(width);
	
	System.out.println("***************");

	int x = first_name_field.getLocation().getX();
	int y = first_name_field.getLocation().getY();
	
	System.out.println(x);
	System.out.println(y);

	
	Thread.sleep(3000);
	driver.quit();
}
}
