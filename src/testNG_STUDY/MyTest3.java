package testNG_STUDY;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyTest3 {
  @Test
  public void MyMethod1()
  {
	  System.out.println("welcome to testNG i.e MyMETHOD1");
  }
  @Test
  public void MyMethod2()
  {
	  System.out.println("welcome to testNG i.e MyMETHOD1");
	  Reporter.log("welcome to testNG");
  }
}
