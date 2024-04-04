package pop_up;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWithAlert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector("input[value=\"Search\"]")).click();
		
		Thread.sleep(2000);
		
		Alert a=driver.switchTo().alert();
		a.accept();//will click on "ok" btn
		
		Thread.sleep(3000);
		driver.quit();
		
		
	}

}
