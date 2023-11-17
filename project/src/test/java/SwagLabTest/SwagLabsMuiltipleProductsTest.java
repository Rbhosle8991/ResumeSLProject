package SwagLabTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import SwagLabsDemo.SwagLabsMuiltipleProducts;

public class SwagLabsMuiltipleProductsTest {
	
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
	public void Close()
	{
		driver.close();
	}
	
	
  @Test(dataProvider = "Login")
  public void Test(String scenario , String user , String pass) throws InterruptedException {
	  
	  SwagLabsMuiltipleProducts slm = new SwagLabsMuiltipleProducts(driver);
	  slm.EnterUserAndPass(scenario, user , pass);
	 
  }
	  
	  
	  @DataProvider(name ="Login")
	  public static Object[][] getdata()
	  {
		  return new Object[][]
		  {
			  {"valid" , "standard_user" ,"secret_sauce"},
			  {"Invalidun" , "Rahul" , "secret_sauce"},
			  {"Invalidpass" , "standard_user" , "hjgsjd79s8"}
		  };
	  }
  }

	  
	  
  

