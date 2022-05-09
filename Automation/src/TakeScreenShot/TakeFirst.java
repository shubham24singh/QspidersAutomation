package TakeScreenShot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeFirst {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		}
			public static void main(String[] args) throws IOException {
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.google.com/");
			TakesScreenshot t=(TakesScreenshot) driver;
			File src = t.getScreenshotAs(OutputType.FILE);
			File desc=new File("./Screenshot/ss.png");
			FileUtils.copyFile(src, desc);
			driver.close();
}
}