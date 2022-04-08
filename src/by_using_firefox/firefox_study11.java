package by_using_firefox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firefox_study11 {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.gecko.driver","D:\\software\\geckodriver\\geckodriver.exe");
		

        WebDriver driver=new FirefoxDriver();
        driver.get("https://web.whatsapp.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);


	}

}
