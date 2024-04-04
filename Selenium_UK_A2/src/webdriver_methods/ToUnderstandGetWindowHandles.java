package webdriver_methods;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUnderstandGetWindowHandles {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.shoppersstack.com/products_page/6");
	Thread.sleep(6000);
	driver.findElement(By.id("compare")).click();
	Thread.sleep(4000);
	Set<String> id = driver.getWindowHandles();
	System.out.println(id);
}
}
