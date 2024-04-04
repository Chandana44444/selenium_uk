package webdriver_methods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUnderstandSwitch_window {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.shoppersstack.com/products_page/6");
	Thread.sleep(8000);
	driver.findElement(By.id("compare")).click();
	Thread.sleep(4000);
	Set<String> all_windows_id = driver.getWindowHandles();
	System.out.println(all_windows_id);
	
	for(String id:all_windows_id) {
		System.out.println(id);
		driver.switchTo().window(id);
		System.out.println(driver.getTitle());
	}
	
	Thread.sleep(6000);
	driver.quit();
	
}
}
