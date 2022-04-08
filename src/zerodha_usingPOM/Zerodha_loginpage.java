package zerodha_usingPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Zerodha_loginpage {

	@FindBy(id="userid")private WebElement userID;
	@FindBy(id="password")private WebElement passWord;
	@FindBy(xpath = "//button[@type='submit']")private WebElement loginButton;
	public Zerodha_loginpage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void senduserId()
	{
		userID.sendKeys("DAA677");
	}
	public void sendpassWord()
	{
		passWord.sendKeys("Velocity@123");
	}
	public void clickonSubmitButton()
	{
		loginButton.click();
	}
}
