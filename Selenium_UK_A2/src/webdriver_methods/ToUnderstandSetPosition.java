package webdriver_methods;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUnderstandSetPosition {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/");
	
	Point p=new Point(150, 80);
	driver.manage().window().setPosition(p);
}
}
