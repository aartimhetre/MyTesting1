package by_using_firefox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class msedge_study11 {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.edge.driver","D:\\software\\edgedriver_win64\\msedgedriver.exe");
		

        WebDriver driver=new EdgeDriver();
        driver.get("https://web.whatsapp.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);


	}

}
