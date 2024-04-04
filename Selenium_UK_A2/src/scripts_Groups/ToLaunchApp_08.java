package scripts_Groups;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ToLaunchApp_08 {
@Test(groups = "shopping")
public void launch_app() {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.nykaafashion.com/");
	driver.quit();
}
}
