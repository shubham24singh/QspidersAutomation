package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class P1 {
static {
System.setProperty("webdriver.edge.driver","./driver/msedgedriver.exe");
}
	public static void main(String[] args) {
	WebDriver driver=new EdgeDriver();
	driver.get("https://accounts.google.com/signin/v2/challenge/pwd?passive=1209600&continue=https%3A%2F%2Faccounts.google.com%2Fb%2F1%2FAddMailService&followup=https%3A%2F%2Faccounts.google.com%2Fb%2F1%2FAddMailService&flowName=GlifWebSignIn&flowEntry=ServiceLogin&cid=1&navigationDirection=forward&TL=AM3QAYYFE-mDXGhAyRBIM1a498gUVtGoWIhb3N1NiCX3_JMkyk2zAzlFdjVpw_bu");
	driver.findElement(By.xpath("//input[@type='email']")).sendKeys("singhujjwal374@gmail.com");
	driver.findElement(By.xpath("//span[text()='Next']")).click();
	}

}
