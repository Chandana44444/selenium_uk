package webdriver_methods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUnderstandGetSize {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	Thread.sleep(4000);
	driver.get("https://www.shoppersstack.com/products_page/6");
	driver.manage().window().maximize();
	Dimension size = driver.manage().window().getSize();
	System.out.println(size);
	int height = driver.manage().window().getSize().getHeight();//int
	System.out.println("height:"+height);
	int width = driver.manage().window().getSize().getWidth();//int
	System.out.println("width:"+width);
	Thread.sleep(6000);
	driver.quit();
}
}
