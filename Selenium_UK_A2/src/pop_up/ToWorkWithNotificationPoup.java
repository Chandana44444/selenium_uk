package pop_up;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ToWorkWithNotificationPoup {

	public static void main(String[] args) throws InterruptedException, AWTException{
//		ChromeOptions settings=new ChromeOptions();
//		settings.addArguments("--disable-notifications");
//		ChromeDriver driver=new ChromeDriver(settings);

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://in.puma.com/in/en/collaborations");		
		
		Thread.sleep(8000);
		
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);
		
		r.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		//driver.quit();

	}

}
