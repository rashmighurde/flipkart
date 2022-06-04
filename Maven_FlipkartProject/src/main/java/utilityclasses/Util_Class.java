package utilityclasses;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Util_Class {
	public static WebElement explicitewait(WebDriver driver, WebElement element)
	{
		WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(5000));
		WebElement element1=wait.until(ExpectedConditions.visibilityOf(element));
		return element1;
	}
	
	public static void ScreenShot(WebDriver driver) throws IOException
	{
		Date date=new Date();
		SimpleDateFormat f=new SimpleDateFormat("YYYY-MM-dd--hh-mm-ss");
		String currentDate=f.format(date);
	File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    File dest=new File("C:\\Users\\Rashmi\\Desktop\\SeleniumScreenshot"+currentDate+".png");
    FileHandler.copy(source, dest);
    }
	
	public static String FetchDataFromExcel(String sheetName,int row, int cell) throws EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream("C:\\Users\\Rashmi\\OneDrive\\Documents\\TestData.xlsx");
	String data=WorkbookFactory.create(file).getSheet(sheetName).getRow(row).getCell(cell).getStringCellValue();
	return data;
	
	
	/*Sheet sheet=WorkbookFactory.create(file).getSheet("sheet1");
		String data;
		for(int i=0;i<4;i++)
		{
			try
			{
		 data=sheet.getRow(i).getCell(0).getStringCellValue();
			}
			catch(Exception e)
			{
		 data=String.valueOf(sheet.getRow(0).getCell(0).getNumericCellValue());
			}
		}*/

		}
	
}
