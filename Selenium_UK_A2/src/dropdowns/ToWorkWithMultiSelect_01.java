package dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToWorkWithMultiSelect_01 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoapp.skillrary.com/");
		Thread.sleep(4000);
		WebElement multi_select_list = driver.findElement(By.id("cars"));
		
		Select list=new Select(multi_select_list);
		list.selectByIndex(3);//200-299
		list.selectByValue("90");//Free(90)
		list.selectByVisibleText("INR 100 - INR 199 ( 16 ) ");//INR 100 - INR 199 ( 16 ) 
		System.out.println("is this multi select drop down?:"+list.isMultiple());//true
		
		Thread.sleep(4000);
       System.out.println("selected count:"+ list.getAllSelectedOptions().size());//3
       System.out.println("Options available:"+multi_select_list.getText());
       
		//list.deselectByIndex(0);////Free(90)
		int size = list.getOptions().size();
		System.out.println("total options available according to actual count:"+size);
		System.out.println("total options available according to index:"+(size-1));

		list.selectByIndex(size-1);//last option
		//list.deselectAll();//remove all of your selected value
		Thread.sleep(4000);
		driver.quit();
		

	}

}
