package popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_popups {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","D:\\software\\chrome\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
 WebElement clickbutton = driver.findElement(By.id("alertButton"));
 clickbutton.click();
 Thread.sleep(6000);
 Alert alt = driver.switchTo().alert();
 Thread.sleep(2000);
 alt.accept();
 String altgettxt = alt.getText();//gettext method for the alert type popup//exception will occured in this 
 System.out.println("the output of the gettext is " + altgettxt);
 
	}

}
