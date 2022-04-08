package popups;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Child_browserpopup {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","D:\\software\\chrome\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		String mainpagewindowID = driver.getWindowHandle();
		System.out.println("the main window id is " +mainpagewindowID);
		driver.findElement(By.name("NewWindow")).click();//opening child browser pop up
		
		//for getting multiple windows at a time//
		Set<String> multiwindw = driver.getWindowHandles();
		System.out.println("all the windows "+ multiwindw); 
		
		

	}

}

