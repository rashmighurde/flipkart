package pomClasses;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilityClasses.ExplicitWait;
import utilityClasses.ExplicitWait;
public class HomePage extends ExplicitWait {
	WebDriver driver;    //Private variables
	@FindBy(xpath="//input[@name='q']")
	private WebElement searchbox;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement searchbutton;
	
	@FindBy(xpath="//div[text()='Rashmi']")
	private WebElement profileName;
	
	@FindBy(xpath="//div[@class='YUhWwv']")
	private WebElement cartBtn; 
//	private By searchbox=By.xpath("//input[@name='q']");
//	private By searchbutton=By.xpath("//button[@type='submit']");
//	private By profileName=By.xpath("//div[text()='Rashmi']");

	
	public HomePage(WebDriver driver)//Constructor
	{   PageFactory.initElements(driver, this);
		this.driver=driver;
	}
			
			
  public void enterIntosearchbox()   //public methods
{
	//driver.findElement(searchbox).sendKeys("realme");
	  searchbox.sendKeys("realme");
}
public void clicksearchbutton()
{
	searchbutton.click();
}

     public void clickCartButton()
   {
	cartBtn.click();
   }

public boolean isProfileNameVisible()
{  try {
	WebElement element=explicitewait(driver, profileName);
	return true;
     }
   catch(Exception e)
  {
	   return false;  
  }
}
}

