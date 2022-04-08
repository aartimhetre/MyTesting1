package popups;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Childbrowser_popup_study {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\software\\chrome\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://skpatro.github.io/demo/links/");
Thread.sleep(1000);
driver.manage().window().maximize();
Thread.sleep(1000);
//WebElement newtabbutton = driver.findElement(By.name("NewTab"));
//newtabbutton.click();
//Thread.sleep(1000);
//driver.quit();

WebElement newWindow = driver.findElement(By.name("NewWindow"));
newWindow.click();
Thread.sleep(1000);

//we got all multiple windows//
Set<String> allwindowsid = driver.getWindowHandles();
System.out.println("all ids are "+allwindowsid);
Iterator<String> it = allwindowsid.iterator();//pointing to -1
String mainpageid = it.next();//pointing to 0th location
String childpageid = it.next();//pointing to 1st location 

//switch selenium focus to child page//
Thread.sleep(1000);
driver.switchTo().window(childpageid);//focus switched from main page to child page
Thread.sleep(1000);

driver.manage().window().maximize();
Thread.sleep(1000);
driver.findElement(By.xpath("//input[@id='the7-search']")).sendKeys("selenium");
Thread.sleep(1000);
driver.switchTo().window(mainpageid);//switched from child page to main page
Thread.sleep(1000);
driver.findElement(By.name("home")).click();//cuming to main page n finding xpath of home button n click on that button
driver.close();


	}

}
