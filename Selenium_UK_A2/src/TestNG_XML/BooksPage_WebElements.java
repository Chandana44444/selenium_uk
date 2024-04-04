package TestNG_XML;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BooksPage_WebElements {
	public BooksPage_WebElements(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
@FindBy(linkText = "Computing and Internet")
private WebElement book1;

@FindBy(linkText = "Copy of Computing and Internet EX")
private WebElement book2;

public WebElement getBook1() {
	return book1;
}

public WebElement getBook2() {
	return book2;
}

}
