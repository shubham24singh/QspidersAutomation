package HandlingDisableElementsAndScrollBar;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class HandlingDisableElements {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Shubham/Desktop/Senium%20Automation%20Html%20Files/Disabledelements.html");
        driver.findElement(By.id("d1")).sendKeys("admin");
        RemoteWebDriver r=(RemoteWebDriver)driver;
        r.executeAsyncScript("document.getElementById('d2').value='manager'");

	}

}
