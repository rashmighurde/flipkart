package AFULLSeleniumPracticeProgrms;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class Practice2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
     System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Rashmi\\\\Desktop\\\\seleniumfolder\\\\chromedriver_win32\\\\chromedriver.exe");
     WebDriver driver;
     driver=new ChromeDriver();
     driver.get("https://www.amazon.in/");
     /*SimpleDateFormat s=new SimpleDateFormat("YYYY-MM-dd-hh-mm-ss");
     Date date=new Date();
     String currentdate=s.format(date);
File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//return type of getScreenshotAs method is file. after taking ss it will be stored in random location
//therefore we need to create object of file class and pass the expected dest path as string argument.
File dest=new File("C:\\Users\\Rashmi\\Desktop\\SeleniumScreenshot\\image"+currentdate+".jpg");
//we need to copy the source file into the destination location
FileHandler.copy(source, dest);*/
     JavascriptExecutor js= (JavascriptExecutor)driver;
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
     js.executeScript("window.scrollBy(0,1000)");
     
     js.executeScript("arguments[0].scrollIntoView(true);",driver.findElement(By.xpath("//a[text()='About Us']")));
     WebElement searchbox=driver.findElement(By.xpath("//input[@type='text']"));
   searchbox.sendKeys("realme mobiles");
   WebElement searchbuttons=driver.findElement(By.xpath("//input[@type='submit']"));
   searchbuttons.click();
   List<WebElement> mobileList=driver.findElements(By.xpath("//div[@class='s-main-slot s-result-list s-search-results sg-row']/div"));
   for(int i=2;i<5;i++)
   {
  	mobileList.get(i).click();
   }
   Set<String> addresses=driver.getWindowHandles();
for(String k:addresses)
{
	System.out.println(k);
	driver.switchTo().window(k);
	driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
}
	}

}
