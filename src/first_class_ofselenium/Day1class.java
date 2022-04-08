package first_class_ofselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day1class {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\software\\chrome\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/");
		
//		Thread.sleep(2000);
//		
//		//driver.close();
//		
//		//driver.quit();
//		
//		driver.manage().window().maximize();
//		 
//		Thread.sleep(2000);
//		
//		driver.manage().window().minimize();
//		Thread.sleep(2000);
//		
//		driver.navigate().back();
//		
//		Thread.sleep(2000);
//		
//		driver.navigate().forward();
//		
//		System.out.println(driver.getTitle());
//		driver.get.("https://meet.google.com/");
//		
//		driver.manage().window().maximize();

	}

}
