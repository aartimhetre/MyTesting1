package facebook_usingPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Facebook_login_page {
@FindBy(id="email")private WebElement EmailId;
@FindBy(id="pass")private WebElement Password;
@FindBy(xpath="(//a[@role='button'])[2]")private WebElement Accountopn;

public Facebook_login_page(WebDriver driver)
{
	PageFactory.initElements(driver, this);
	}
public void sendEmail()
{
	EmailId.sendKeys("");
	}
public void sendpasswd()
{
	Password.sendKeys("");
	}
public void clickonnwaact()
{
Accountopn.click();}
	
}
