package KitemultiplePOMclasses;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import BaseClassess.BaseClass;
import UtilityClass.Utility;

public class FINAL_KITE_PASSWORD_VALIDATE extends BaseClass {
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
			login.clickonSubmitButton();
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
			
		}
		 @Test
		  public void validatePASSWORD() throws EncryptedDocumentException, IOException
		  {
			  int TCID=101;
			  String actualpassword=login.validpassWORD();
			  String expectedpassword = Utility.exceldata(0,5);
			  SoftAssert s=new SoftAssert();
			  s.assertEquals(actualpassword, expectedpassword,"both are not equal");
			  Utility.takesScreenshotTC(driver, TCID);
			  Reporter.log("password Error",true);
			  
		  }	 
}
