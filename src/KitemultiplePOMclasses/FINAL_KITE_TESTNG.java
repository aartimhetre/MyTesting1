package KitemultiplePOMclasses;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseClassess.BaseClass;
import UtilityClass.Utility;

public class FINAL_KITE_TESTNG extends BaseClass{
  kite_loginpage login;
  kite_pinpage pin;
  kite_homepage logout;
	@BeforeClass
	public void BrowserLaunch()
	{
		launchBrowser();
		login=new kite_loginpage(driver);
		pin=new kite_pinpage(driver);
		logout=new kite_homepage(driver);
	}
	@BeforeMethod
	public void logintokitePage() throws EncryptedDocumentException, IOException
	{
		login.senduserId(Utility.exceldata(0, 0));
		login.sendpassWord(Utility.exceldata(0, 1));
		login.clickonSubmitButton();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		pin.sendpin(Utility.exceldata(0, 2));
		pin.clickonSubmit();
	}
  @Test
  public void validateUserName() throws EncryptedDocumentException, IOException
  {
	  int TCID=1;
	  String actualUserId = logout.getActualUserId();
	  String expectedUserId = Utility.exceldata(0, 0);
	  Assert.assertEquals(actualUserId, expectedUserId,"both are not equal");
	  Utility.takesScreenshotTC(driver, TCID);
	  Reporter.log("TC 1 PASSED ,validate username",true);
}
	  
  
  @AfterMethod
  public void logOutAPP() throws InterruptedException
  {
	  logout.clickonButton();
	  Reporter.log("logoutapp",true);
  }
  
}
