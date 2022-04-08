package KitemultiplePOMclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class kite_pinpage {
 

@FindBy(id="pin")private WebElement userPin;
@FindBy(xpath ="//button[@type='submit']")private WebElement clickonsubmit;

public kite_pinpage(WebDriver driver)
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