package HandlingPropertyFiles;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingPropertyInActitime {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		}

	public static void main(String[] args) throws IOException {
	FileInputStream fis=new FileInputStream("./data/duplicate.property");
	Properties p=new Properties();
	p.load(fis);
	String ul=p.getProperty("url");
	String un=p.getProperty("un");
	String pwd=p.getProperty("pwd");
	String xpath=p.getProperty("xpath");
		WebDriver driver=new ChromeDriver();
		driver.get(ul);
		driver.findElement(By.id("username")).sendKeys(un);
		driver.findElement(By.name("pwd")).sendKeys(pwd);
		driver.findElement(By.xpath(xpath)).click();
		

	}

}
