package listener;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listener implements ITestListener
{ 
	@Override
	public void onTestStart(ITestResult result)
{
		Reporter.log("Your tc started ",true);
		ITestListener.super.onTestStart(result);
	}
	@Override
	public void onTestFailure(ITestResult result) 
	{
		Reporter.log("sorry Your tc is failed",true );
		ITestListener.super.onTestFailure(result);
	}
	@Override
	public void onTestSuccess(ITestResult result) 
	{
		Reporter.log("your tc is passed",true);
		ITestListener.super.onTestSuccess(result);
	}
	@Override
	public void onTestSkipped(ITestResult result) 
	{
		Reporter.log("Your tc is skipped",true);
		ITestListener.super.onTestSkipped(result);
	}

}
