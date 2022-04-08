package daily_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ifame_study {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","D:\\software\\chrome\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
driver.switchTo().frame("iframeResult");
WebElement clickbutton = driver.findElement(By.xpath("//button[@type='button']"));
clickbutton.click();
driver.switchTo().defaultContent();
driver.findElement(By.xpath("(//a[@title='Change Theme'])[1]")).click();
	}
	

}
