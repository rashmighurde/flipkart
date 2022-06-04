package pomClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilityClasses.ExplicitWait;
public class LoginPage extends ExplicitWait{
    WebDriver driver;
    @FindBy(xpath="(//input[@type='text'])[2]")
	private WebElement email; 
	
    @FindBy(xpath="//input[@type='password']")
	private WebElement password; 
	
    @FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement loginbtn; 
    
   
    
//	private By email=By.xpath("(//input[@type='text'])[2]");
//	private By password=By.xpath("//input[@type='password']");
//	private By loginbtn=By.xpath("(//button[@type='submit'])[2]");

	
	public LoginPage(WebDriver driver)
	{ PageFactory.initElements(driver, this);
		this.driver=driver;}
	
	
public void enteremail()
	{
		email.sendKeys("rashmighurde98@gmail.com");
	}
	
public void enterpassword()
	{
		password.sendKeys("Mpsc@567");
	}
	
public void clickloginbtn()
	{
		loginbtn.click();
	}

}
