package first_class_ofselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\software\\chrome\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		
	Thread.sleep(2000);
//		
driver.findElement(By.xpath("//input[@value='Radio1']")).click();
//		
//		Thread.sleep(2000);
//		
//		driver.findElement(By.xpath(null))

	}

}
