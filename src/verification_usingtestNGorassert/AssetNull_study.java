package verification_usingtestNGorassert;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssetNull_study {
  @Test
  public void test1() {
	  String a="manoj";
	  String b=null;
	  
	  Assert.assertNull(b);
  }
  
  
}
