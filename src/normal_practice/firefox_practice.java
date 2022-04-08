package normal_practice;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;

public class firefox_practice {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.edge.driver","D:\\software\\edgedriver_win64\\msedgedriver.exe");
		

        WebDriver driver=new EdgeDriver();
        driver.get("https://web.whatsapp.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);

	}

}
