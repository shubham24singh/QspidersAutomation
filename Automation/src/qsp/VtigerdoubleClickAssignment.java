package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class VtigerdoubleClickAssignment {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		}
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.vtiger.com/");
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	WebElement resource = driver.findElement(By.partialLinkText("Resources"));
	Actions a=new Actions(driver);
	a.moveToElement(resource).perform();
	driver.findElement(By.partialLinkText("Customers")).click();
	WebElement fullstory = driver.findElement(By.linkText("READ FULL STORY"));
	driver.findElement(By.linkText("Agree")).click();
	Thread.sleep(4000);
	a.doubleClick(fullstory);
	
	}

}
