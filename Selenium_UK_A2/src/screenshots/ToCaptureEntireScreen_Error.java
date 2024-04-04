package screenshots;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ToCaptureEntireScreen_Error {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/register");
		Thread.sleep(4000);
		
		driver.findElement(By.id("register-button")).click();
		
		File source = driver.getScreenshotAs(OutputType.FILE);
		File destiny=new File("./ScreenShots/Error_Snap.png");
		
		FileHandler.copy(source, destiny);
		
		Thread.sleep(3000);
		driver.quit();
		
	}

}
