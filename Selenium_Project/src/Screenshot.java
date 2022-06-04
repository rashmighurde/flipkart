import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Screenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rashmi\\Desktop\\seleniumfolder\\chromedriver_win32\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://courses.letskodeit.com/practice");
//		  WebElement listbox=driver.findElement(By.xpath("//select[@id='carselect']"));
//		  Select s=new Select(listbox);
		  Date date=new Date();
		  SimpleDateFormat D=new SimpleDateFormat("YYYY-MM-dd---hh-mm-ss");
			 String CurrentDate=D.format(date);
			 System.out.println(CurrentDate);
			 
			 
//	 s.selectByIndex(2);
//	 System.out.println(s.getFirstSelectedOption().getText());
//  Thread.sleep(2000);
//		 
//		 List<WebElement> options=s.getOptions();
//		 for(int i=0;i<options.size();i++)
//		 {
//			 System.out.println(options.get(i).getText());
//		 }
//		 scr(driver);
	}
	public static void scr(WebDriver driver) throws IOException
	{
		 Date date=new Date();
		 SimpleDateFormat D=new SimpleDateFormat("YYYY-MM-dd---hh-mm-ss");
		 String CurrentDate=D.format(date);
		 
		  File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  File dest=new File("C:\\Users\\Rashmi\\Desktop\\SeleniumScreenshot\\image"+CurrentDate+".jpg");
		  FileHandler.copy(source,dest);
	}

}
