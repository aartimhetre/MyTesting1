package synchronize0rwait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class Fluent_wait1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\software\\chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/");
		driver.manage().window().maximize();
		 WebElement sr = driver.findElement(By.xpath("(//a[text()='Student Review'])[1]"));
		 
		 //fluent wait//for single element
		 FluentWait fw=new FluentWait(sr);
		 fw.withTimeout(Duration.ofMillis(100));
		 fw.pollingEvery(Duration.ofMillis(200));
		 fw.ignoring(NoSuchElementException.class);
		 
		 fw.until(ExpectedConditions.visibilityOf(sr));
		 
		 fw.wait(5000);
		 

	}

}
