package testNG_annotations_study;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class with_annotations_study {
 @BeforeClass
	 public void beforeClass() {
		  Reporter.log("application launch on browser", true);
	  }

  @BeforeMethod
  public void beforeMethod() {
	  Reporter.log("login to the application", true);
  }
  @Test
  public void a() {
	  Reporter.log("test case a is a passed", true);
	  
  }
  @Test
  public void b()
  {
	  Reporter.log("test case b is passed", true);
  }

  @AfterMethod
  public void afterMethod() {
	  Reporter.log("logout the application", true);
  }

 
  @AfterClass
  public void afterClass() {
	  Reporter.log("close the browser", false);
  }

}
