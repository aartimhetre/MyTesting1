package HandlingofMuiltipleElements_study;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalLinksinPage {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","D:\\software\\chrome\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
List<WebElement> totallinks = driver.findElements(By.tagName("a"));
System.out.println("total links in page are "+totallinks.size());

for(WebElement w:totallinks)
{
	System.out.println(w.getText());}
	}
		

}
