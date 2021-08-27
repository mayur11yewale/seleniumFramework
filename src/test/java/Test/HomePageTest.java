package Test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.testng.AssertJUnit;
import baseFile.TestBase;
import config.Log;
import pages.LoginPage;

public class HomePageTest extends TestBase{
	LoginPage login;

	@BeforeClass
	public void set()
	{
		initializeDriver();
		Log.info("Driver is initializing");
		driver.get("https://www.google.com");
		
	}
	
	@Test(priority=1)
	public void openUrl()
	{
		//driver=initializeDriver();	
		login = new LoginPage();
		login.search("mkm");
		
	}
	
	@Test(priority=3)
	public void validateTitle()
	{
		AssertJUnit.assertEquals(login.title(), "Google");
	}
	
	/*@Test(priority=2,dataProvider="data",dataProviderClass=SearchData.class)
	public void multipleSearch(String str)
	{
		login.search(str);
	}*/
	
	@AfterClass
	public void close()
	{
		driver.quit();
	}
}
