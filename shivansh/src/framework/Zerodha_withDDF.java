package framework;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zerodha_withDDF {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver","D:\\software\\chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//by using excel information//
		FileInputStream MyFile=new FileInputStream("C:\\Users\\Aarti Mhetre\\Desktop\\Real time project\\Book1.xlsx");
		Sheet Mysheet = WorkbookFactory.create(MyFile).getSheet("Sheet4");
		String userIde = Mysheet.getRow(0).getCell(0).getStringCellValue();
		String password1 = Mysheet.getRow(0).getCell(1).getStringCellValue();
		String pinname = Mysheet.getRow(0).getCell(2).getStringCellValue();
		//come to selenium by using excel sheet //
		System.out.println("Lonin to zerodha account by Dhyaneshwar sir");
		WebElement userId = driver.findElement(By.id("userid"));
		WebElement password = driver.findElement(By.id("password"));
		userId.sendKeys(userIde);
		password.sendKeys(password1);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(1000);
        System.out.println("Open the acccount by giving pin");
		WebElement sendpin = driver.findElement(By.id("pin"));
		sendpin.sendKeys(pinname);
		WebElement clickbutton = driver.findElement(By.xpath("//button[@type='submit']"));
		clickbutton.click();
		Thread.sleep(2000);

		WebElement userid1 = driver.findElement(By.xpath("//span[@class='user-id']"));

		String actualUserid = userid1.getText();
		System.out.println(actualUserid);
		String expecteduserid = userIde;
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
