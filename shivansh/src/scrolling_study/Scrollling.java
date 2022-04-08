package scrolling_study;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrollling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\software\\chrome\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		JavascriptExecutor is = (JavascriptExecutor)driver;
        is.executeScript("window.scrollBy(0,120)");
        Thread.sleep(1000);
        is.executeScript("window.scrollBy(0,200)");
	}

}
