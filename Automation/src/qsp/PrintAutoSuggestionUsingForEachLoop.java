package qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintAutoSuggestionUsingForEachLoop {
	static{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.findElement(By.name("q")).sendKeys("java");
		List<WebElement> autoSugg = driver.findElements(By.xpath("//span[contains(text(),'java')]"));
		int count=autoSugg.size();
		System.out.println(count);
		for(WebElement atsugg:autoSugg)
		{
			String text=atsugg.getText();
			System.out.println(text);
		}
		driver.close();
	}

}
