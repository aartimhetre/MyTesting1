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

public class FINAL_KITE_BOTH_VALIDATE extends BaseClass{
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
			login.clickonSubmitButton();
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
			
		}
		@Test
		public void validateuserIdpassWord() throws EncryptedDocumentException, IOException
		{
			int TCID=103;
		  String actualuserId = login.validUSERID();
		  String expectedUserID = Utility.exceldata(0, 4);
		  SoftAssert s=new SoftAssert();
		  s.assertEquals(actualuserId, expectedUserID,"both are not equal");
		  String actualpassword=login.validpassWORD();
		  String expectedpassword = Utility.exceldata(0, 5);
		  s.assertEquals(actualpassword, expectedpassword,"both are not equal");
		  Utility.takesScreenshotTC(driver, TCID);
		  Reporter.log("password Error",true);
		}
}
