package javascriptExecutor;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWithScrollBy {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://demowebshop.tricentis.com/");
	Thread.sleep(3000);
	
	driver.executeScript("window.scrollBy(0,500);");//scroll down
	Thread.sleep(2000);
	driver.executeScript("window.scrollBy(0,-400);");//scroll up
	Thread.sleep(3000);
	driver.executeScript("window.scrollBy(0,500);");//scroll down
	
	driver.quit();
}
}
