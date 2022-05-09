package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class bbcwebsitetopnewtextprint {
static {
System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
    driver.get("https://www.bbc.com/");
    List<WebElement> headlines = driver.findElements(By.xpath("//span[@class='top-list-item__bullet']/../h3"));
    int count=headlines.size();
    System.out.println(count);
    for(int i=0;i<count;i++)
    {
    	String text=headlines.get(i).getText();
    	System.out.println(text);
    }  
    driver.close();
	}
}
