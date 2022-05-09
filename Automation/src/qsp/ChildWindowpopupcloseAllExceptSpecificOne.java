package qsp;

import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindowpopupcloseAllExceptSpecificOne {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args)   {
		Scanner s=new Scanner(System.in);
		System.out.println(" Enter the title which you want to close which you dont want to clos");
		String opentitle=s.nextLine();
		WebDriver driver=new ChromeDriver();
		driver.get("https://nxtgenaiacademy.com/multiplewindows/");
		driver.findElement(By.name("newbrowserwindow123")).click();
		driver.findElement(By.name("newmessagewindow321")).click();
		Set<String> allwh = driver.getWindowHandles();
		for(String wh:allwh)
		{
			driver.switchTo().window(wh);
			String title=driver.getTitle();
			System.out.println(title);
			
			if(title.contains(opentitle))
			{	
			}
			else
			{
				driver.close();
			}
		}
	}
}