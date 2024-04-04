package webdriver_methods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToUnderstandGetWindowHandle {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.selenium.dev/downloads/");
	String id=driver.getWindowHandle();
	System.out.println(id);
}
}
