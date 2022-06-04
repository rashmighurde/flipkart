import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AuthenticationPopup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rashmi\\Desktop\\seleniumfolder\\chromedriver_win32\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//div[@id='signin-block']")).click();
//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//li[@id='signInLink']")).click();
WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
          wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(driver.findElement(By.xpath("//iframe[@class='modalIframe']"))));
          WebElement textonframe=driver.findElement(By.xpath("(//div[contains(text(),'Sign in to avail')])[1]"));
          System.out.println(textonframe.getText());
          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
          driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'gsi_')]")));
         // driver.switchTo().frame(driver.findElement(driver.findElement(By.xpath("//iframe[@class='modalIframe']")));
          // driver.switchTo().frame(driver.findElement(By.xpath("driver.findElement(By.xpath(//iframe[contains(@id,'gsi_')]")));

          WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@aria-labelledby='button-label']")));
          element.click();	}

}
