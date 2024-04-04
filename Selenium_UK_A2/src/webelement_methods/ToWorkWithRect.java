package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWithRect {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://demowebshop.tricentis.com/register");
	Thread.sleep(3000);
	
	WebElement first_name_field = driver.findElement(By.id("FirstName"));
	WebElement last_name_field = driver.findElement(By.id("LastName"));
	
	int fname_x_value = first_name_field.getRect().getPoint().getX();
	int lname_x_value = last_name_field.getRect().getPoint().getX();
	
	System.out.println("x coordinate value for first name text field:"+fname_x_value);
	System.out.println("x coordinate value for last name text field:"+lname_x_value);
	
	int fname_y_value = first_name_field.getRect().getPoint().getY();
	int lname_y_value = last_name_field.getRect().getY();
	
	System.out.println("Y axis value for first name:"+fname_y_value);
	System.out.println("Y axis value for last name:"+lname_y_value);

	if(lname_x_value== fname_x_value) {
		System.out.println("its alligned properly");
	}
	else
	{
		System.out.println("not alligned properly");
	}
	
	int fname_height = first_name_field.getRect().getDimension().getHeight();
	int fname_width = first_name_field.getRect().getWidth();
	int lname_height = last_name_field.getRect().getHeight();
	int lname_width = last_name_field.getRect().getWidth();
	
	System.out.println("**************");
	System.out.println("first name:");
	System.out.println("width:"+fname_width);
	System.out.println("height:"+fname_height);
	System.out.println("**************");
	System.out.println("last name:");
	System.out.println("width:"+lname_width);
	System.out.println("height:"+lname_height);
	System.out.println("**************");
	
	Thread.sleep(3000);
	driver.quit();

	

}
}
