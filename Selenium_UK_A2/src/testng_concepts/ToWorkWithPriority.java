package testng_concepts;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToWorkWithPriority {//testng class
@Test
public void demo_02() {//testng method/test case
	//int a=10/0;//test steps
	Reporter.log("hi testng2");//on report
	Reporter.log("hi testng2",true);//on console
}
@Test(priority = -1 )
public void demo_01() {//testng method/test case
	//int a=10/0;//test steps
	Reporter.log("hi testng1");//on report
	Reporter.log("hi testng1",true);//on console
}
}


//ASCII VALUE:-
//ALPHABETS
//NUMBERS
//SPECIAL CHARACTERS

//100+101+109+111+95+48+49=
//lowest to highest
