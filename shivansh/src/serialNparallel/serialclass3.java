package serialNparallel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class serialclass3 {
	@Test
	 public void Myclass3() throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver","D:\\software\\chrome\\chromedriver.exe");
		  		
		  		WebDriver driver=new ChromeDriver();
		  		
		  		driver.get("https://vctcpune.com/selenium/practice.html");
		  		driver.manage().window().maximize();
		  		Thread.sleep(2000);
		  driver.close();
	}
}
