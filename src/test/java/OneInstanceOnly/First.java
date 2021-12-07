package OneInstanceOnly;

public class First {

	@BeforeMethod
	public void setup(){
	  WebDriver driver = DriverFactory.getInstance().getDriver();
	  driver.get("http://www.google.com");
	}
	
	@Test
	public void testDriver(){
	  WebDriver driver = DriverFactory.getInstance().getDriver();
	  System.out.println("Windows Title: " + driver.getTitle());
	}
	
	@AfterMethod
	public void tearDown(){
	  DriverFactory.getInstance().removeDriver();
	}
}
