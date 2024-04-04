package TestNG_XML;

import org.testng.annotations.Test;

public class TestScript_03 extends BaseClass{
@Test
public void FT_01() {
	driver.get("https://demowebshop.tricentis.com/books");
	BooksPage_WebElements books=new BooksPage_WebElements(driver);
	books.getBook1().click();
}
}
