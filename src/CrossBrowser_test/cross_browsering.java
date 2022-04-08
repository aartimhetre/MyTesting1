package CrossBrowser_test;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import kite1_testNG.homepage;
import kite1_testNG.loginPage;
import kite1_testNG.pinpage;

public class cross_browsering {
 
	
	WebDriver driver;
	Sheet Mysheet;
	loginPage login;
	pinpage pin;
	homepage logut;
    @Parameters("browserName")
	@BeforeClass
	public void launchBrowser(String browser) throws EncryptedDocumentException, IOException
	{
		if(browser.equals("chrome"))
		{
		Reporter.log("launch the chrome browser",true);
		System.setProperty("webdriver.chrome.driver","D:\\software\\chrome\\chromedriver.exe");
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disabled-notifications");
		driver=new ChromeDriver(opt);
		}
		else if(browser.equals("firefox"))
		{
		Reporter.log("launch the firefox",true);	 
		System.setProperty("webdriver.gecko.driver","D:\\software\\geckodriver\\geckodriver.exe");
	    FirefoxOptions opt=new FirefoxOptions();
	    opt.addArguments("--disabled-notifications");
		driver=new FirefoxDriver(opt); 
		}
			
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
