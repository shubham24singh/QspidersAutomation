package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XaxisYaxisActitime {
static{
System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.get("https://demo.actitime.com/");
int x1=driver.findElement(By.xpath("//div[text()='Login ']")).getLocation().getX();
int x2=driver.findElement(By.xpath("//div[text()='Login ']")).getLocation().getY();
System.out.println(x1);
System.out.println(x2);

	}

}
