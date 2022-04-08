package first_class_ofselenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot_interface {

	public static void main(String[] args) throws IOException {
System.setProperty("webdriver.chrome.driver","D:\\software\\chrome\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://web.whatsapp.com/");
		 File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 FileHandler.copy(source,new File("D:\\afafdgdfgfdsg\\.jpg"));
		 
	}

}
