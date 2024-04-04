package testng_listeners;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class TestNG_Implementation extends BaseClass implements ITestListener {
@Override
public void onTestStart(ITestResult result) {
	Reporter.log("execution of script started!",true);
}
@Override
public void onTestSuccess(ITestResult result) {
	Reporter.log("execution of script is successfull!",true);
}

@Override
public void onTestFailure(ITestResult result) {
	LocalDateTime time = LocalDateTime.now();
	String error = time.toString().replaceAll(":", "-");
	Reporter.log("execution of script is failed!",true);
	File source = driver.getScreenshotAs(OutputType.FILE);
	//File destiny=new File("ScreenShots//"+error+"_snap.png");
	File destiny=new File("ScreenShots//TestNG_snap.png");

	try {
		FileHandler.copy(source, destiny);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	{
}
	
}
{
	System.out.println(driver);
}
}
