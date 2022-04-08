package testNG_suit_study;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class myclass_1 {
  @Test
  public void test1() {
	  Reporter.log("tc 1 is passed", true);
  }
  @Test
  public void test2() {
	  Reporter.log("tc 2 is passed", true);
  }
  @Test
  public void test3() {
	  Reporter.log("tc 3 is passed", true);
  }
  @Test
  public void test4() {
	  Reporter.log("tc 4 is passed", true);
  }
}
