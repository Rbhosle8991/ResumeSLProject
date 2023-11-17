package SwagLabsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SwagLabsMuiltipleProducts {
	
	public WebDriver driver;
	
	public SwagLabsMuiltipleProducts(WebDriver driver)
	{
		this.driver = driver;
	}
	
	By UserName = By.id("user-name");
	By Password = By.id("password");
	By Login = By.id("login-button");
	By Text = By.xpath("//*[@id=\"inventory_filter_container\"]/div");
	By Product1 = By.xpath("//*[@id=\"inventory_container\"]/div/div[1]/div[3]/button");
	By Product2 = By.xpath("//*[@id=\"inventory_container\"]/div/div[2]/div[3]/button");
	By Product3 = By.xpath("//*[@id=\"inventory_container\"]/div/div[3]/div[3]/button");
	By Product4 = By.xpath("//*[@id=\"inventory_container\"]/div/div[4]/div[3]/button");		
	By Product5 = By.xpath("//*[@id=\"inventory_container\"]/div/div[5]/div[3]/button");
	By Product6 = By.xpath("//*[@id=\"inventory_container\"]/div/div[6]/div[3]/button");
	
	
	
	public void EnterUserAndPass( String scenario ,String user , String Pass) throws InterruptedException
	{
		driver.findElement(UserName).sendKeys(user);
		driver.findElement(Password).sendKeys(Pass);
		
		Thread.sleep(2000);
		driver.findElement(Login).click();
		
		if(scenario.equalsIgnoreCase("valid"))
		{
			String Actualtxt = driver.findElement(Text).getText();
			System.out.println("Actual text is : " +Actualtxt);
			String Expectedtxt = "Products";
			
			if(Actualtxt.equalsIgnoreCase(Expectedtxt))
			{
				System.out.println("Login is Successfull");
				
				driver.findElement(Product1).click();
				Thread.sleep(2000);
				driver.findElement(Product2).click();
				Thread.sleep(2000);
				driver.findElement(Product3).click();
				Thread.sleep(2000);
				driver.findElement(Product4).click();
				Thread.sleep(2000);
				driver.findElement(Product5).click();
				Thread.sleep(2000);
				driver.findElement(Product6).click();
				Thread.sleep(2000);
				
				
				Thread.sleep(3000);
			}
			else
			{
				System.out.println("Username and password do not match any user in this service");
			}
		}
		else if(scenario.equalsIgnoreCase("Invalidun"))
		{
			System.out.println("Please enter valid username");
			Thread.sleep(3000);
		}
		
		else if(scenario.equalsIgnoreCase("Invalidpass"))
		{
			System.out.println("please enter valid password");
			Thread.sleep(3000);
		}
		
		else {
			System.out.println("Login is unsuccessfull");
		}
		
	}
	
	
	}
	

