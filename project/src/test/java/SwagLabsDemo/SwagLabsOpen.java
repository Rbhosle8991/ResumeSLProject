package SwagLabsDemo;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SwagLabsOpen {
	
	public WebDriver driver;
	
	
	public SwagLabsOpen(WebDriver driver)
	{
		this.driver = driver;
	}
	
	
	By UserName = By.id("user-name");
	By Password = By.id("password");
	By Login = By.id("login-button");
	By AddItems = By.xpath("//*[@id=\"inventory_container\"]/div/div[1]/div[3]/button");
	By AddItems2 = By.xpath("//*[@id=\"inventory_container\"]/div/div[2]/div[3]/button");
	By YourCart = By.xpath("//*[name()='path' and contains(@fill,'currentCol')]");
	By checkout = By.xpath("//a[text()='CHECKOUT']");
	By FirstName = By.id("first-name");
	By LastName = By.id("last-name");
	By ZipCode = By.id("postal-code");
	By Continue = By.xpath("//*[@id=\"checkout_info_container\"]/div/form/div[2]/input");
	By Finish = By.xpath("//a[text()='FINISH']");
	
	
	
	
	public void UserNamePassword(String user , String pass) throws InterruptedException
	{
		
		driver.findElement(UserName).sendKeys(user);
		driver.findElement(Password).sendKeys(pass);
		Thread.sleep(3000);
	}
	
	public void LoginButton() throws InterruptedException
	{
		driver.findElement(Login).click();
		
		String actualtitle = driver.getTitle();
		System.out.println("Webpage Title is : " +actualtitle);
		
		String expectedtitle = "Swag Labs";
		
		if(actualtitle.equalsIgnoreCase(expectedtitle))
		{
			System.out.println("Login is Successfull");
		}
		
		else
		{
			System.out.println("Login is Unsuccessfull , Please enter valid data");
		}
		
		Thread.sleep(4000);
	}
	
	public void AddToCart() throws InterruptedException
	{
		driver.findElement(AddItems).click();
		driver.findElement(AddItems2).click();
		Thread.sleep(3000);
	}
	
	public void CartItems() throws InterruptedException
	{
		driver.findElement(YourCart).click();
		Thread.sleep(3000);
	}
	
	public void check() throws InterruptedException
	{
		driver.findElement(checkout).click();
		Thread.sleep(3000);
	}
	
	public void Details(String name , String last , String zip) throws InterruptedException
	{
		driver.findElement(FirstName).sendKeys(name);
		driver.findElement(LastName).sendKeys(last);
		driver.findElement(ZipCode).sendKeys(zip);
		Thread.sleep(3000);
	}
	
	public void continueandFinish() throws InterruptedException
	{
		driver.findElement(Continue).click();
		Thread.sleep(3000);
		driver.findElement(Finish).click();
		Thread.sleep(3000);
		System.out.println("Your Order is successfull");
		}

}
