package read_data;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Date;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ToReadDataFromExcel {
public static void main(String[] args) throws InvalidFormatException, IOException {
	File file=new File("./resources/Excel.xlsx");
	
	FileInputStream fis=new FileInputStream(file);
	
//	XSSFWorkbook wb=new XSSFWorkbook(fis);
	Workbook wb = WorkbookFactory.create(fis);//.xlsx,.xls

	String url = wb.getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
	System.out.println(url);
	
	boolean boolean_value = wb.getSheet("Sheet1").getRow(3).getCell(0).getBooleanCellValue();
	System.out.println(boolean_value);
	
	LocalDateTime date_01 = wb.getSheet("Sheet1").getRow(2).getCell(2).getLocalDateTimeCellValue();
	System.out.println(date_01);
	
	Date date_02 = wb.getSheet("Sheet1").getRow(2).getCell(2).getDateCellValue();
	System.out.println(date_02);
	
	double number = wb.getSheet("Sheet1").getRow(5).getCell(1).getNumericCellValue();
	System.out.println(number);
	
	String data1 = wb.getSheet("Sheet1").getRow(0).getCell(1).toString();
	String data2 = wb.getSheet("Sheet1").getRow(3).getCell(0).toString();
	String data3 = wb.getSheet("Sheet1").getRow(2).getCell(2).toString();
	String data4 = wb.getSheet("Sheet1").getRow(5).getCell(1).toString();
	
	System.out.println("*************************");
	System.out.println(data1);
	System.out.println(data2);
	System.out.println(data3);
	System.out.println(data4);
	
}
}
