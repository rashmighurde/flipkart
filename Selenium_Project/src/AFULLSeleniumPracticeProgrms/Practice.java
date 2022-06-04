package AFULLSeleniumPracticeProgrms;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\Rashmi\\Desktop\\seleniumfolder\\chromedriver_win32\\chromedriver.exe");

/*webdriver is an interface, we cannot create object of an interface. If we write code like this
WebDriver driver = new WebDriver()-->we will get compile time error.*/

ChromeDriver driver=new ChromeDriver();
//In this case our driver object will access  all the methods implemented in chromeDriver class.
//In this case our driver object will access all the methods implemented in chromeDriver class

//FireFoxDriver driver1= new FireFoxDriver();
//in this case our driver object will access all the methods implemented in firefoxdriver class.
// in this case our driver object will access all the methods implemented in firefoxdriver class.

/*WebDriver driver=new ChromeDriver();
WebDriver driver=new FireFoxDriver();
/*Now we can write our script for any browser. this will not impact our script as all of the methods are available
 * to driver instance. Because all of our methods from webDriver interface are implemented in remotewebdriver class.
 * Every browser class is extending remotewebdriver class.
 */



	}

}
