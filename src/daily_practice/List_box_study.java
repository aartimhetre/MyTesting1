package daily_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class List_box_study {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\software\\chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		driver.manage().window().maximize();
		Thread.sleep(1000);
		WebElement dropDownbox = driver.findElement(By.name("dropdown-class-example"));
		Select s=new Select(dropDownbox);
		s.selectByVisibleText("Option1");
		Thread.sleep(1000);
		s.selectByValue("option3");
		Thread.sleep(1000);
		s.selectByIndex(2);
		Thread.sleep(1000);
		System.out.println("the multiple selected is "+s.isMultiple());

	}

}
