package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToWorkWithDragAndDrop {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
	Thread.sleep(3000);
	
	WebElement src = driver.findElement(By.id("draggable"));
	WebElement destiny = driver.findElement(By.id("droppable"));
	
	Actions act=new Actions(driver);
	act.dragAndDrop(src, destiny).perform();
	
	Thread.sleep(4000);
	driver.quit();
}
}
