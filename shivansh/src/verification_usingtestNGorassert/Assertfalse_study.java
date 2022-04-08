package verification_usingtestNGorassert;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertfalse_study {
  @Test
  public void study() {
	  String class1="pune";
	  String class2="pune1";
	  boolean result=true;
	  Assert.assertFalse(result, "class1 is not matching with class2");
  }
}
