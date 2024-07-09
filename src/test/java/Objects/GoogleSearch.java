package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoogleSearch {
	
	
	WebDriver driver;
	
	public GoogleSearch(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	By searchby = By.xpath("//*[@id='twotabsearchtextbox']");
	
	public void googleSearch(String text) 
	
	{
		driver.findElement(searchby).sendKeys(text);
	}
	
}
