package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MouseHover {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		}
	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();	
	driver.get("https://www.vtiger.com/");
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);


	}

}
