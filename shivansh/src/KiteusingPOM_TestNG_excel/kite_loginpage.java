package KiteusingPOM_TestNG_excel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class kite_loginpage {
	@FindBy(xpath = "//span[@class='user-id']")private WebElement userID;
	@FindBy(id="password")private WebElement passWord;
	@FindBy(xpath = "//button[@type='submit']")private WebElement loginButton;
	public kite_loginpage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
  }
	public void senduserId(String UID)
	{
		userID.sendKeys(UID);
	}
	public void sendpassWord(String PWD)
	{
		passWord.sendKeys(PWD);
	}
	public void clickonSubmitButton()
	{
		loginButton.click();
	}
}
