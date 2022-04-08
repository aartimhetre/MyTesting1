package kite1_testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class loginPage {

	@FindBy(id="userid")private WebElement userID;
	@FindBy(id="password")private WebElement passWord;
	@FindBy(xpath = "//button[@type='submit']")private WebElement loginButton;
	public loginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void senduserId(String USID)
	{
		userID.sendKeys(USID);
	}
	public void sendpassWord(String PASWD)
	{
		passWord.sendKeys(PASWD);
	}
	public void clickonSubmitButton()
	{
		loginButton.click();
	}
}
