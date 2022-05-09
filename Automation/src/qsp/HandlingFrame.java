package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrame {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Shubham/Desktop/Senium%20Automation%20Html%20Files/page1.html");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		driver.findElement(By.id("t2")).sendKeys("jsp");
		driver.switchTo().parentFrame();
		driver.findElement(By.id("t1")).sendKeys("qsp");


	}

}
