package mouse_actions_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_and_Drop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\software\\chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://qavbox.github.io/demo/dragndrop/");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		WebElement source = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement target= driver.findElement(By.xpath("//div[@id='droppable']"));
		
		Actions act=new Actions(driver);
		//act.dragAndDrop(source, target).perform();
		
		act.clickAndHold(source).moveToElement(target).build().perform();
	}

}
