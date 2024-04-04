package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWithEnabled {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/login");
		Thread.sleep(3000);
		
		WebElement login_btn = driver.findElement(By.xpath("//input[@value='Log in']"));
		
		if(login_btn.isEnabled()) {
			login_btn.click();
			System.out.println("its enabled");
		}
		else {
			System.out.println("not enabled");
		}
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.instagram.com/");
		
		Thread.sleep(3000);
		System.out.println("********************************");
		System.out.println("result:"+driver.findElement(By.xpath("//button[@type='submit']")).isEnabled());

		Thread.sleep(4000);
		driver.quit();
	}

}
