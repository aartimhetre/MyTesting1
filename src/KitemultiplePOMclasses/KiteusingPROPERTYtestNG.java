package KitemultiplePOMclasses;

import java.io.IOException;
import java.time.Duration;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import BaseClassess.BaseClassUsingProperties;
import UtilityClass.UtilityclassusingPROPERTY;

public class KiteusingPROPERTYtestNG extends BaseClassUsingProperties 
{
	int TCID=110;
  kite_loginpage login;
  kite_pinpage pin;
  kite_homepage home;
  @BeforeClass
 public void browserLAUCHING() throws IOException
 {
	  launchBrowser();
	  login=new kite_loginpage(driver);
	  pin=new kite_pinpage(driver);
	  home=new kite_homepage(driver);
 }
  @BeforeMethod
  public void logInToKite() throws IOException
  {
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	  login.sendpassWord(UtilityclassusingPROPERTY.DatafromMyproperties("PWD"));
	  login.senduserId(UtilityclassusingPROPERTY.DatafromMyproperties("UN"));
	  login.clickonSubmitButton();
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	  pin.sendpin(UtilityclassusingPROPERTY.DatafromMyproperties("PIN"));
	  
  }
  @Test
  public void validaTION() throws IOException
  {
	  
	  String expectedUserId = UtilityclassusingPROPERTY.DatafromMyproperties("UN");
	  String actualUserId=login.validUSERID();
	  Assert.assertEquals(actualUserId, expectedUserId,"both are not matching");
	  Assert.fail();
	  Reporter.log("tc is passed",true);
	  UtilityclassusingPROPERTY.takesScreenshotTC(driver, TCID);
	 
  }
  @AfterMethod
  public void logOutBrowser(ITestResult result) throws IOException
  {
	  if(result.getStatus()==result.FAILURE)
	  {
		  UtilityclassusingPROPERTY.takesScreenshotTC(driver, TCID);
	  }  
	  else
	  {
		  Reporter.log("tc is passed",true);
	  }
	  
  }
  @AfterClass
  public void closingBrowser()
  {
	  closingBrowser();
  }
  
  
	
}
