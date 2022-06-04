package baseClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass1 {

	public static WebDriver getDriver(String browser)
	{    WebDriver driver=null;
		if(browser.equals("chrome"))
		{
	System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Rashmi\\\\Desktop\\\\seleniumfolder\\\\chromedriver_win32\\\\chromedriver.exe");
	 driver=new ChromeDriver();
		}
		else if(browser.equals("firefox")) 
		{System.setProperty("webdriver.gecko.driver", "C:\\\\Users\\\\Rashmi\\\\Desktop\\\\seleniumfolder\\\\chromedriver_win32\\\\chromedriver.exe");
		 driver=new FirefoxDriver();
		}
	driver.get("https://www.flipkart.com/");
	return driver;
	}
}
