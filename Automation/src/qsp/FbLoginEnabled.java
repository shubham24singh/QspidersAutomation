package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbLoginEnabled {
static {
System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	boolean log=driver.findElement(By.name("login")).isEnabled();
	if(log==true)
	{
		System.out.println("Login button of facebook is enabled");
	}
	else
	{
		System.out.println("Login button of facebook is not enabled");
	}
	}
}
