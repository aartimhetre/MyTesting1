package daily_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fbpractice_study {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\software\\chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("aarti");

	}

}
