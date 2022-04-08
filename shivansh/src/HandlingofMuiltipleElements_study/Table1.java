package HandlingofMuiltipleElements_study;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table1 {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","D:\\software\\chrome\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		List<WebElement> coloumncount = driver.findElements(By.xpath("(//table[@id='product'])//tr[1]//th"));
		System.out.println("Total number of coloumns are "+coloumncount.size());
		int totalNumberofcoloumn = coloumncount.size();
		
		List<WebElement> rowCount = driver.findElements(By.xpath("(//table[@id='product'])//tr"));
		System.out.println("Total number of rows are "+rowCount.size());
		int TotalnumberofRow = rowCount.size();
		
		////for rows means each row number
		for(int i=1;i<=TotalnumberofRow;i++)
		{
			for(int j=1;j<=totalNumberofcoloumn;j++)
			{
				if(i==1)
				{
					String text = driver.findElement(By.xpath("//table[@id='product']//tr[" + i + "]//th[" + j + "]")).getText();
					System.out.print(text+" ");
				}
				else {
					 String text = driver.findElement(By.xpath("//table[@id='product']//tr[" + i + "]//td[" + j + "]")).getText();
					 System.out.print(text+" ");
				}
				
			}
			System.out.println(" ");
		}

	}

}
