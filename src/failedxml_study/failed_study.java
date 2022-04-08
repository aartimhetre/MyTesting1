package failedxml_study;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class failed_study {
  @Test
  public void a() {
	  Reporter.log("tc a is passed", true);
  }
  @Test
  public void b() 
  {
	  Assert.fail();
	  Reporter.log("tc b is passed", true);
  }
  @Test(timeOut=200)
  public void c() throws InterruptedException {
	  Thread.sleep(500);
	  Reporter.log("tc c is passed", true);
  }
  @Test
  public void d() {
	  Reporter.log("tc d is passed", true);
  } 
  @Test(timeOut=500)
  public void e() throws InterruptedException {
	  Thread.sleep(600);
	  Reporter.log("tc e is passed", true);
  }
}
