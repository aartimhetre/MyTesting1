package first_class_ofselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListboxHndling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\software\\chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		//1.identify list box to be handled and store it in reference variable
		WebElement Dropdownbox = driver.findElement(By.name("dropdown-class-example"));
		
		//2.create an object of select class which will accept the webelement as argument
		Select s=new Select(Dropdownbox);
		
		//3.BY using one of the select class methods we cant select values from the list box
		//1.selectByvisibleText:selectByVisibleText(String arg)
		s.selectByVisibleText("Option2");
		Thread.sleep(1000);
		
		//2.selectbyindex:selectbyindex(int arg)
		s.selectByIndex(1);
		Thread.sleep(1000);
		
		//3.selectbyvalue:selectbyvalue(string arg)
		s.selectByValue("option3");
		Thread.sleep(1000);
		
		System.out.println("select ismultiple state is "+s.isMultiple());

	}

}
