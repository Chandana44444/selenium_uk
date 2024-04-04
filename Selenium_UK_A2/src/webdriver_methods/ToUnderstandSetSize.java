package webdriver_methods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUnderstandSetSize {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.shoppersstack.com/products_page/6");
	driver.manage().window().maximize();
	Thread.sleep(5000);
	Dimension size=new Dimension(500, 600);
	driver.manage().window().setSize(size);
	Thread.sleep(6000);
	driver.quit();
}
}
