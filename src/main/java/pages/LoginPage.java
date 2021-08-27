package pages;

import org.openqa.selenium.By;
import baseFile.TestBase;

public class LoginPage extends TestBase{

	By searchbox = By.name("q");
	
	public void search(String search)
	{
		driver.findElement(searchbox).sendKeys(search);
		driver.findElement(searchbox).clear();
	}
	
	public String title()
	{
		return driver.getTitle();
	}
}
