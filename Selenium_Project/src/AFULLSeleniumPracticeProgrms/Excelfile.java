package AFULLSeleniumPracticeProgrms;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.FileInputStream;
		import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
		import java.time.Duration;

		import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
		import org.openqa.selenium.By;
		import org.openqa.selenium.Keys;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.openqa.selenium.support.ui.ExpectedConditions;
		import org.openqa.selenium.support.ui.WebDriverWait;
		public class Excelfile {
public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
				System.setProperty("webdriver.chrome.driver","C:\\Users\\Rashmi\\Desktop\\seleniumfolder\\chromedriver_win32\\chromedriver.exe");
				  WebDriver driver=new ChromeDriver();
				driver.get("https://www.flipkart.com/");
				login(driver);
				
				WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
				
			FileInputStream file=new FileInputStream("C:\\Users\\Rashmi\\OneDrive\\Documents\\practice.xlsx");
			Workbook wbook =WorkbookFactory.create(file);
			Sheet sheet=wbook.getSheet("sheet1");
                       //In single line--->//Sheet sheet=WorkbookFactory.create(file).getSheet("sheet1");
		    
			String data;
		    for(int i=0;i<4;i++)
		  { try
		    {data=sheet.getRow(i).getCell(0).getStringCellValue();}
		    catch(Exception e)
		    {data=String.valueOf(sheet.getRow(i).getCell(0).getNumericCellValue());
		    }
		    
			
		  
WebElement searchbox=driver.findElement(By.xpath("//input[@name='q']"));
WebElement searchbutton=driver.findElement(By.xpath("//button[@type='submit']"));
			    wait.until(ExpectedConditions.visibilityOf(searchbox));
				searchbox.sendKeys(data);
				wait.until(ExpectedConditions.visibilityOf(searchbutton));
				searchbutton.click();
				Thread.sleep(5000);
		
		WebElement price;
               try{price=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='_30jeq3 _1_WHN1']")));}
				catch(Exception e)
				{price=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='_30jeq3']")));
				}
				System.out.println(price.getText());
				
				
				
				sheet.getRow(i).createCell(1).setCellValue(price.getText());
				for(int c=0;c<data.length();c++)
				{
					searchbox.sendKeys(Keys.BACK_SPACE);
				}
		   }
				
				file.close();
				FileOutputStream file1=new FileOutputStream("C:\\Users\\Rashmi\\OneDrive\\Documents\\practice.xlsx");
				wbook.write(file1);
		
	}
			
			
			
			public static void login(WebDriver driver)
			{
				driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("rashmighurde98@gmail.com");
		    WebElement password=driver.findElement(By.xpath("//input[@type='password']"));
				password.sendKeys("Mpsc@567");
				 WebElement login=driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
			  login.click();

			}

		}

	


