package screenshots;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ToTakeScreenshot_WebElement {
public static void main(String[] args) throws  InterruptedException, IOException {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://demowebshop.tricentis.com/login");
	
	WebElement element = driver.findElement(By.xpath("//img[@alt=\"Tricentis Demo Web Shop\"]"));
	
	File source = element.getScreenshotAs(OutputType.FILE);
	File destiny=new File("ScreenShots//WebElement_Snap.png");
	
	FileHandler.copy(source, destiny);
	
	Thread.sleep(3000);
	driver.quit();
	
	
}
}
