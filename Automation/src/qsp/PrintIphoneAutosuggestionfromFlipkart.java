package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintIphoneAutosuggestionfromFlipkart {
static {
System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.name("q")).sendKeys("i phone");
		Thread.sleep(10000);
		List<WebElement> autosugg = driver.findElements(By.xpath("//div[@class='lrtEPN _17d0yO']"));
		int count=autosugg.size();
		System.out.println(count);
		for(int i=0;i<count;i++)
		{
			String text=autosugg.get(i).getText();
			System.out.println(text);
		}
		String lastsuggestion=autosugg.get(count-1).getText();
		System.out.println("last suggestion---> "+lastsuggestion);
		driver.close();
	}

}
