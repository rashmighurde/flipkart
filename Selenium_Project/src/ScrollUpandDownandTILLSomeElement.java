import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUpandDownandTILLSomeElement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rashmi\\Desktop\\seleniumfolder\\chromedriver_win32\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://www.flipkart.com");
   driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
   JavascriptExecutor js=(JavascriptExecutor)driver;
   js.executeScript("window.scrollBy(0,1000)");
   Thread.sleep(2000);
   js.executeScript("window.scrollBy(0,-500)");
   WebElement button=driver.findElement(By.xpath("//a[text()='Contact Us']"));
   js.executeScript("arguments[0].scrollIntoView(true);",button );
 // js.executeScript("arguments[0].click();",button); 
   button.click();
	}

}
