package pages;

import org.openqa.selenium.By;

import baseFile.TestBase;

public class HomePage extends TestBase{

	By searchButton=By.name("btnK");
	
	public void ClickOnButton()
	{
		driver.findElement(searchButton).click();
	}
}
