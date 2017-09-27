package factory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import dataProvider.ConfigDataProvider;

public class BrowserFactory 
{
	WebDriver driver;
	
	public WebDriver getBrowseer(String browserName)
	{
		if (browserName.equalsIgnoreCase("firefox"))
		{
			driver = new FirefoxDriver();	
		}
		
		else if (browserName.equalsIgnoreCase("chrome"))
		{
			
			System.setProperty("webdriver.chrome.driver", DataProviderFactory.getConfig().getChromepath());
			driver = new ChromeDriver();	
		}
		
		else if (browserName.equalsIgnoreCase("IE"))
		{
			
			System.setProperty("webdriver.ie.driver", DataProviderFactory.getConfig().getChromepath());
			driver = new InternetExplorerDriver();	
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	
	}
	
	
	public void closeDriver(WebDriver idriver)
	{
		driver.quit();
	} 
	
	
	

}
