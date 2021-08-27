package Test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import baseFile.TestBase;
import config.Log;
import pages.HomePage;
import pages.LoginPage;

public class ClickAndSearchTest extends TestBase{

	LoginPage login;
	HomePage home;
	
	@BeforeClass
	public void init()
	{
		initializeDriver();
		Log.info("Driver is initialzed");
		driver.get("https://www.google.com");
		home=new HomePage();
		login = new LoginPage();
	}
	
	@Test(priority=1)
	public void search()
	{
		Log.info("Searching");		
		login.search("quora");
	}
	
	@Test(priority=2)
	public void click()
	{
		Log.info("Clicking");
		home.ClickOnButton();
	}
	
	@AfterClass
	public void close()
	{
		Log.info("Closing browser");
		driver.quit();
	}
	
}
