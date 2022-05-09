package qsp;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindowHandle{
static {
System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
	public static void main(String[] args) throws InterruptedException {
    WebDriver driver=new ChromeDriver();
    driver.get("https://nxtgenaiacademy.com/multiplewindows/");
    Thread.sleep(2000);
    driver.findElement(By.name("newbrowserwindow123")).click();
    driver.findElement(By.name("newbrowserwindow123")).click();
    Thread.sleep(2000);	
    Set<String> allwh=driver.getWindowHandles();
    int count=allwh.size();
    System.out.println(count);
    for(String i:allwh)
    {
    	System.out.println(i);
    }
    driver.quit();
	}
}
