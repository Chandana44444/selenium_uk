package webdriver_methods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToUnderstandFullScreen {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	Thread.sleep(4000);
	driver.get("https://www.shoppersstack.com/products_page/6");
	driver.manage().window().fullscreen();//method chaining
	Thread.sleep(6000);
	//driver.quit();
}
}
