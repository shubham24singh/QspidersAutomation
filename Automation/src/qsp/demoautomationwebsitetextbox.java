package qsp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoautomationwebsitetextbox {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath("//a[text()='Alert with Textbox ']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
         Alert a = driver.switchTo().alert();
         Thread.sleep(5000);
         a.sendKeys("Ujjwal");
         Thread.sleep(5000);
         a.accept();
         String text=driver.findElement(By.id("demo1")).getText();
         if(text.contains("Hello Ujjwal How are you today"))
         {
        	 System.out.println("passed");
         }
         else {
        	 System.out.println("Failed");
         }
         driver.close();
         
	}

}
