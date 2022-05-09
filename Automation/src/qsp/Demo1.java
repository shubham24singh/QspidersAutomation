package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Demo1 {
	static {
		System.setProperty("webdriver.gecko.driver","./driver/geckoriver.exe");}
	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com/");
		

	}

}
