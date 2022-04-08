package daily_practice;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;

public class Autosugessitons {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","D:\\software\\chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		WebElement searchBox = driver.findElement(By.xpath("//input[@type='text']"));
		WebDriverWait w=new WebDriverWait(driver, Duration.ofMillis(1000));
		w.until(ExpectedConditions.visibilityOf(searchBox));
		searchBox.click();
		searchBox.sendKeys("honda");
		List<WebElement> find = driver.findElements(By.xpath("//ul//li"));
		System.out.println(find.size());
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		for(WebElement f:find)
		{
			String textvalue=f.getText();
			if (textvalue.equals("honda amaze"))
			{
				f.click();
				break;
			}
		}
		
 File Source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
 FileHandler.copy(Source,new File("C:\\Users\\Aarti Mhetre\\Desktop\\automation\\New folder\\" + 111126 + " .jpg "));
 driver.close();
	}

}
