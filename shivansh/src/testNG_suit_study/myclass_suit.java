package testNG_suit_study;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class myclass_suit {
  @Test
  public void a() {
	  Reporter.log("tc a is passed", true);
  }
  
  @Test
  public void b() {
	  Reporter.log("tc b is passed", true);
  }
  
  @Test
  public void c()
  {
	  Reporter.log("tc c is passed", true);
  }
  @Test
  public void d()
  {
	  Reporter.log("tc d is passed", true);
  }
}
