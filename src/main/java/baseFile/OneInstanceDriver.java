import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OneInstanceDriver
{

   private OneInstanceDriver()
   {
      //Do-nothing..Do not allow to initialize this class from outside
   }
   private static OneInstanceDriver instance = new OneInstanceDriver();

   public static OneInstanceDriver getInstance()
   {
      return instance;
   }

   ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>() // thread local driver object for webdriver
   {
      @Override
      protected WebDriver initialValue()
      {
         return new FirefoxDriver(); // can be replaced with other browser drivers
      }
   };

   public WebDriver getDriver() // call this method to get the driver object and launch the browser
   {
      return driver.get();
   }

   public void removeDriver() // Quits the driver and closes the browser
   {
      driver.get().quit();
      driver.remove();
   }
}