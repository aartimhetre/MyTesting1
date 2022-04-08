package scrolling_study;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_into_view {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\software\\chrome\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
//		WebElement checkBoxOpt1 = driver.findElement(By.id("checkBoxOption1"));
//        JavascriptExecutor js = (JavascriptExecutor)driver;
//        js.executeScript("arguments[0].scrollIntoView();",checkBoxOpt1);
//        
//        Thread.sleep(000);
//        checkBoxOpt1.click();

//WebElement checkbox2 = driver.findElement(By.id("checkBoxOption2"));
//JavascriptExecutor cs=(JavascriptExecutor)driver;
//cs.executeScript("arguments[0].scrollIntoView();",checkbox2);
//Thread.sleep(1000);
//checkbox2.click();

		WebElement checkboxotp3 = driver.findElement(By.name("checkBoxOption3"));
		JavascriptExecutor as = (JavascriptExecutor)driver;
		as.executeScript("arguments[0].scrollIntoView();",checkboxotp3);
		Thread.sleep(1000);
		checkboxotp3.click();
	}

}
