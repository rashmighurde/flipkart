package AFULLSeleniumPracticeProgrms;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IDLocator {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rashmi\\Desktop\\seleniumfolder\\chromedriver_win32\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://www.browserstack.com/users/sign_in");
         WebElement username=driver.findElement(By.id("user_email_login"));
         WebElement password=driver.findElement(By.id("user_password"));
         WebElement login=driver.findElement(By.name("commit"));
         username.sendKeys("abc@gmail.com");
         password.sendKeys("your_password");
         login.click();
         Thread.sleep(2000);
         driver.quit();
	}

}
