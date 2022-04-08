package serialNparallel;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class serialclass1 {
  @Test
  public void Myclass1() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","D:\\software\\chrome\\chromedriver.exe");
	  		
	  		WebDriver driver=new ChromeDriver();
	  		
	  		driver.get("https://www.flipkart.com/");
	  		driver.manage().window().maximize();
	  		Thread.sleep(2000);
	  driver.close();

  
}
 
  
}
