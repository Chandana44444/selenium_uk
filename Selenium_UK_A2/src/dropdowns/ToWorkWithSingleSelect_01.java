package dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToWorkWithSingleSelect_01 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/books");
		Thread.sleep(4000);
		WebElement single_select_list = driver.findElement(By.id("products-orderby"));
		
		Select list=new Select(single_select_list);
		list.selectByVisibleText("Name: Z to A");
		list.selectByIndex(5);//created on//stale element reference exception(because on already found element performing action)
		//list.selectByValue("");//because it is in the form of url
		System.out.println("is this multi select drop down?:"+list.isMultiple());
		
		Thread.sleep(4000);
		driver.quit();
		

	}

}
