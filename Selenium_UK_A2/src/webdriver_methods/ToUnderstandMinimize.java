package webdriver_methods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToUnderstandMinimize {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	Thread.sleep(4000);
	driver.manage().window().minimize();//method chaining
	driver.get("https://www.shoppersstack.com/products_page/6");
	Thread.sleep(4000);
	driver.quit();
}
}
