package SwagLabsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class AmazonDemo {

	
	public WebDriver driver;
	
	public AmazonDemo(WebDriver driver)
	{
		this.driver = driver;
	}
	
	By SignIn = By.xpath("//*[@id=\"nav-link-accountList-nav-line-1\"]");
	
	
	
	public void SelectOption()
	{
		WebElement txt = driver.findElement(SignIn);
		Actions act = new Actions(driver);
		
		act.moveToElement(txt).build().perform();
	}
}
