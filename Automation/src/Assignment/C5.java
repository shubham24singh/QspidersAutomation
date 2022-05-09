package Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class C5 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/Shubham/Desktop/Senium%20Automation%20Html%20Files/hotel.html");
	WebElement mtr = driver.findElement(By.id("mtr"));
	Select s=new Select(mtr);
    List<WebElement> option = s.getOptions();
    int count= option.size();
    for(int i=0;i<count;i++)
    {
      String text=option.get(i).getText();
      System.out.println(text);
    }		
}
}