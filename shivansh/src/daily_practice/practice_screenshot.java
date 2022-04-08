package daily_practice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class practice_screenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\software\\chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileHandler.copy(source, new File("C:\\Users\\Aarti Mhetre\\Desktop\\automation\\New folder\\"+1234+".jpg"));

	}

}
