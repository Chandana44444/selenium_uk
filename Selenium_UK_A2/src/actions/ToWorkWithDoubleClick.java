package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToWorkWithDoubleClick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoapp.skillrary.com/product.php?product=testing");
		Thread.sleep(3000);
		
		WebElement plus_btn = driver.findElement(By.id("add"));
		WebElement minus_btn = driver.findElement(By.id("minus"));
		
		Actions act=new Actions(driver);
		for(int i=1;i<10;i++) {
		act.doubleClick(plus_btn).perform();//2
		}
		Thread.sleep(3000);
		act.doubleClick(minus_btn).perform();//1
		Thread.sleep(4000);
		driver.quit();

	}

}
