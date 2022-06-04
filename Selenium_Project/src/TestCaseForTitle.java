import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCaseForTitle {
public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rashmi\\Desktop\\seleniumfolder\\chromedriver_win32\\chromedriver.exe");
  WebDriver driver=new ChromeDriver();
  driver.get("https://www.amazon.in/");
  String expectedTitle="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
  String actualTitle=driver.getTitle();
if(expectedTitle.equals(actualTitle))
		{
	System.out.println("test case pass");
		}
else
{
	System.out.println("test case fail");
}
driver.quit();
  
	
	}

}
