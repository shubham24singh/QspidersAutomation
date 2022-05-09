package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CareInsuranceAssignment {
static {
System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.findElement(By.id("policynumber")).sendKeys("123");
	driver.findElement(By.id("dob")).sendKeys("26/04/1995");
	driver.findElement(By.xpath("//a[text()='26']")).click();
	driver.findElement(By.id("alternative_number")).sendKeys("9845098450");
	driver.findElement(By.id("renew_policy_submit")).click();
	String text = driver.findElement(By.id("policynumberError")).getText();
	if(text.contains("Please enter valid Policy No."))
	{
		System.out.println("passed");
	}
	else
	{
		System.out.println("Failed");
	}
	driver.close();
}
}