package size_position;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Setsize {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","D:\\software\\chrome\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		Thread.sleep(2000);
		//to get default size
		driver.manage().window().getSize();
		System.out.println(driver.manage().window().getSize());
		Thread.sleep(1000);
		//to set size create an object of dimension class which will accept width and height//
		Dimension d=new Dimension(1000, 300);
		
		//as method setsize whicg will accept object of Dimension class
		Thread.sleep(2000);
		driver.manage().window().setSize(d);
		System.out.println(driver.manage().window().getSize());
	}

}
