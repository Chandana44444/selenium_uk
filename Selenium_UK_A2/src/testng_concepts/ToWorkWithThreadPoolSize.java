package testng_concepts;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToWorkWithThreadPoolSize {//testng class
@Test(invocationCount = 3,threadPoolSize = 0,enabled = false)
public void demo_02() throws InterruptedException {
	Reporter.log("hi testng2",true);//on console
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/");
	Thread.sleep(3000);
	driver.quit();
}
@Test(invocationCount = 0 )
public void demo_01() {
	Reporter.log("hi testng1",true);//on console
}
}


//ASCII VALUE:-
//ALPHABETS
//NUMBERS
//SPECIAL CHARACTERS

//100+101+109+111+95+48+49=
//lowest to highest
