package qsp;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaukariResumeAssignment {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[.='Login']")).click();
		driver.findElement(By.xpath("//input[contains(@placeholder,'Email')]")).sendKeys("prustya084@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("selenium@201");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		driver.findElement(By.xpath("//button[.='Update Profile']")).click();
		Thread.sleep(3000);
		File f=new File("./data/Resume.docx");
		String apath=f.getAbsolutePath();
		System.out.println(apath);
		driver.findElement(By.xpath("//input[@id='attachCV']")).sendKeys(apath);
	}
}
