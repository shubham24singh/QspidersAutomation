package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeIncLinkSearch {
static {
System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.actitime.com/");
	String tag=driver.findElement(By.xpath("//a[text()='actiTIME Inc.']")).getTagName();
	if(tag.equals("a"))
	{
		System.out.println("Actitme Inc Link is present");
	}
	else 
	{
	System.out.println("Actitme Inc Link is not present");

}
	}
}
