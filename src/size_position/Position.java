package size_position;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Position {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","D:\\software\\chrome\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		Thread.sleep(2000);
//to get default position
		driver.manage().window().getPosition();
		//1.to change position create object of point class which will accept x and y co-ordinates
		Point p=new Point(100, 100);
		//2.use set position which will accept object of point class
		
		driver.manage().window().setPosition(p);
	}

}
