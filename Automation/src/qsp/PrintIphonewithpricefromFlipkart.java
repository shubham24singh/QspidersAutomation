package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintIphonewithpricefromFlipkart {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		}
	public static void main(String[] args) throws InterruptedException {
   WebDriver driver=new ChromeDriver();
   driver.get("https://www.flipkart.com/");
   driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
   Thread.sleep(5000);
   driver.findElement(By.name("q")).sendKeys("i phone 13 pro max");
   Thread.sleep(5000);
   driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
   Thread.sleep(10000);
   List<WebElement> product = driver.findElements(By.xpath("//div[contains(text(),'APPLE iPhone 13 Pro Max')]"));
   List<WebElement> price = driver.findElements(By.xpath("//div[contains(text(),'APPLE iPhone 13 Pro Max')]/../../div[2]/div[1]/div[1]"));
   for(int i=0;i<product.size();i++)
   {
	   String prod=product.get(i).getText();
	   String pr=price.get(i).getText();
	   System.out.println(prod +"---->"+ pr);
   }
   driver.close();
	}
}