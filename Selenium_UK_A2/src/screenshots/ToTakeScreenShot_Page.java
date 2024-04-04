package screenshots;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ToTakeScreenShot_Page {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demowebshop.tricentis.com/login");

		LocalDateTime time = LocalDateTime.now();// current time along with seconds
		System.out.println(time);
		String Date_Time = time.toString().replaceAll(":", "-");//need to do because file name can't be named using ":" 

		File source = driver.getScreenshotAs(OutputType.FILE);
		File destiny = new File("ScreenShots//" + Date_Time + "Snap.png");
		// File destiny=new File("./ScreenShots/PageSnap.png");

		try {
			FileHandler.copy(source, destiny);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Thread.sleep(3000);
		driver.quit();

	}
}
