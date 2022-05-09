package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A {
static {
System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.gooogle.com/");
	driver.get("https://www.youtube.com/");
	String title=driver.getTitle();
	driver.manage().window().fullscreen();
	System.out.println(title);
	driver.close();
	}

}
