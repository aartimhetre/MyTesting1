package daily_practice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Takescreen_shot {

	public static void main(String[] args) throws InterruptedException, IOException{
		System.setProperty("webdriver.chrome.driver","D:\\software\\chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
driver.get("https://www.youtube.com/");
driver.manage().window().maximize();
Thread.sleep(1000);
// File source=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
// String randomvalue = RandomString.make(5);
// FileHandler.copy(source, new File("C:\\Users\\Aarti Mhetre\\Desktop\\automation\\pictures\\"+randomvalue+".jpg"));

File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
String randomvalue = RandomString.make(2);
FileHandler.copy(source, new File("C:\\Users\\Aarti Mhetre\\Desktop\\automation\\pictures\\"+randomvalue+".jpg"));
	}

}
