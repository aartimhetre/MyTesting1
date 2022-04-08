package verification_usingtestNGorassert;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert_fail_study {
  @Test
  public void test() {
	  String a="pune";
	  String b="pune";
	  Assert.fail();
	  System.out.println(a.equals(b));
  }
}
