package simply;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StudentQuery {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://optellum.com");
	Thread.sleep(5000);
	
	WebElement ele_to_click = driver.findElement(By.xpath("//li[@class=\"search-toggle-li\"]"));
	ele_to_click.click();
	Thread.sleep(2000);
	WebElement searchInput = driver.findElement(By.id("ocean-search-form-1"));
    String searchTerm = "Car";
    searchInput.sendKeys(searchTerm);
    searchInput.sendKeys(Keys.RETURN);
    //working up to here
    Thread.sleep(4000);
     
    String Count=driver.findElement(By.id("search-results-count")).getText();
    
    System.out.println("You seacrched for: " + searchTerm);
    System.out.println(Count + " search results found");
   
    
    List<WebElement> articleElements = driver.findElements(By.tagName("article"));
    //System.out.println("Number of articles displayed: " + articleElements.size());

    if (Integer.parseInt(Count) == articleElements.size()) {
        System.out.println("Test passed: Number of search results matches the number of article elements.");
    } else {
        System.out.println("Test failed: Number of search results does not match the number of article elements.");
    }

    driver.quit();
}
}
