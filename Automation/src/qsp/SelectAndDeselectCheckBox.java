package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectAndDeselectCheckBox {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		}
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.ironspider.ca/forms/checkradio.htm");
	List<WebElement> allchbx = driver.findElements(By.xpath("//input[@type='checkbox']"));
	for(int i=0;i<allchbx.size();i++)
	{
		Thread.sleep(2000);
		allchbx.get(i).click();
	}
	for(int i=allchbx.size()-1;i>=0;i--)
	{
		Thread.sleep(2000);
		allchbx.get(i).click();
	}

	}

}
