package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWithAttribute_02 {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.woodenstreet.com/");
	Thread.sleep(3000);
	
	WebElement img_not_loaded_properly = driver.findElement(By.xpath("//img[@alt=\"buy wooden furniture in India\"]"));
	System.out.println("the img that is not loaded is:"+img_not_loaded_properly.getAttribute("alt"));
	
	System.out.println("*****************");
	
	WebElement tool_tip = driver.findElement(By.xpath("//img[@alt=\"Wooden Sofa Set Furniture\"]"));
	System.out.println("Tool tip of image:"+tool_tip.getAttribute("title"));
	
	Thread.sleep(4000);
	driver.quit();
	
}
}
