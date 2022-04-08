package keywords_actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class various_key {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\software\\chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(2000);
WebElement day1 = driver.findElement(By.xpath("//select[@title='Day']"));
 // day.click();
		Actions act=new Actions(driver);
		act.click(day1).perform();
		Thread.sleep(2000);
		for(int i=0;i<=15;i++)
		{
			act.sendKeys(Keys.ARROW_DOWN).perform();
			Thread.sleep(1000);
		}
		for(int i=0;i<=17;i++)
		{
			act.sendKeys(Keys.ARROW_UP).perform();
			Thread.sleep(1000);
		}
		act.sendKeys(Keys.ENTER).perform();
		WebElement firstName = driver.findElement(By.name("firstname"));
		act.click(firstName).keyDown(Keys.SHIFT).sendKeys("velocity").build().perform();
		Thread.sleep(1000);
		WebElement lastName = driver.findElement(By.name("lastname"));
		act.click(lastName).keyDown(Keys.SHIFT).sendKeys("corporate").build().perform();
	}

}
