package qsp;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintItemsfrommultilistboxfromUsingScanner {
static {
System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    WebDriver driver=new ChromeDriver();
    driver.get("file:///C:/Users/Shubham/Desktop/hotel.html");
    WebElement mtrListBox = driver.findElement(By.id("mtr"));
    Select s=new Select(mtrListBox);
    List<WebElement> option = s.getOptions();
	}
}
