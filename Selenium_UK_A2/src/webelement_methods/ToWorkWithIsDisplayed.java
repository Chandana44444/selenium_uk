package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToWorkWithIsDisplayed {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.skillrary.com/");
		Thread.sleep(4000);

		if (driver.findElement(By.partialLinkText("ENGLISH")).isDisplayed()) {
			driver.findElement(By.partialLinkText("ENGLISH")).click();
			Thread.sleep(4000);
			driver.findElement(By.partialLinkText("FRENCH")).click();
		}

		Thread.sleep(4000);

//	WebElement list = driver.findElement(By.xpath("(//li[@class=\"dropdown\"])[1]"));
//	Select s=new Select(list);
//	
//	s.selectByVisibleText("FRENCH");//cant because not developed using "Select" tag instead "li" tag
//	
//	Thread.sleep(4000);

		// WebElement sign_in_link = driver.findElement(By.partialLinkText("SIGN IN"));
		// if(sign_in_link.isDisplayed()) //NoSuchElement Exception

		//WebElement sign_in_btn = driver.findElement(By.partialLinkText("SIGN IN"));// NoSuchElement Exception
		// if(sign_in_btn.isDisplayed()){
		if (driver.findElement(By.partialLinkText("SIGN IN")).isDisplayed()) {// NoSuchElement Exception
			// if(false){
			System.out.println("the application is opened in English Language");
		} else {
			System.out.println("Other Language");
		}

		Thread.sleep(4000);
		driver.quit();
	}
}
