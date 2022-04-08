package first_class_ofselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelement_Methods {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "D:\\software\\chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//LOCATORE TYPES//
		
//driver.findElement(By.xpath("//input[@type='text']"));
//		Thread.sleep(2000);
		
//	driver.findElement(By.name("email"));
//	Thread.sleep(2000);
		
//		driver.findElement(By.id("email")).sendKeys("aartimhetre");
//		Thread.sleep(2000);
		
//////////webelement methods/////////
		//creation of object by using reference variable webelement
		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("roshanpawar");
		Thread.sleep(3000);
		username.clear();
		Thread.sleep(3000);
		username.sendKeys("dipalipatil");
		Thread.sleep(3000);
	//	driver.findElement(By.xpath("//button[@name='login']")).click();
	//	Thread.sleep(3000);
		
	//driver.findElement(By.tagName("button")).click();
	//Thread.sleep(3000);
	
//	driver.findElement(By.linkText("Forgotten password?")).click();
	//Thread.sleep(3000);
		
	//	driver.findElement(By.partialLinkText("password?")).click();
	//	Thread.sleep(3000);
	
	
		
		
		
		
		
		
		
	}

}

