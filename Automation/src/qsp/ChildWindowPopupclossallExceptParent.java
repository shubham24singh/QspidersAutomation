package qsp;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindowPopupclossallExceptParent {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://nxtgenaiacademy.com/multiplewindows/");
		String pwh=driver.getWindowHandle();
		Thread.sleep(3000);
		driver.findElement(By.name("newbrowserwindow123")).click();
		driver.findElement(By.name("newbrowserwindow123")).click();
		Set<String> allwh = driver.getWindowHandles();
		for(String wh:allwh)
		{
			driver.switchTo().window(wh);
			Thread.sleep(1000);
			if(wh.contains(pwh))
			{
			}
			else
			{
				driver.close();
			}
		}
	}
}
