package scripts_Groups;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ToLaunchApp_02 {
@Test(groups = "mobile")
public void launch_app() {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.mi.com/in/");
	driver.quit();
}
}
