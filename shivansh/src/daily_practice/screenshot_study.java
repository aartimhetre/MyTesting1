package daily_practice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;


import net.bytebuddy.utility.RandomString;

public class screenshot_study {

	public static void main(String[] args) throws InterruptedException, IOException {
System.setProperty("webdriver.chrome.driver","D:\\software\\chrome\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://mail.google.com/mail/u/0/#inbox");
			Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
 String randomvalue = RandomString.make(5);
 FileHandler.copy(source,new File("C:\\Users\\Aarti Mhetre\\Desktop\\automation\\pictures\\"+randomvalue+".jpg"));
	}

}
