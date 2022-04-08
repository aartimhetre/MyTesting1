package groupingintestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testgroup1 {
  @Test(groups="regression")
  public void class1() {
	  Reporter.log("running class1", true);
  }
  @Test(groups="sanity")
  public void class2() {
	  Reporter.log("running class2", true);
  }
  @Test(groups="regression")
  public void class3() {
	  Reporter.log("running class3", true);
  }
  @Test(groups="sanity")
  public void class4() {
	  Reporter.log("running class4", true);
  }
  @Test(groups="regression")
  public void class5() {
	  Reporter.log("running class5", true);
  }
}
