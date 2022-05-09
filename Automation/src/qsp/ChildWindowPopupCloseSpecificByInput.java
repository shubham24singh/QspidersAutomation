package qsp;

import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindowPopupCloseSpecificByInput {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException    {
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter the title which you want to close");
		String closetitle=sc.nextLine();
		WebDriver driver=new ChromeDriver();
		driver.get("https://nxtgenaiacademy.com/multiplewindows/");
		driver.findElement(By.name("newbrowserwindow123")).click();
		driver.findElement(By.name("newbrowserwindow123")).click();
		Set<String> allwh = driver.getWindowHandles();
		System.out.println(allwh);
		for(String wh:allwh)
		{
			Thread.sleep(2000);
			driver.switchTo().window(wh);
			String title=driver.getTitle();
			System.out.println(title);
			if(title.contains(closetitle))
			{
				driver.close();
			}
		}
	}
}
