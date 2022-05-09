package Flipkart;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingProduct {
static {
System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
	public static void main(String[] args) throws InterruptedException {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the product ");
	String prod=sc.nextLine();
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("7905041487");
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("khushi67@");
	driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
	driver.findElement(By.name("q")).sendKeys(prod);
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
}
