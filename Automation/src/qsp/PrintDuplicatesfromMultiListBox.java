package qsp;

import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintDuplicatesfromMultiListBox {
static {
System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}

        public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Shubham/Desktop/hotel.html");
		WebElement mtrListBox = driver.findElement(By.id("mtr"));
		Select s=new Select(mtrListBox);
		List<WebElement> alloption = s.getOptions();
		HashSet<String> h=new HashSet<>();
		for(WebElement e:alloption)
		{
			String text=e.getText();
			if(h.add(text)==false)
			{
				System.out.println(text);
			}
		}
	}
}
