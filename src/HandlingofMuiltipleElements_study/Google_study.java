package HandlingofMuiltipleElements_study;

import java.io.File;
import java.io.IOException;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Google_study {

	public static void main(String[] args) throws InterruptedException, IOException {
		
System.setProperty("webdriver.chrome.driver","D:\\software\\chrome\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement textBox = driver.findElement(By.xpath("//input[@role='combobox']"));
		textBox.click();
		textBox.sendKeys("honda");
		Thread.sleep(1000);
		List<WebElement> find = driver.findElements(By.xpath("//ul//li"));
		System.out.println(find.size());
		Thread.sleep(5000);
		for(WebElement w:find)
		{
			String textvalue = w.getText();
			if(textvalue.equals("honda city"))
			{
				w.click();
				break;
			}
			
		}
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Images")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[@class='F9PbJd xKddTc'])[3]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//img[@jsname='Q4LuWd'])[4]")).click();
		Thread.sleep(1000);
		//by taking screenshot//
		
		File screen=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(screen, new File("C:\\Users\\Aarti Mhetre\\Desktop\\automation\\pictures\\ "+1234+ ".jpg ")) ;
	 
	 
	}

}
