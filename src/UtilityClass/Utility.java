package UtilityClass;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;

public class Utility {

	static Sheet Mysheet;
	public static String exceldata(int rowIndex,int coloumIndex) throws EncryptedDocumentException, IOException
	{
		FileInputStream Myfile=new FileInputStream("C:\\Users\\Aarti Mhetre\\Desktop\\Real time project\\Book1.xlsx");
	 Mysheet= WorkbookFactory.create(Myfile).getSheet("Sheet6");
	String value = Mysheet.getRow(rowIndex).getCell(coloumIndex).getStringCellValue();
	      return value;
	
	}
	public static void takesScreenshotTC(WebDriver driver,int TCID) throws IOException
	{
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\Aarti Mhetre\\Desktop\\automation\\New folder\\TC"+TCID+".jpg");
		FileHandler.copy(source, dest);
		Reporter.log("screenshot taken for tc",true);
	}
	
	
	
}
