package scripts_Groups;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ToLaunchApp_05 {
@Test(groups = "beauty")
public void launch_app() {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://mamaearth.in/");
	driver.quit();
}
}
