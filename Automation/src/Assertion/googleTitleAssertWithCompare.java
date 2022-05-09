package Assertion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class googleTitleAssertWithCompare {
static {
System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
@Test
public void getAssert() {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	String atitle=driver.getTitle();
	String etitle="Soogle";
	SoftAssert s=new SoftAssert();
	s.assertEquals(atitle,etitle);
	driver.close();
	s.assertAll();
}
}
