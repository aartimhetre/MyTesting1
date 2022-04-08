package first_class_ofselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiselected_dropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\software\\chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		Thread.sleep(10000);
        //1.
		WebElement seclectmultibox = driver.findElement(By.name("cars"));
		//2.
		Select s=new Select(seclectmultibox);
		//3.
		boolean result = s.isMultiple();
		System.out.println("the ismultiple state is "+result);
		s.selectByVisibleText("Volvo");
		Thread.sleep(10000);
		s.selectByValue("saab");
		Thread.sleep(10000);
		s.selectByIndex(3);
		Thread.sleep(10000);
		//for deselect
		s.deselectByIndex(2);
		Thread.sleep(1000);
		s.deselectAll();
		
	}

}
