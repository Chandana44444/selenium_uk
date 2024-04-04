package webdriver_methods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToUnderstandGetPageSource {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.skillrary.com/user/login");
	Thread.sleep(6000);
	String code=driver.getPageSource();
	System.out.println(code);
}
}
