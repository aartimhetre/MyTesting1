package verification_usingtestNGorassert;

import org.testng.Assert;
import org.testng.annotations.Test;

public class assertTrue_study {
  @Test
  public void test1() {
	  String name="pranav";
	  String name1="pranav";
	  boolean result=false;
	  Assert.assertTrue(result,"name is not matching");
  }
}
