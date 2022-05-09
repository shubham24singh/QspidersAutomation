package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MainMethodClass {
static {
System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
@Test
	public  void setLogin() throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.actitime.com/");
	LoginPage l=new LoginPage(driver);
	l.setValue("admin1","manager1");
	Thread.sleep(4000);
	l.setValue("admin","manager");
	}
}