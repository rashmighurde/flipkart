package AFULLSeleniumPracticeProgrms;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class popup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rashmi\\Desktop\\seleniumfolder\\chromedriver_win32\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://demoqa.com/alerts");
		  driver.manage().window().maximize();
		  
		driver.findElement(By.xpath("//button[@id='promtButton']")).click();
		Alert alt=driver.switchTo().alert();
		alt.sendKeys("rashmighurde");
		Thread.sleep(1000);
		alt.dismiss();
		
		
		

	}

}
