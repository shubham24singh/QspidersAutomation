package qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ClearTripAssignment {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/flights");
         driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
         driver.findElement(By.xpath("(//input[@placeholder='Any worldwide city or airport'])[1]")).sendKeys("Bangalore");
         driver.findElement(By.xpath("//p[contains(text(),'Bangalore')]")).click();
         driver.findElement(By.xpath("(//input[@placeholder='Any worldwide city or airport'])[2]")).sendKeys("Bhubaneswar");
         driver.findElement(By.xpath("//p[contains(text(),'Bhubaneswar')]")).click();
   driver.findElement(By.xpath("(//button[contains(@class,'flex flex-middle flex')])[4]")).click();
   driver.findElement(By.xpath("//div[text()='15']")).click(); 
   driver.findElement(By.xpath("//button[text()='Search flights']")).click();  
   List<WebElement> flights = driver.findElements(By.xpath("//div[@class='flex flex-row nmx-1']//img"));
   int count=flights.size();
   System.out.println(count);
   List<WebElement> depart = driver.findElements(By.xpath("//div[@class='ms-grid-column-1 ms-grid-row-1']//p"));
    for(int i=0;i<count;i++)
    {
    	String ftext=flights.get(i).getAttribute("alt");
    	String departure=depart.get(i).getText();
    	System.out.println("Flight name- "+ftext+" departure time- "+departure);
    }
	}
}
