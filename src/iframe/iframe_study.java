package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe_study {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","D:\\software\\chrome\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
driver.switchTo().frame("iframeResult");
WebElement clickmebutton = driver.findElement(By.xpath("//button[contains(text()=' Click me to display Date and Time.')]"));
clickmebutton.click();
driver.switchTo().defaultContent();
Thread.sleep(2000);
driver.findElement(By.xpath("//a[@title='Change Theme'][1]")).click();
	}

}
