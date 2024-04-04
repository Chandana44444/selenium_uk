package pop_up;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWithFileUploadPopUp_02 {
public static void main(String[] args) throws InterruptedException, IOException {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://interimjobs.kornferry.com/candidates/submit-your-resume");
	Thread.sleep(3000);
	
    driver.findElement(By.xpath("//label[@class=\"button primary\"]")).click();
	Thread.sleep(4000);
	
	Runtime.getRuntime().exec("./AutoItScript/FileUpload.exe");
			
	driver.quit();
	
}
}
