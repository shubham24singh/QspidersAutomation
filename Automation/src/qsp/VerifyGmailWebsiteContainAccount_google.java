package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyGmailWebsiteContainAccount_google {
static{
System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.gmail.com/");
		String url=driver.getCurrentUrl();
		if(url.contains("google.com"))
		{
			System.out.println(" Url is navigating to google.com");
		}
		else
		{
			System.out.println(" Url is not navigating to google.com");
		}
	}
}