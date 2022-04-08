package KitemultiplePOMclasses;

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
		 }
	public void clickonButton() throws InterruptedException
	{
		userID.click();
		Thread.sleep(1000);
		logout.click();}
	
}
