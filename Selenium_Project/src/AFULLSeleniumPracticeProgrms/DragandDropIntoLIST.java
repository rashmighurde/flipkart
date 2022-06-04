package AFULLSeleniumPracticeProgrms;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class DragandDropIntoLIST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rashmi\\Desktop\\seleniumfolder\\chromedriver_win32\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://www.globalsqa.com/demo-site/draganddrop/#Photo&2eManager");
		  driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']")));

		List<WebElement> dragList=driver.findElements(By.xpath("//ul[@id='gallery']/li"));
			WebElement drop=driver.findElement(By.id("trash"));
			  Actions act=new Actions(driver);

for(WebElement k:dragList)
{    System.out.println(k.getText());
act.dragAndDrop(k, drop).perform();
}	


	}

}
