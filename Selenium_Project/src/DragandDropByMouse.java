import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDropByMouse extends Screenshot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rashmi\\Desktop\\seleniumfolder\\chromedriver_win32\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://www.globalsqa.com/demo-site/draganddrop/#Photo&2eManager");
		  driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']")));
		  WebElement drag=driver.findElement(By.xpath("(//ul[@id='gallery']//li)[1]"));
		  WebElement drop=driver.findElement(By.xpath("//div[@id='trash']"));
		  Actions act=new Actions(driver);
		  act.dragAndDrop(drag, drop).perform();
		  Screenshot s=new Screenshot();
		  //s.scr(driver);
	}

}
