package qsp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automationdemositealertpopuphandling {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		}
			public static void main(String[] args) {
			WebDriver driver=new ChromeDriver();
			driver.get("http://demo.automationtesting.in/Alerts.html");
			driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
			 Alert a = driver.switchTo().alert();
			 String text=a.getText();
			 a.accept();
			 System.out.println(text);
			 driver.close();

	}

}
