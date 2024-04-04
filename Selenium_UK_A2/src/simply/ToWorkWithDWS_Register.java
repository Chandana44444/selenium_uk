package simply;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ToWorkWithDWS_Register {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();

	driver.get("https://demowebshop.tricentis.com/register");
	//System.out.println(driver.getTitle());
//	if(driver.getTitle().contains("Demo Web Shopegister")){
//		System.out.println("you are in Register page");
//	}
//	else {
//		System.out.println("you are not in Register page");
//	}
	Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Register", "not landed to required page");
	WebElement female_btn = driver.findElement(By.id("gender-female"));
	female_btn.click();
	Assert.assertFalse(female_btn.isSelected(), "female radio button is already selected");;
	WebElement fname = driver.findElement(By.id("FirstName"));
	fname.sendKeys("safa");
	Assert.assertEquals(fname.getAttribute("value"),"safa","first name is not same as expected");
	Thread.sleep(4000);
//	WebElement lname = driver.findElement(By.id("LastName"));
//	lname.sendKeys();
//	WebElement email = driver.findElement(By.id("Email"));
//	email.sendKeys();
//	WebElement password = driver.findElement(By.id("Password"));
//	password.sendKeys();
//	WebElement confirm_password = driver.findElement(By.id("ConfirmPassword"));
//	confirm_password.sendKeys();
//	Thread.sleep(1000);
//	driver.findElement(By.id("register-button")).click();
	driver.quit();

}
}
