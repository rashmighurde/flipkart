package AFULLSeleniumPracticeProgrms;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rashmi\\Desktop\\seleniumfolder\\chromedriver_win32\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://demoqa.com/nestedframes");
		  driver.manage().window().maximize();
		  List<WebElement>elements=driver.findElements(By.xpath("//iframe"));
			  int count=elements.size();
			  System.out.println("total iframes on site"+count);
				
			  //move to parent frame

			driver.switchTo().frame("frame1");
			
			  WebElement element1=driver.findElement(By.xpath("//body[text()='Parent frame']"));
			  System.out.println(element1.getText());

			  //child frame
			  driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@srcdoc,'Child Iframe')]")));
			  WebElement element2=driver.findElement(By.xpath("//p[text()='Child Iframe']"));
			  System.out.println(element2.getText());
			  
//			  //again move back to parent frame
//			  driver.switchTo().parentFrame();
//			  System.out.println(element1.getText());
//			  
//			  //parent to main frame
//			  driver.switchTo().parentFrame();
//			  WebElement element3=driver.findElement(By.xpath("//div[contains(text(),'Sample Nested')]"));
//			  System.out.println(element3.getText());	
//			  
//			  
			  driver.switchTo().defaultContent();
			  WebElement element3=driver.findElement(By.xpath("//div[@class='row']"));
		  System.out.println(element3.getText());	
//			  
		  refreshPage(driver);
			  }
	public static void refreshPage(WebDriver driver)
	{
		driver.navigate().refresh();
		driver.switchTo().frame("frame1");
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@srcdoc,'Child Iframe')]")));
		System.out.println(driver.findElement(By.xpath("//p[text()='Child Iframe']")).getText());
		
	}

}
