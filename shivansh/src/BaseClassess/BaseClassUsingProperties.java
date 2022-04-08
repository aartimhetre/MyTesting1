package BaseClassess;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

import UtilityClass.UtilityclassusingPROPERTY;

public class BaseClassUsingProperties {

	protected WebDriver driver;
	public void launchBrowser() throws IOException
	{
	Reporter.log("launch the browser",true);
	System.setProperty("webdriver.chrome.driver","D:\\software\\chrome\\chromedriver.exe");
    driver=new ChromeDriver();
    driver.get(UtilityclassusingPROPERTY.DatafromMyproperties("URL"));
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
