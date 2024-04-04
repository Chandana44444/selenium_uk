package pop_up;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWithFileUploadPopUp_01 {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://resume.naukri.com/cv-submission");
	Thread.sleep(3000);
	
	driver.findElement(By.id("infile")).sendKeys("C:\\Users\\User\\Desktop\\Selenium\\selenium notes online.pdf");
	
	Thread.sleep(4000);
	
	driver.quit();
	
}
}
