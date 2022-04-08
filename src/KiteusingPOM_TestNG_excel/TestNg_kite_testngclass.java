package KiteusingPOM_TestNG_excel;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class TestNg_kite_testngclass {
	
  WebDriver driver;
  Sheet Mysheet;
  kite_loginpage login;
  kite_pinpage pinpage;
  kite_homepage homepage;
  @BeforeClass
  public void openBrowser() throws EncryptedDocumentException, IOException
  {
	  Reporter.log("launch the browser",true);
	  System.setProperty("webdriver.chrome.driver","D:\\software\\chrome\\chromedriver.exe");
      driver=new ChromeDriver();
      driver.get("https://kite.zerodha.com/");
      driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
      driver.manage().window().maximize();
      Reporter.log("launch the browser successfully",true);
      FileInputStream MyFile=new FileInputStream("C:\\Users\\Aarti Mhetre\\Desktop\\Real time project\\Book1.xlsx");
	   Mysheet = WorkbookFactory.create(MyFile).getSheet("Sheet5");
	   login = new kite_loginpage(driver);
	  pinpage=new kite_pinpage(driver);
	  homepage=new kite_homepage(driver);
  }
  @BeforeMethod
  public void loginKite() 
  {
	  String UID = Mysheet.getRow(0).getCell(0).getStringCellValue();
	  String PWD = Mysheet.getRow(0).getCell(1).getStringCellValue();
	  String PIN = Mysheet.getRow(0).getCell(2).getStringCellValue();
	  Reporter.log("Enter userid & password",true);
	  login.senduserId(UID);
	  login.sendpassWord(PWD);
	  login.clickonSubmitButton();
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	  
	  Reporter.log("enter pin successfully",true);
	  pinpage.sendpin(PIN);
	  pinpage.clickonSubmit();
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
  }
@Test
public void validateUserId()
{
	Reporter.log("validating userID",true );
    String expectedUserId = Mysheet.getRow(0).getCell(0).getStringCellValue();
    String actualUserId = Mysheet.getRow(0).getCell(3).getStringCellValue();
    Assert.assertEquals(expectedUserId, actualUserId,"both are not equals");
    Reporter.log("userid validated successfully",true);
	}

  @AfterMethod
  public void logOut() throws InterruptedException {
	  Reporter.log("logout successfully",true);
	  homepage.clickonButton();
	
  }

  @AfterClass
  public void closeBrowser() {
	  Reporter.log("close the application successfully");
	  driver.close();
  }

}
