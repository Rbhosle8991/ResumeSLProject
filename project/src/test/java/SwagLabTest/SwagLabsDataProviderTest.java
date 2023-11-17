package SwagLabTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import SwagLabsDemo.SwagLabsDataProvider;

public class SwagLabsDataProviderTest {
	
	public WebDriver driver;
	
	@BeforeMethod
	public void Launch()
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Driver\\geckodriver-v0.33.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
		
	}
	
	
	@AfterMethod
	public void closeApp()
	{
		driver.close();
	}
	
	
  @Test(dataProvider = "Login")
  public void Test1( String scenario, String user , String pass) throws InterruptedException {
	  
	  SwagLabsDataProvider swdp = new SwagLabsDataProvider(driver);
	  
	  swdp.EnterUserName(scenario ,user , pass);
  }
  
  @DataProvider(name="Login")
  public static Object[][] getData()
  {
	  return new Object[][]
	 {
		  {"valid","standard_user" , "secret_sauce" },
		  {"invalidun","Akshay" , "secret_sauce" },
		  {"invalidpass","standard_user" , "guset99" }
	 };
  }

                       
                          
  
  
  
  
  
  
  
}
