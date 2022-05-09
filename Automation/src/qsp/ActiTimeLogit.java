package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeLogit {
static {
System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://online.actitime.com/usingh/login.do");
	driver.findElement(By.id("username")).sendKeys("us815933@gmail.com");
	driver.findElement(By.name("pwd")).sendKeys("vG@JmpeE");
	driver.findElement(By.linkText("Login")).click();
	}
}