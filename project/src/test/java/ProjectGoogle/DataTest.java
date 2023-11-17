package ProjectGoogle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class DataTest {

		@Test
	public static void main(String[] args) {

		
		System.setProperty("webdriver.gecko.driver", "C:\\Driver\\geckodriver-v0.33.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		GoogleTest gt = new GoogleTest(driver);
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		
		gt.enterName("Selenium");
	}

}
