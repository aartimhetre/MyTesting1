package softAssert;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softAssert1 {
	
	SoftAssert s=new SoftAssert();
  
	@Test
  public void f() 
	{
		String a="pune";
		String b="pune1";
		 s.assertEquals(a, b,"a&b are not equal");
		 s.assertNotNull(b, "b is null");
		
		 
		 s.assertAll();
  }
}
