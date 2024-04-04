package webdriver_methods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToUnderstandGetTitle {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.selenium.dev/downloads/");
	String title=driver.getTitle();
	System.out.println(title);
}
}
