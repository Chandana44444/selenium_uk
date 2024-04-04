package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToWorkWithClick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);
		WebElement ele_to_click = driver.findElement(By.linkText("Register"));
		
		Actions act=new Actions(driver);
		act.click(ele_to_click).perform();
		
		Thread.sleep(3000);
		//driver.quit();

	}

}
