package kite1_testNG;

import java.io.FileInputStream;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class final_TestNG {
	WebDriver driver;
	Sheet Mysheet;
	loginPage login;
	pinpage pin;
	homepage logut;
	@BeforeClass
	public void launchBrowser() throws EncryptedDocumentException, IOException
	{
		Reporter.log("launch the browser",true);
		System.setProperty("webdriver.chrome.driver","D:\\software\\chrome\\chromedriver.exe");
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disabled-notifications");
		driver=new ChromeDriver(opt);
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		Reporter.log("browser launch successfully",true);
		FileInputStream Myfile=new FileInputStream("C:\\Users\\Aarti Mhetre\\Desktop\\Real time project\\Book1.xlsx");
		Mysheet=WorkbookFactory.create(Myfile).getSheet("Sheet5");
		login = new loginPage(driver);
		pin=new pinpage(driver);
		logut=new homepage(driver);
		}
	@BeforeMethod
	public void loginTopage()
	{
		Reporter.log("enter userid and password",true);
	    String USID = Mysheet.getRow(0).getCell(0).getStringCellValue();
		String PASWD = Mysheet.getRow(0).getCell(1).getStringCellValue();
		String PIN = Mysheet.getRow(0).getCell(2).getStringCellValue();
		login.sendpassWord(PASWD);
		login.senduserId(USID);
		login.clickonSubmitButton();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		Reporter.log("enter pin",true);
		pin.sendpin(PIN);
		pin.clickonSubmit();
	}
	@Test
	public void validation()
	{
		Reporter.log("validating the userid",true);
		String expecteduserid=Mysheet.getRow(0).getCell(0).getStringCellValue();
		String actualuserid=logut.validationuserId();
		Assert.assertEquals(expecteduserid,actualuserid,"both are not equal");
	}
	
	@AfterMethod
	public void logoutpage() throws InterruptedException
	{
		Reporter.log("Logout application successfully",true);
		logut.clickonButton();
		
	}
	@AfterClass
	public void endpage()
	{
		Reporter.log("close browser successfuly",true);
		driver.close();
	}
}
