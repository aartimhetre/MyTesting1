package testNG_STUDY;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MyTest2 {
  @Test
  public void MyMethod1() {

		System.setProperty("webdriver.chrome.driver","D:\\software\\chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/");
  }
  @Test
  public void MyMethod2()
  {
	  System.setProperty("webdriver.chrome.driver", "D:\\software\\chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.discoveryplus.in/");
  }
  @Test
  public void MyMethod3()
  {
	  System.setProperty("webdriver.chrome.driver", "D:\\software\\chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
  }
  @Test
  public void MyMethod4()
  {
	  System.setProperty("webdriver.chrome.driver", "D:\\software\\chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		
  }
  
  
}
