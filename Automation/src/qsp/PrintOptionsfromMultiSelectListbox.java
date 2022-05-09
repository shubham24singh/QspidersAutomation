package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintOptionsfromMultiSelectListbox {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
				}
	public static void main(String[] args) {
    WebDriver driver=new ChromeDriver();
    driver.get("file:///C:/Users/Shubham/Desktop/hotel.html");
     WebElement slvListBox = driver.findElement(By.id("slv"));
     Select s=new Select(slvListBox);
    List<WebElement> option = s.getOptions();
    for(WebElement e:option)
    {
    	String text=e.getText();
    	System.out.println(text);
    }
     

	}

}
