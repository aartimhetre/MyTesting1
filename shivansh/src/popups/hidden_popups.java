package popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class hidden_popups {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\software\\chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.flipcart.com/");
		
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(1000);
		WebElement cartbutton = driver.findElement(By.xpath("//span[text()='Cart']"));
		cartbutton.click();

	}

}
