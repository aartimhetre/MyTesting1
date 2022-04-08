package mouse_actions_study;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Click_method {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","D:\\software\\chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
        driver.manage().window().maximize();
        Thread.sleep(1000);
        
        WebElement checkboxotp1 = driver.findElement(By.name("checkBoxOption1"));
JavascriptExecutor va = (JavascriptExecutor)driver;
va.executeScript("arguments[0].scrollIntoView();",checkboxotp1);

//1.create an object of actions class which will accept object as an argument//
Actions act=new Actions(driver);

//2.using actions class object call required method for using to perform mouse actions
//act.click(checkboxotp1).perform();

//second way to click on webelement by using move to element 
act.moveToElement(checkboxotp1).click().build().perform();

	}

}
