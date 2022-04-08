package synchronize0rwait;


import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;

public class Fluent_wait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\software\\chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("aartimhetre");
		
		FluentWait<WebDriver> wait=new  FluentWait<WebDriver>(driver);
		wait.withTimeout(Duration.ofMillis(1000));
		wait.pollingEvery(Duration.ofMillis(100));
		wait.ignoring(NoSuchElementException.class);
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("12548asd");
		
	}

}
