import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCaseForURL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rashmi\\Desktop\\seleniumfolder\\chromedriver_win32\\chromedriver.exe");
 WebDriver driver=new ChromeDriver();
 driver.get("https://www.amazon.in/");
 String expectedCurrentUrl="https://www.amazon.in/";
 String actualCurrentUrl=driver.getCurrentUrl();
 if(expectedCurrentUrl.equals(actualCurrentUrl))
 {
	 System.out.println("test case pass");
 }
 else
 {
	 System.out.println("test case fail");
 }
 driver.close();
	}

}
