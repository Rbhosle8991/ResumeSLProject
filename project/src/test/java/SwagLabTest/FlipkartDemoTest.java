package SwagLabTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import SwagLabsDemo.AmazonDemo;

public class FlipkartDemoTest {
	
	public WebDriver driver;
	
	@BeforeMethod
	public void Launch()
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Driver\\geckodriver-v0.33.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
	}
  @Test
  public void Select() {
	  
	  AmazonDemo fd = new AmazonDemo(driver);
	  
	  fd.SelectOption();
  }
}
