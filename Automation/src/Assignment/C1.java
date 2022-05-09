package Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C1 {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	List<WebElement> alllink = driver.findElements(By.xpath("//a"));
	int count=alllink.size();
	for(int i=0;i<count;i++)
	{
		String text=alllink.get(i).getText();
		System.out.println(text);
	}
}
}
