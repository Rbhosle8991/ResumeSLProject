package SwagLabTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import SwagLabsDemo.GoogleSearch;

public class GoogleSearchTest {
	
	public WebDriver driver;
	
	@BeforeMethod
	public void Launch()
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Driver\\geckodriver-v0.33.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
	}
	
	
  @Test
  public void EnterData() throws InterruptedException {
	  
	  GoogleSearch gs = new GoogleSearch(driver);
	  
	  gs.EnterData("Flipkart");
	  
	  Thread.sleep(3000);
	  driver.quit();
	  
  }
}
