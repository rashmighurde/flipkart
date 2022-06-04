package baseclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_Class {
	public static WebDriver getDriver(String Browser)
	  {
		WebDriver driver=null;
	      if(Browser.equals("chrome"))
	     {   
		//System.setProperty("webdriver.chrome.driver","src\\main\\resources\\Browsers2\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
	    	  driver=new ChromeDriver();
	      }
	   else if(Browser.equals("firefox"))
	   {    
		//System.setProperty("webdriver.gecko.driver","src\\main\\resources\\Browsers2\\geckodriver.exe");
	   WebDriverManager.firefoxdriver().setup();
		   driver=new FirefoxDriver();
	   }
	   else if(Browser.equals("InternetExplorer"))
	   {
		   WebDriverManager.iedriver().setup();
		   driver=new InternetExplorerDriver();
	   }
	   else if(Browser.equals("MicrosoftEdge"))
	   {
		   WebDriverManager.edgedriver().setup();
		   driver=new EdgeDriver();
	   }
	   driver.get("https://www.flipkart.com/");
	   return driver;
	  }
}
