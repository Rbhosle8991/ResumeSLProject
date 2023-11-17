package SwagLabsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class FlipkartDemo {

	
	public WebDriver driver;
	
	public FlipkartDemo(WebDriver driver)
	{
		this.driver = driver;
	}
	
	By SignIn = By.xpath("//span[text()='Sign in']");
	
	
	
	public void SelectOption()
	{
		Actions act = new Actions(driver);
		WebElement txt = driver.findElement(SignIn);
		act.moveToElement(txt).build().perform();
	}
}
