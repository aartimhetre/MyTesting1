package testNG_annotations_study;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNg_keywords_study {
  @Test (invocationCount=3)
  public void a() {
	  Reporter.log("test a is passed", true);
  }
  
  @Test(priority=-1)
  public void b() {
	  Reporter.log("test b is passed", true);
  }
  
  @Test(timeOut=1000)
  public void c() throws InterruptedException {
	  Thread.sleep(500);
	  Reporter.log("test c id passed", true);
	  
  }
  
  @Test(enabled =true)
  public void d() {
	  Reporter.log("test d is passed", true);
  }
  
  @Test(dependsOnMethods= {"d","c"})
  public void e()
  {
	  Reporter.log("test e is passed", true);
  }
  
}
