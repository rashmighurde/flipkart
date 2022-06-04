import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class childBrowerPopup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rashmi\\Desktop\\seleniumfolder\\chromedriver_win32\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://www.flipkart.com/");
		  //Mainpage address
		  String MainPageAddress=driver.getWindowHandle();
		System.out.println(MainPageAddress);
		System.out.println(driver.getTitle());
		//Login
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("rashmighurde98@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).clear();
    WebElement password=driver.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys("Mpsc@567");
		 WebElement login=driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
	  login.click();

	  //product search
driver.findElement(By.xpath("//input[@name='q']")).sendKeys("realme");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@type=\\'submit\\']")));

	 // driver.findElement(By.xpath("//button[@type=\'submit\']")).click();
	  Thread.sleep(7000);
	//List<WebElement>mobileList=driver.findElement(By.xpath(""));
	
//		driver.get("	https://www.amazon.in/");
//	  //Mainpage address
//	  String MainPageAddress1=driver.getWindowHandle();
//	System.out.println(MainPageAddress1);
//	System.out.println(driver.getTitle());
//	//product search
//WebElement searchbox=driver.findElement(By.xpath("//input[@type='text']"));
//searchbox.sendKeys("realme mobiles");
//WebElement searchbuttons=driver.findElement(By.xpath("//input[@type='submit']"));
//searchbuttons.click();
//Thread.sleep(2000);
//List<WebElement> mobileList=driver.findElements(By.xpath("//div[@class='sg-col-inner']"));
//for(int i=0;i<3;i++)
//{
//	mobileList.get(i).click();
//}
//
//
//
//
	  
	  
	  
	  
	  


	}

}
