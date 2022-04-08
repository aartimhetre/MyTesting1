package synchronize0rwait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\software\\chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.discoveryplus.in/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		WebElement Signinbutton = driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]"));
		Signinbutton.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		
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
			//Explicit wait//Webdriver wait
			//1.create object of webdriver wait pass driver and time units as arguments
			WebDriverWait w=new WebDriverWait(driver,Duration.ofMillis(1000));
			//2.using Webdriver wait object call waiting method
			w.until(ExpectedConditions.visibilityOf(getOTPButton));
			
			getOTPButton.click();
			System.out.println("Clicked on get OTP button");
		}
		
		System.out.println(getOTPButton.isDisplayed());
			
	}

	}


