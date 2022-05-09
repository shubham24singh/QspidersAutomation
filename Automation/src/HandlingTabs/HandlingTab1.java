package HandlingTabs;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingTab1 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
				}
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver= new ChromeDriver();
	driver.get("https://demo.actitime.com/login.do");
	Thread.sleep(2000);
	driver.findElement(By.partialLinkText("actiTIME Inc.")).click();
	Set<String> allwh = driver.getWindowHandles();
	int count=allwh.size();
	for(String wh:allwh)
	{	Thread.sleep(2000);
		driver.switchTo().window(wh);
		driver.close();
	}

	}

}
