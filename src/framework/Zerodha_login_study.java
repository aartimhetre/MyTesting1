package framework;


import java.io.FileNotFoundException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zerodha_login_study {

	public static void main(String[] args) throws InterruptedException, FileNotFoundException {
		
System.setProperty("webdriver.chrome.driver","D:\\software\\chrome\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://kite.zerodha.com/");
driver.manage().window().maximize();
Thread.sleep(2000);
WebElement userId = driver.findElement(By.id("userid"));
WebElement password = driver.findElement(By.id("password"));
userId.sendKeys("DAA677");
password.sendKeys("Velocity@123");
driver.findElement(By.xpath("//button[@type='submit']")).click();
Thread.sleep(1000);

WebElement sendpin = driver.findElement(By.id("pin"));
sendpin.sendKeys("866918");
WebElement clickbutton = driver.findElement(By.xpath("//button[@type='submit']"));
clickbutton.click();
Thread.sleep(2000);

WebElement userid1 = driver.findElement(By.xpath("//span[@class='user-id']"));

String actualUserid = userid1.getText();
System.out.println(actualUserid);
String expecteduserid = "DAA677";
Thread.sleep(3000);
if(actualUserid.equals(expecteduserid))
{
	System.out.println("userid is matched tc is passed");
	}
else
{
	System.out.println("userid is not matched tc is failed");
	}
userid1.click();
Thread.sleep(1000);
WebElement logOutButton = driver.findElement(By.xpath("//a[@target='_self']"));
logOutButton.click();
driver.close();
	}

}
