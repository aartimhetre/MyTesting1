package verification_usingtestNGorassert;

import org.testng.Assert;
import org.testng.annotations.Test;

public class assertnotequals_study {
  @Test
  public void test2() {
	  String a="aarti";
	  String b="aarti";
	  Assert.assertNotEquals(a, b,"a is equals to b");
  }
}
