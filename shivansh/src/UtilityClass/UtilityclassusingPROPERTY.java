package UtilityClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;

public class UtilityclassusingPROPERTY {
	public static void takesScreenshotTC(WebDriver driver,int TCID) throws IOException
	{
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\Aarti Mhetre\\Desktop\\automation\\New folder\\TC"+TCID+".jpg");
		FileHandler.copy(source, dest);
		Reporter.log("screenshot taken for tc",true);
	}
	public static String DatafromMyproperties(String key) throws IOException 
	{
		Properties PR=new Properties();
		FileInputStream Myfile=new FileInputStream("C:\\Users\\Aarti Mhetre\\eclipse-workspace\\myclass\\Myfile.MyProperties");
		PR.load(Myfile);
		String value=PR.getProperty(key);
		return value;
		}
}
