package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWithIsSelected {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://demowebshop.tricentis.com/login");
	Thread.sleep(4000);
	
	WebElement remember_check_box = driver.findElement(By.id("RememberMe"));
	System.out.println("first time:"+remember_check_box.isSelected());
	
	if(remember_check_box.isSelected()) {//false
		System.out.println("not selected");
		//remember_check_box.click();
	}
	else
	{
		remember_check_box.click();
		System.out.println("is selected");
		
	}
	
	Thread.sleep(4000);
	driver.quit();
}
}
