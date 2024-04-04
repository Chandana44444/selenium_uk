package webdriver_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUnderstandNavigate {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/");//home page
	System.out.println("first time:"+driver.getTitle());
	Thread.sleep(6000);
	driver.findElement(By.linkText("Log in")).click();//login page
	System.out.println("after clicking login button:"+driver.getTitle());
	Thread.sleep(6000);
	driver.navigate().back();//home page
	System.out.println("after performing back operation:"+driver.getTitle());
	Thread.sleep(6000);
	driver.navigate().forward();//login page
	System.out.println("after performing forward action:"+driver.getTitle());
	Thread.sleep(6000);
	driver.navigate().refresh();//login page is refreshed
	System.out.println("after refreshing:"+driver.getTitle());
	Thread.sleep(6000);
	driver.navigate().to("https://www.skillrary.com/user/login");//navigate to a particular url as mentioned
	System.out.println("after using to method:"+driver.getCurrentUrl());
	Thread.sleep(6000);
	driver.quit();
}
}
