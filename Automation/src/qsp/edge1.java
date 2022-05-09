package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class edge1 {
static {
System.setProperty("webdriver.edge.driver", "./driver/msedgedriver.exe");
}
	public static void main(String[] args) {
	WebDriver driver=new EdgeDriver();

	}

}
