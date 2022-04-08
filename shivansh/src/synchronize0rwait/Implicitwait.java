package synchronize0rwait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicitwait {

	public static void main(String[] args) {
      System.setProperty("webdriver.chrome.driver","D:\\software\\chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(duration,1000);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(100));
        driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
        

	}

}
