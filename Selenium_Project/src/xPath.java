import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xPath {

	public static void main(String[] args) throws InterruptedException {
  System.setProperty("webdriver.chrome.driver","C:\\Users\\Rashmi\\Desktop\\seleniumfolder\\chromedriver_win32\\chromedriver.exe");
  WebDriver driver=new ChromeDriver();
  driver.get("https://www.flipkart.com/");
//1. xpath by attribute
  WebElement emailinput=driver.findElement(By.xpath("((//input[@type='text'])[2])"));
  emailinput.sendKeys("rashmighurde98@gmail.com");
 WebElement password=driver.findElement(By.xpath("//input[@type='password']"));
 password.sendKeys("Mpsc@567");

 WebElement login=driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
  login.click();
// WebElement forgotPassword=driver.findElement(By.xpath("//span[text()='Forgot?']"));
//  forgotPassword.click();
//  WebElement Enter_otp=driver.findElement(By.xpath("(//input[@type='text'])[3]"));
//  Enter_otp.sendKeys("745578");//we cannot validate otp or captcha.
//  WebElement SetPassword=driver.findElement(By.xpath("//input[@type='password']"));
//  SetPassword.sendKeys("house@123");
//  WebElement login=driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
//  login.click();
//  
////  //2.xpath by text function
//WebElement ForNewCustomers=driver.findElement(By.xpath("//a[text()='New to Flipkart? Create an account']"));
//ForNewCustomers.click();
//  Thread.sleep(3000);
//  
//  //3.xpath by contains
//  WebElement createAnAccount=driver.findElement(By.xpath("//a[contains(text(),'create an account')]"));
//  createAnAccount.click();
  Thread.sleep(5000);
  driver.quit();


	}

}
