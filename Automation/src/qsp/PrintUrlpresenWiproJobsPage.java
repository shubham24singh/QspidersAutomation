package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintUrlpresenWiproJobsPage {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.google.com/search?q=wipro+jobs&rlz=1C1ONGR_enIN982IN982&oq=wipro+jobs&aqs=chrome.0.69i59j0i512l6j69i60.5718j0j4&sourceid=chrome&ie=UTF-8");
   List<WebElement> linktexts = driver.findElements(By.xpath("//cite[@class='iUh30 qLRx3b tjvcx']"));
   int count=linktexts.size();
   System.out.println(count);
   for(WebElement url:linktexts)
   {
	  String text=url.getText();
	  System.out.println(text);
   }
	}
}
