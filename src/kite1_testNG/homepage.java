package kite1_testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class homepage {
	@FindBy(xpath = "//span[@class='user-id']")private WebElement userid;
	@FindBy(xpath = "//a[@target='_self']")private WebElement logout;

	public homepage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		}
	public String validationuserId()
	{
		 String actualuserid = userid.getText();
		 return actualuserid;
//		 if(expecteduserid.equals(actualuserid))
//		 {
//			 System.out.println("click on useerid,tc is passed");
//		 }
//		 else
//		 {
//			 System.out.println("tc is failed");
//		 }
//		 
		}
	public void clickonButton() throws InterruptedException
	{
		userid.click();
		Thread.sleep(1000);
		logout.click();}
	}
