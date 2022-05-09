package qsp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class CheckboxstatusActitime {
static{
System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
 public static void main(String[] args) {
 WebDriver driver=new ChromeDriver();
 driver.get("https://demo.actitime.com/");
 boolean chbox=driver.findElement(By.name("remember")).isSelected();
 if(chbox==true)
 {
   System.out.println("status of checkbox of actiTime is selected");
  }
 else {
   System.out.println("status of checkbox of actiTime is not selected"); 
 }
   }
}