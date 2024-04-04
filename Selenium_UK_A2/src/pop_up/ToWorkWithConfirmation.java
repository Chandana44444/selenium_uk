package pop_up;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWithConfirmation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://licindia.in/");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[text()='Close']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//a[@title=\"Login to Customer Portal\"])[2]")).click();
		Thread.sleep(4000);
		Alert a=driver.switchTo().alert();
		a.accept();
		//a.dismiss();//click on cancel button
		
		Thread.sleep(4000);
		driver.quit();
		
		
	}

}
