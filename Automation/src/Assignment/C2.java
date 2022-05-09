package Assignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C2 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.name("q")).sendKeys("java");
		List<WebElement> allsugg = driver.findElements(By.xpath("//span[contains(text(),'java')]"));
		int count=allsugg.size();
		for(WebElement sugg:allsugg)
		{
			String text=sugg.getText();
			System.out.println(text);
		}

	}

}
