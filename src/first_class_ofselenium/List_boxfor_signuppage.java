package first_class_ofselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import constructor.CS3;

public class List_boxfor_signuppage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\software\\chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/r.php");
		
		driver.manage().window().maximize();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//img[@alt='Facebook']"));
		Thread.sleep(1000);
		driver.findElement(By.name("firstname")).sendKeys("aarti");
		Thread.sleep(1000);
		driver.findElement(By.name("lastname")).sendKeys("patil");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='text'][3]")).sendKeys("3524857825");
		Thread.sleep(1000);
		
		WebElement datedropbox = driver.findElement(By.id("day"));
		Select s1=new Select(datedropbox);
		
		s1.selectByIndex(2);
		Thread.sleep(1000);
		s1.selectByVisibleText("12");
		Thread.sleep(1000);
		s1.selectByVisibleText("25");
		Thread.sleep(1000);
		
		WebElement monthdropbox = driver.findElement(By.id("month"));
		Select s2=new Select(monthdropbox);
		
		s2.selectByValue("6");
		Thread.sleep(1000);
		s2.selectByIndex(3);
		Thread.sleep(1000);
		
		
		WebElement yeardropbox = driver.findElement(By.id("year"));
        Select s3=new Select(yeardropbox);
        
        s3.selectByValue("1998");
        Thread.sleep(1000);
        s3.selectByVisibleText("2001");
        Thread.sleep(1000);
       
        driver.findElement(By.xpath("//input[@value='1']")).click();
		
        
	
		

	}

}
