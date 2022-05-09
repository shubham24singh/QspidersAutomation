package qsp;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintCheckboxofWebsite {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		}
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the URL");
		String url=s.nextLine();
		//url:https://www.ironspider.ca/forms/checkradio.htm
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		List<WebElement> chkbox = driver.findElements(By.xpath("//input[@type='checkbox']"));
		int count=chkbox.size();
		System.out.println(count);
		for(int i=0;i<count;i++)
		{
			chkbox.get(i).click();
		}
	}
}
