import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOperations {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rashmi\\Desktop\\seleniumfolder\\chromedriver_win32\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
//		  driver.get("https://www.flipkart.com/");
//
//        driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
//        Actions act=new Actions(driver);
//      act.moveToElement(driver.findElement(By.xpath("//div[text()='More']"))).perform();
//      act.moveToElement(driver.findElement(By.xpath("//div[text()='24x7 Customer Care']"))).click().build().perform();
      
      driver.get("https://demo.guru99.com/test/simple_context_menu.html");
    driver.manage().window().maximize();

   Actions act=new Actions(driver);
   Thread.sleep(2000);

       act.contextClick(driver.findElement(By.xpath("//span[text()='right click me']"))).perform();
       Thread.sleep(2000);
      act.doubleClick(driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"))).perform();
    
       //span[text()='right click me']
    //button[text()='Double-Click Me To See Alert']
	
	}

}
