package listener;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

public class Testing {
  @Test
  public void a() 
  {
	  Reporter.log("tc a is passed",true);
  }
  @Test
  public void b()
  {
	  Assert.fail();
	  Reporter.log("tc b is passed",true);
  }
  @Test(dependsOnMethods= {"b"})
  public void c()
  {
	  Reporter.log("tc c is passed",true);
  }
}
