package KiteusingPOM_TestNG_excel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class kite_homepage {
	@FindBy(xpath = "//span[@class='user-id']")private WebElement userID;
	@FindBy(xpath = "//a[@target='_self']")private WebElement logout;

	public kite_homepage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		}
	public String getActualUserId()
	{
		 String actualuserID = userID.getText();
		 return actualuserID;
//		 if(expecteduserid.equals(actualuserid))
//		 {
//			 System.out.println("click on useerid,tc is passed");
//		 }
//		 else
//		 {
//			 System.out.println("tc is failed");
//		 }
//		 
//		
		 }
	public void clickonButton() throws InterruptedException
	{
		userID.click();
		Thread.sleep(1000);
		logout.click();}
	
}
