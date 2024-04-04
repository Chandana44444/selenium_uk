package webdriver_methods;

import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUnderstandSwitch_newwindow {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/");
	Thread.sleep(6000);
	driver.switchTo().newWindow(WindowType.TAB);
	driver.get("https://www.skillrary.com/user/login");
	Thread.sleep(6000);
	driver.switchTo().newWindow(WindowType.WINDOW);
	driver.get("https://www.shoppersstack.com/");
	Thread.sleep(6000);
	driver.quit();
}
}
