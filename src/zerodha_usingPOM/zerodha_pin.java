package zerodha_usingPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class zerodha_pin {
@FindBy(id="pin")private WebElement userPin;
@FindBy(xpath ="//button[@type='submit']")private WebElement clickonsubmit;

public zerodha_pin(WebDriver driver)
{
	PageFactory.initElements(driver,this);
	}
public void sendpin()
{
	userPin.sendKeys("866918");
	}
public void clickonSubmit()
{
	clickonsubmit.click();
	}
}
