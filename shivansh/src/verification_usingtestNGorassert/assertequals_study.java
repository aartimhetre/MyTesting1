package verification_usingtestNGorassert;

import org.testng.Assert;
import org.testng.annotations.Test;

public class assertequals_study {
  @Test
  public void test1() {
	  
	  String a="VCTCPune";
	  String b="VCTC";
	  Assert.assertEquals(a, b,"a is not matching with b ");
	  
  }
}
