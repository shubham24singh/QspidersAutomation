package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintAutoSuggestionIphoneFlipkart {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");}
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.findElement(By.name("q")).sendKeys("iphone");
	
	
	
	}

}
