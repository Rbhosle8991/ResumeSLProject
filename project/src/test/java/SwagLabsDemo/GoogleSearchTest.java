package SwagLabsDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleSearchTest {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.gecko.driver", "C:\\Driver\\geckodriver-v0.33.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		GoogleSearch gsa = new GoogleSearch(driver);
		driver.get("https://www.google.com/");
		
		gsa.EnterData("SwagLabs");
	
	}

}
