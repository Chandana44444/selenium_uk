package testng_listeners;

import java.sql.Driver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	public static ChromeDriver driver;
@BeforeClass
public void open_browser() {
    driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
}
@AfterClass
public void close_browser() {
	driver.quit();
}
int a=01;
}
