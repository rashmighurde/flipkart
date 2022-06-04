package utilityClasses;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {

	public void getScreenshot(WebDriver driver) throws IOException
	{
		Date date=new Date();
		 SimpleDateFormat D=new SimpleDateFormat("YYYY-MM-dd---hh-mm-ss");
		 String CurrentDate=D.format(date);
		 
		  File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  File dest=new File("C:\\Users\\Rashmi\\Desktop\\SeleniumScreenshot\\image"+CurrentDate+".jpg");
		  FileHandler.copy(source,dest);
	
	}
}
