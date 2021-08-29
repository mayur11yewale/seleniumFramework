package Test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import baseFile.TestBase;
import config.Log;
import pages.HomePage;

public class GetQueryTest extends TestBase{

	HomePage home;
	
	@BeforeClass
	public void setup()
	{
		initializeDriver();
		//Log.info("Driver is initializing");
		driver.get("https://www.google.com");
		home=new HomePage();
	}
	
	@Test
	public void ClickOnButton()
	{
		//Log.info("Clicking");
		home.ClickOnButton();
	}
	
	@AfterClass
	public void close()
	{
		//Log.info("Driver is close");
		driver.quit();
	}
}
