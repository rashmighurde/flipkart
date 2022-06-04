import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HierarchyChecking {

	public static void main(String[] args) {

		System.getProperty("webdriver.chrome.driver", "C:\\Users\\Rashmi\\Desktop\\seleniumfolder\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();//upcasting
		((ChromeDriver)driver).get("https://www.amazon.in/"); //Not possible explicit downcasting
		driver.quit();
	}    

}
//WebDriver driverr=new EdgeDriver();//upcasting
//WebDriver driverrr=new FirefoxDriver();
//SearchContext driver1=new ChromeDriver();
//driver1.findElement(null);
//RemoteWebDriver driver2=new ChromeDriver();

