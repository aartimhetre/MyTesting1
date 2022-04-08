package mouse_actions_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Double_click_method {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\software\\chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		WebElement doubleclickbutton = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		//created Actions class
		Actions act=new Actions(driver);
		//using Actions class use actions method of double click
		//act.doubleClick(doubleclickbutton).perform();
		
		act.moveToElement(doubleclickbutton).doubleClick().build().perform();
	}

}
