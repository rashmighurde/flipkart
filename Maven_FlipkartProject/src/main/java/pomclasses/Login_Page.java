package pomclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {
	WebDriver driver;

	@FindBy(xpath="(//input[@type='text'])[2]")
	private WebElement email;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement password;
	
	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement loginbtn;

	
	public Login_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
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
