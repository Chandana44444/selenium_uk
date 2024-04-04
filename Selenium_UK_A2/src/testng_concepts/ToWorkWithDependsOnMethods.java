package testng_concepts;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToWorkWithDependsOnMethods {
@Test
public void register_module() {
	//int a=10/0;
	Reporter.log("From register module",true);
}
@Test(dependsOnMethods = "register_module")
//@Test(dependsOnMethods = "registermodule")//nonexistent method
public void login_module() {
	int a=10/0;
	Reporter.log("From login module",true);
}
}
