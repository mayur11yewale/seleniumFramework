package config;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import baseFile.TestBase;

public class JavaScriptExecutorCommonMethods extends TestBase{
	
	JavascriptExecutor js;
	
	public void setup()
	{
		initializeDriver();
		js = (JavascriptExecutor) driver;
	}
	
	public WebElement getElementById(String id)
	{
		
		Object custId=js.executeScript("return document.getElementById("+id+")");
		return (WebElement)custId;
	}
	
	public void ClickUsingName(String name)
	{
		js.executeScript("document.getElementsByName("+name+")[0].click()");
	}
	
	public void sendValueUsingId(String id,String value)
	{
		js.executeScript("document.getElementById("+id+").value="+value+"");
	}
	
	public void scrollWindow(int x,int y)
	{
		js.executeScript("window.scrollBy("+x+","+y+")");
	}
	
	public void scrollIntoView(String id)
	{
		js.executeScript("document.getElementById("+id+").scrollIntView(true)");
	}
	
	public String getTitle()
	{
		return (String)js.executeScript("return document.title");
	}
	
	public String getPageLoadStatus()
	{
		return (String)js.executeScript("return document.readystate");
	}
	
	public String getDomain()
	{
		return (String)js.executeScript("return document.domain");
	}
	
	public void zoomPage()
	{
		js.executeScript("document.body.style.zomm='90'");
	}
	
	public void highLightElement(String id,String color)
	{
		js.executeScript("document.getElementById("+id+").style.background="+color+"");
	}
		
	public Integer getInnerHeightBrowser()
	{
		return (Integer)js.executeScript("window.innerHeight");
	}
	
	public Integer getInnerWidthtBrowser()
	{
		return (Integer)js.executeScript("window.innerWidth");
	}
	
	public Integer getOuterHeightBrowser()
	{
		return (Integer)js.executeScript("window.outerHeight");
	}
	
	public Integer getOuterWidthtBrowser()
	{
		return (Integer)js.executeScript("window.outerWidth");
	}
	
	public void scrollPages(int page)
	{
		js.executeScript("window.scrollByPages("+page+")");
	}
	
	public void navigateToUrl(String url)
	{
		js.executeScript("window.location="+url+";");
	}
	
	public Integer scrollMaxY()
	{
		return (Integer)js.executeScript("return window.scrollMaxY");
	}
	
	public Integer scrollMaxX()
	{
		return (Integer)js.executeScript("return window.scrollMaxX");
	}
	
	
}
