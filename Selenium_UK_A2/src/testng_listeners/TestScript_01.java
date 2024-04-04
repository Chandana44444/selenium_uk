package testng_listeners;

import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestNG_Implementation.class)

public class TestScript_01 extends BaseClass {
@Test
public void FT_Script_01() throws InterruptedException {
	driver.findElement(By.id("smalsearchterms")).sendKeys("books");
	Thread.sleep(4000);
}
public void m1() {
	System.out.println(a);
}
}
