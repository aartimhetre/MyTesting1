package listener;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testing1 {
	 @Test
	  public void p() 
	  {
		  Reporter.log("tc p is passed",true);
	  }
	  @Test
	  public void q()
	  {
		  Assert.fail();
		  Reporter.log("tc q is passed",true);
	  }
	  @Test(dependsOnMethods= {"q"})
	  public void r()
	  {
		  Reporter.log("tc r is passed",true);
	  }
}
