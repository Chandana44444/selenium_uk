package pop_up;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWithAuthenticationPopUp {
public static void main(String[] args) throws InterruptedException, AWTException {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	//driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");//avoid
	
	driver.get("https://the-internet.herokuapp.com/basic_auth");
	//handle
	
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_A);
	Thread.sleep(1000);
	r.keyPress(KeyEvent.VK_D);
	Thread.sleep(1000);
	r.keyPress(KeyEvent.VK_M);
	Thread.sleep(1000);
	r.keyPress(KeyEvent.VK_I);
	Thread.sleep(1000);
	r.keyPress(KeyEvent.VK_N);
	Thread.sleep(1000);
	r.keyPress(KeyEvent.VK_TAB);
	Thread.sleep(1000);
	r.keyPress(KeyEvent.VK_A);
	Thread.sleep(1000);
	r.keyPress(KeyEvent.VK_D);
	Thread.sleep(1000);
	r.keyPress(KeyEvent.VK_M);
	Thread.sleep(1000);
	r.keyPress(KeyEvent.VK_I);
	Thread.sleep(1000);
	r.keyPress(KeyEvent.VK_N);
	Thread.sleep(1000);
	r.keyPress(KeyEvent.VK_TAB);
	Thread.sleep(1000);
	r.keyPress(KeyEvent.VK_ENTER);
	Thread.sleep(1000);

	r.keyRelease(KeyEvent.VK_A);
	r.keyRelease(KeyEvent.VK_D);
	r.keyRelease(KeyEvent.VK_M);
	r.keyRelease(KeyEvent.VK_I);
	r.keyRelease(KeyEvent.VK_N);
	r.keyRelease(KeyEvent.VK_TAB);
	r.keyRelease(KeyEvent.VK_ENTER);

	Thread.sleep(7000);
	driver.quit();
	
}
}
