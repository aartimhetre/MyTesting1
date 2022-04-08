package BaseClassess;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

public class BaseClass
{
	protected WebDriver driver;
	public void launchBrowser()
	{
	Reporter.log("launch the browser",true);
	System.setProperty("webdriver.chrome.driver","D:\\software\\chrome\\chromedriver.exe");
    driver=new ChromeDriver();
    driver.get("https://kite.zerodha.com/");
    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
    driver.manage().window().maximize();
    Reporter.log("launch the browser successfully",true);
}
	public void closeApp()
	{
		driver.close();
		Reporter.log("close the browser successfully",true);
	}
}
