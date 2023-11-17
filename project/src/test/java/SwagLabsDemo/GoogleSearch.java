package SwagLabsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GoogleSearch {
	
	public WebDriver driver;
	
	public GoogleSearch(WebDriver driver)
	{
		this.driver = driver;
	}
	
	By Search = By.name("q");
	By Website = By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div/div/div[1]/div/span/a/h3");
	
	
	
	
	
	
	
	
	public void EnterData(String Data) throws InterruptedException
	{
		driver.findElement(Search).sendKeys(Data);
		driver.findElement(Search).sendKeys(Keys.ENTER);
		
		
		Thread.sleep(5000);
		
		driver.findElement(Website).click();
		
		
		
		
	}

}
