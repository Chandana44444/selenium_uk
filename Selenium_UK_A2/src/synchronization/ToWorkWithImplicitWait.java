package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWithImplicitWait {
public static void main(String[] args) throws InterruptedException {
	
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));//No such element exception
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.get("https://www.shoppersstack.com/");
	
	driver.findElement(By.xpath("//span[text()='SAMSUNG']")).click();
	Thread.sleep(2000);//
	driver.quit();
}
}
