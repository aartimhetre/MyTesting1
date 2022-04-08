package first_class_ofselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gettextuse {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\software\\chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
	//	System.out.println(driver.findElement(By.xpath("//h1[text()='Welcome To Practice Page']")).getText());
		
		WebElement webele = driver.findElement(By.xpath("//h1[text()='Welcome To Practice Page']"));
		String actualtext = webele.getText();
        System.out.println("text is "+actualtext);
       
        String expectedtext="Practice Page";
        if(actualtext.equals(expectedtext))
        {
        	System.out.println("text is matching ,textcases passed");
        }
        else
        {
        	System.out.println("text is not matching,testcase failed");
        }
	}

}

