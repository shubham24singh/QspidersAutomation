package com.actitime.generic;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersImplementation extends BaseClass implements ITestListener {
	@Override
	public void onTestStart(ITestResult result) {
		
	}
	@Override
	public void onTestSuccess(ITestResult result) {
		
	}
	@Override
	public void onTestFailure(ITestResult result) {
		String res=result.getName();//get name method present in math class
		TakesScreenshot t=(TakesScreenshot) driver;
		File src = t.getScreenshotAs(OutputType.FILE);
		File desc=new File("./Screenshot/"+res+".png");
		try {
			FileUtils.copyFile(src, desc);
		}
		catch(IOException e){
			}
	}
	@Override
	public void onTestSkipped(ITestResult result) {	
	}
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	}
	@Override
	public void onTestFailedWithTimeout(ITestResult result) {	
	}
	@Override
	public void onStart(ITestContext context) {	
	}
	@Override
	public void onFinish(ITestContext context) {	
	}
}
