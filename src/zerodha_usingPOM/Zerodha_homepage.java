package zerodha_usingPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Zerodha_homepage {
@FindBy(xpath = "//span[@class='user-id']")private WebElement userid;
@FindBy(xpath = "//a[@target='_self']")private WebElement logout;

public Zerodha_homepage(WebDriver driver)
{
	PageFactory.initElements(driver,this);
	}
public void validationuserId()
{
	 String actualuserid = userid.getText();
	 String expecteduserid = "DAA677";
	 if(expecteduserid.equals(actualuserid))
	 {
		 System.out.println("click on useerid,tc is passed");
	 }
	 else
	 {
		 System.out.println("tc is failed");
	 }
	 
	}
public void clickonButton() throws InterruptedException
{
	userid.click();
	Thread.sleep(1000);
	logout.click();}
}
