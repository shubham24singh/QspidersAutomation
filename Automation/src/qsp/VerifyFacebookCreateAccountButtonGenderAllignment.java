package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyFacebookCreateAccountButtonGenderAllignment {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		}
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
	Thread.sleep(2000);
	int y1=driver.findElement(By.xpath("//label[text()='Female']")).getLocation().getY();
	int y2=driver.findElement(By.xpath("//label[text()='Male']")).getLocation().getY();
	int y3=driver.findElement(By.xpath("//label[text()='Custom']")).getLocation().getY();
	if(y1==y2&&y2==y3)
	{
		System.out.println("Gender Radio buttons are properly alligned");
	}
	else
	{
		System.out.println("Gender Radio buttons are not properly alligned");
	}
	
	}

}
