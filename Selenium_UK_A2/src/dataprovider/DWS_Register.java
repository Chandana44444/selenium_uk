package dataprovider;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.yaml.snakeyaml.emitter.Emitable;

public class DWS_Register 
{	
	@DataProvider(name="testdata",parallel = true)
public String[][] m1() throws EncryptedDocumentException, IOException, InterruptedException {
File f=new File("./resources/Excel.xlsx");
FileInputStream fis=new FileInputStream(f);

Workbook wb=WorkbookFactory.create(f);
int row_count = wb.getSheet("Sheet2").getPhysicalNumberOfRows();
System.out.println(row_count);
int cell_count = wb.getSheet("Sheet2").getRow(1).getPhysicalNumberOfCells();
System.out.println(cell_count);

String [][] arr1=new String[row_count][cell_count];

//arr1[0][0]="hkhkj";
for(int i=0;i<row_count;i++) {
	for(int j=0;j<cell_count;j++) {
		arr1[i][j]=wb.getSheet("Sheet2").getRow(i).getCell(j).toString();
		System.out.print(arr1[i][j]+"   ");
	}
	System.out.println();
}
return arr1;
}
	
@Test(dataProvider =  "testdata")
public void DWS_Register(String[] arr) throws InterruptedException {
ChromeDriver driver=new ChromeDriver();
driver.manage().window().maximize();

driver.get("https://demowebshop.tricentis.com/register");
if(arr[0].equalsIgnoreCase("female")) {
WebElement gender_female = driver.findElement(By.id("gender-female"));
gender_female.click();
}
if(arr[0].equalsIgnoreCase("male")) {
WebElement gender_male = driver.findElement(By.id("gender-male"));
gender_male.click();
}
WebElement fname = driver.findElement(By.id("FirstName"));
fname.sendKeys(arr[1]);
WebElement lname = driver.findElement(By.id("LastName"));
lname.sendKeys(arr[2]);
WebElement email = driver.findElement(By.id("Email"));
email.sendKeys(arr[3]);
WebElement password = driver.findElement(By.id("Password"));
password.sendKeys(arr[4]);
WebElement confirm_password = driver.findElement(By.id("ConfirmPassword"));
confirm_password.sendKeys(arr[4]);
Thread.sleep(1000);
driver.findElement(By.id("register-button")).click();
driver.quit();
}
}

