package crossbrowing_testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Crossbrowing1 {
  @Parameters("browserName")
  @Test
  public void test1(String browserName) throws InterruptedException {
	  WebDriver driver=null;
	  if(browserName.equals("chrome")) 
	  {
           System.setProperty("webdriver.chrome.driver","D:\\software\\chrome\\chromedriver.exe");
	       driver=new ChromeDriver();
	}
	  else if(browserName.equals("firefox"))
		  {System.setProperty("webdriver.gecko.driver","D:\\software\\geckodriver\\geckodriver.exe");
		 driver=new FirefoxDriver(); 
  }
  else if(browserName.equals("edge"))
  {
	  System.setProperty("webdriver.edge.driver","D:\\software\\edgedriver_win64\\msedgedriver.exe");
		 driver=new EdgeDriver();
  }
driver.get("https://web.whatsapp.com/");
driver.manage().window().maximize();
Thread.sleep(2000);
driver.close();
}
}
