package first_class_ofselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled_use {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\software\\chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.discoveryplus.in/");
		
		driver.manage().window().maximize();
		Thread.sleep(10000);
		WebElement Signinbutton = driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]"));
		Signinbutton.click();
		Thread.sleep(2000);
		
		WebElement getOTPButton = driver.findElement(By.xpath("//button[text()='Get OTP']"));
		System.out.println(getOTPButton.isEnabled());
		
		boolean result = getOTPButton.isEnabled();
		System.out.println("getOTPButton status is "+result);
		
		if(result)
		{
			System.out.println("Get OTP Button is enabled");
			getOTPButton.click();
		}
		else {
			driver.findElement(By.id("mobileNumber")).sendKeys("555555555");
			Thread.sleep(1000);
			getOTPButton.click();
			System.out.println("Clicked on get OTP button");
		}
		
		System.out.println(getOTPButton.isDisplayed());
			
	}

}
