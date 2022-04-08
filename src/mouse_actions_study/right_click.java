package mouse_actions_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class right_click {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\software\\chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);

		WebElement rightclickButton = driver.findElement(By.xpath("//span[text()='right click me']"));
	Actions act=new Actions(driver);
	//act.contextClick(rightclickButton).build().perform();
	
	act.moveToElement(rightclickButton).contextClick().build().perform();
	}

}
