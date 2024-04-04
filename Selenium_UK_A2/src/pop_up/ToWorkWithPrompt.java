package pop_up;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ToWorkWithPrompt {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://omayo.blogspot.com/");
		Thread.sleep(3000);
		
		driver.findElement(By.id("prompt")).click();
		Thread.sleep(5000);
		
		Alert a=driver.switchTo().alert();
		System.out.println(a.getText());
		a.sendKeys("Chandana");//
		Thread.sleep(5000);
		a.accept();
		
		Thread.sleep(4000);
		driver.quit();
		
		
	}

}
