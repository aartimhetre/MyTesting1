package zerodha_usingPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZerodhaTestclass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\software\\chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		Zerodha_loginpage logIn=new Zerodha_loginpage(driver);
		logIn.senduserId();
		logIn.sendpassWord();
		logIn.clickonSubmitButton();
		Thread.sleep(1000);
		
		zerodha_pin pin=new zerodha_pin(driver);
		pin.sendpin();
		pin.clickonSubmit();
		Thread.sleep(1000);
		
		Zerodha_homepage homepg=new Zerodha_homepage(driver);
		homepg.validationuserId();
		homepg.clickonButton();
		
		driver.close();
	}

}
