package verification_usingtestNGorassert;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertNotNull_study {
  @Test
  public void test() {
	  String a="manoj";
	  
	  Assert.assertNotNull(a);
  }
}
