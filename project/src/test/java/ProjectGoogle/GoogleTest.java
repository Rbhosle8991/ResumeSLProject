package ProjectGoogle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoogleTest {
	
	public WebDriver driver;
	
	public GoogleTest(WebDriver driver)
	{
		this.driver = driver;
	}
	
	By Name = By.name("q");
	
	
	public void enterName(String name)
	{
		driver.findElement(Name).sendKeys(name);
	}

}
