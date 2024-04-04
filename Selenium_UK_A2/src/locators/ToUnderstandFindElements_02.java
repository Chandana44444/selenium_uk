package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUnderstandFindElements_02 {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/register");
	Thread.sleep(3000);
	List<WebElement> elements = driver.findElements(By.xpath("//input[@type=\"text\"]"));
	System.out.println(elements);//address
	
	for(int i=0;i<elements.size();i++) {
		elements.get(i).sendKeys("abcd");
		Thread.sleep(6000);
	}
	
	Thread.sleep(6000);
	driver.quit();
	
}
}
//String arr[]={"abc","cde","efd"};