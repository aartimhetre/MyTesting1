package first_class_ofselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_facebook {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\software\\chrome\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/login.php");
		Thread.sleep(2000);
	    driver.manage().window().maximize();
	    Thread.sleep(2000);
	   driver.findElement((By.xpath("//button[@id='loginbutton'])"))).click();
	
		
	
	}

}
