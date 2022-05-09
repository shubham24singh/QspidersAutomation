package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingListBoxDOBAssignment {
	static{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		}
	public static void main(String[] args)  {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create New Account")).click();	
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		WebElement dayListBox = driver.findElement(By.id("day"));
		WebElement monthListBox = driver.findElement(By.id("month"));
		WebElement yearListBox = driver.findElement(By.id("year"));
		Select s1=new Select(dayListBox);
		Select s2=new Select(monthListBox);
		Select s3=new Select(yearListBox);
		s1.selectByIndex(25);
		s2.selectByValue("4");
		s3.selectByVisibleText("1995");
		

	}

}
