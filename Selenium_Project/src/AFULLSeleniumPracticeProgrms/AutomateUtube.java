package AFULLSeleniumPracticeProgrms;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateUtube {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rashmi\\Desktop\\seleniumfolder\\chromedriver_win32\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://www.youtube.com/");
		  WebElement inputsearchbox=driver.findElement(By.xpath("//input[@id='search']"));
		  inputsearchbox.sendKeys("KGF Chapter 2 Movie REVIEW | Deeksha Sharma");
		WebElement search=driver.findElement(By.xpath("//button[@id='search-icon-legacy']"));
		search.click();
//		WebElement video1=driver.findElement(By.xpath("(//div[@id='contents'])[1]/ytd-video-renderer"));
//		video1.click();
//		  
		
	}

}
