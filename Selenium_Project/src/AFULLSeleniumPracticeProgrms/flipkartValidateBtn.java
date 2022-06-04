package AFULLSeleniumPracticeProgrms;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkartValidateBtn {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rashmi\\Desktop\\seleniumfolder\\chromedriver_win32\\chromedriver.exe");
      WebDriver driver=new ChromeDriver();
      driver.get("https://www.flipkart.com/");
      //WebElement Username
//		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("rashmighurde98@gmail.com");
		Thread.sleep(2000);
		//driver.findElement(By.xpath("(//input[@type='text'])[2]")).clear();
//		WebElement password=driver.findElement(By.xpath("//input[@type='password']"));
//		password.sendKeys("Mpsc@567");
//		 WebElement login=driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
//		  login.click();
//
//		  try
//		  {
//		  WebElement loginbtnHomePage=driver.findElement(By.xpath("//a[text()='Login']"));
//		  }
//		  catch(Exception e)
//		  {
//			  System.out.println("user logged in successfully");
//		  }
//		  
//		WebElement CreateAnAccount=driver.findElement(By.xpath("//a[text()='New to Flipkart? Create an account']"));
//		  
//		
		WebElement LoginPageText=driver.findElement(By.xpath("//span[contains(text(),'Wishlist')]"));
		  System.out.println(LoginPageText.getText());

		  
		  WebElement Loginpopup=driver.findElement(By.xpath("//div[@class='_2QfC02']"));
		  System.out.println(Loginpopup.getText());
				driver.close();

	}

}
