package com.actitime.generic;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverCommonLib {
public void waitForLoad(WebDriver driver) {
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
}
public void WaitForPage(WebDriver driver,WebElement element)
{
	WebDriverWait wait=new WebDriverWait(driver,10);
	wait.until(ExpectedConditions.visibilityOf(element));
}
public void customWait(WebElement element) {
int i=0;
while(i<=100) {
try {
	element.isDisplayed();
	break;
}
catch(NoSuchElementException e)
{
	i++;
}
}
}
}
