package com.actitime.generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class BaseClassWithGroups {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		System.setProperty("webdriver.edge.driver","./driver/msedgedriver.exe");
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
		}
	public WebDriver driver;
	@Parameters("browser")
	@BeforeTest
	public void OpenBrowser(String browser) {
	if(browser.equals("chrome")) {
	driver=new ChromeDriver();
	}
	else if(browser.equals("firefox"))
	{
		driver=new FirefoxDriver();
	}
	else if(browser.equals("edge"))
	{
		driver=new EdgeDriver();
	}
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}
	@AfterTest
	public void CloseBrowser() {
	Reporter.log("Close Browser",true);
	driver.close();
	}
	@BeforeMethod
	public void login() {
	Reporter.log("Login",true);
	driver.get("https://demo.actitime.com/login.do");
	driver.findElement(By.id("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	driver.findElement(By.xpath("//div[text()='Login ']")).click();
	}
	@AfterMethod
	public void logout() {
	Reporter.log("Logout",true);
	driver.findElement(By.id("logoutLink")).click();
	}
	}

