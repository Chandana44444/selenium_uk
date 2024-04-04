package webdriver_methods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToUnderstandGetCurrentUrl {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.selenium.dev/downloads/");
	String title=driver.getTitle();
	System.out.println(title);
	String url=driver.getCurrentUrl();
	System.out.println(url);
}
}
