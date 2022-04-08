package first_class_ofselenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Screenshot_study {

	public static void main(String[] args) throws InterruptedException, IOException {
System.setProperty("webdriver.chrome.driver","D:\\software\\chrome\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://web.whatsapp.com/");
		Thread.sleep(2000);
	    driver.manage().window().maximize();
	    Thread.sleep(2000);
File screen=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
System.out.println(screen);
String randomvalue=RandomString.make(2);
File destination=new File("C:\\Users\\AARTIM~1\\AppData\\Local\\Temp\\screenshot10265743078243403553.png");

FileHandler.copy(screen,new File("C:\\Users\\Aarti Mhetre\\Desktop\\automation\\pictures\\.png"));
	
	}

	
}