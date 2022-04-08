package kite1_testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class pinpage {
	@FindBy(id="pin")private WebElement userPin;
	@FindBy(xpath ="//button[@type='submit']")private WebElement clickonsubmit;

	public pinpage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		}
	public void sendpin(String PIN)
	{
		userPin.sendKeys(PIN);
		}
	public void clickonSubmit()
	{
		clickonsubmit.click();
		}
	}

