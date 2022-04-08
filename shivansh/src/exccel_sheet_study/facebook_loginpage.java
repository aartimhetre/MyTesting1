package exccel_sheet_study;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook_loginpage {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\software\\chrome\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
FileInputStream Myfile=new FileInputStream("C:\\Users\\Aarti Mhetre\\Desktop\\Real time project\\loginfb.xlsx");
Workbook test=WorkbookFactory.create(Myfile);
Sheet mysheet = test.getSheet("Sheet2");
String urloffb = mysheet.getRow(0).getCell(0).getStringCellValue();
driver.get(urloffb);
driver.manage().window().maximize();
Thread.sleep(1000);

String IdofFb = mysheet.getRow(0).getCell(1).getStringCellValue();
String passWd = mysheet.getRow(0).getCell(2).getStringCellValue();
System.out.println(IdofFb);

 WebElement username = driver.findElement(By.xpath("//input[@id='email']"));
 username.sendKeys(IdofFb);
Thread.sleep(1000);
 WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
password.sendKeys(passWd);

String username1=IdofFb;
String password1=passWd;
if(username1==IdofFb)
{
	if(password1==passWd)
	{
		
	}
		}






	}

}
