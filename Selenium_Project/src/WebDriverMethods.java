import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rashmi\\Desktop\\seleniumfolder\\chromedriver_win32\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
//System.setProperty("webdriver.edge.driver", "C:\\Users\\Rashmi\\Desktop\\seleniumfolder\\msedgedriver.exe");
//WebDriver driver=new EdgeDriver();
//for firefox== System.setProperty("webdriver.gecko.driver", path);
	driver.get("https://www.google.com/");
	Thread.sleep(2000);
	driver.navigate().to("https://www.amazon.in/");
	
	System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getTitle());
	Thread.sleep(2000);
	
    driver.navigate().refresh();
	Thread.sleep(2000);
	
    driver.navigate().back();
	Thread.sleep(2000);
	
    driver.navigate().forward();
    Thread.sleep(2000);
    
    driver.manage().window().maximize();
    Thread.sleep(2000);
    
    driver.navigate().to("https://www.myntra.com/");
	Thread.sleep(2000);
	
    driver.manage().window().minimize();
	Thread.sleep(2000);
	
	driver.manage().window().setSize(new Dimension(2000,2000));//OR Create Dimension Object first Dimension D=new Dimension(2000,2000);
	                                               //then use inside syso --->   System.out.println(driver.manage().window().setSize(D);
	Thread.sleep(2000);
	
 Point p=new Point(100,100);
	driver.manage().window().setPosition(p);
	Thread.sleep(2000);
	
      System.out.println(driver.manage().window().getSize());
  driver.quit();
}

}
