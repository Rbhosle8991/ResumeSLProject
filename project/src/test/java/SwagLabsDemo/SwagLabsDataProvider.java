package SwagLabsDemo;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class SwagLabsDataProvider {
	
	
	public WebDriver driver;
	
	public SwagLabsDataProvider(WebDriver driver)
	{
		this.driver = driver;
	}
	
	
	By UserName = By.id("user-name");
	By Password = By.id("password");
	By Login = By.id("login-button");
	By Text = By.xpath("//*[@id=\"inventory_filter_container\"]/div");
	
	
	public void EnterUserName(String scenario ,String user , String pass ) throws InterruptedException
	{
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		
		driver.findElement(UserName).sendKeys(user);
		driver.findElement(Password).sendKeys(pass);

		driver.findElement(Login).click();
		
		
		
		if(scenario.equalsIgnoreCase("valid"))
		{
			String Expectedtxt = "Products";
			WebElement txt  = driver.findElement(Text);
			String actualtxt = txt.getText();
			
			if(actualtxt.equalsIgnoreCase(Expectedtxt))
			{
				System.out.println("Login is successfull");
			}
			else
			{
				System.out.println("login unsuccessfull");
			}
			
		}
		else if(scenario.equalsIgnoreCase("invalidun"))
		{
			System.out.println("please enter valid username");
		}
		else if(scenario.equalsIgnoreCase("invalidpass"))
		{
			System.out.println("please enter valid password");
		}
		
		else
		{
			System.out.println("Login is unsuccessfull");
		}
		
		
		
		
		
		
		
		
		
		
		
	}
}