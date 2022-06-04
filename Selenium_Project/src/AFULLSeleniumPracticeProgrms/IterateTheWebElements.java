package AFULLSeleniumPracticeProgrms;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IterateTheWebElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rashmi\\Desktop\\seleniumfolder\\chromedriver_win32\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://www.flipkart.com");
     driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();

		 List<WebElement> tabs =driver.findElements(By.xpath("//div[@class='_37M3Pb']"));
		for(WebElement k:tabs)
		{
			System.out.println(k.getText());
		}
//		WebElement q;
//		for(int i=0;i<tabs.size();i++)
//		{
//		q=tabs.get(i);
//		System.out.println(q.getText());
//		}
	}

}
