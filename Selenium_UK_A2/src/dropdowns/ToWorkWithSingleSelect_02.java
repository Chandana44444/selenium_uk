package dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToWorkWithSingleSelect_02 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://omayo.blogspot.com/");
		Thread.sleep(4000);
		WebElement single_select_list = driver.findElement(By.id("drop1"));
		
		Select list=new Select(single_select_list);
		//list.selectByIndex(3);//doc 3
		list.selectByValue("def");//doc 1
		list.selectByVisibleText("doc 2");//doc 2
		System.out.println("is this multi select drop down?:"+list.isMultiple());
		
		Thread.sleep(4000);
		driver.quit();
		

	}

}
