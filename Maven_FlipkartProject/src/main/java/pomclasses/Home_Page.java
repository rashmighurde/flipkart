package pomclasses;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilityclasses.Util_Class;
public class Home_Page extends Util_Class{
	WebDriver driver;
	@FindBy(xpath="//input[@name='q']")
	private WebElement searchbox;
    
    @FindBy(xpath="//button[@type='submit']")
	private WebElement searchbtn;
    
    @FindBy(xpath="//div[text()='Rashmi']")
	private WebElement profileName;
    
    @FindBy(xpath="//div[text()='Rashmi']")
	private WebElement cartBtn;
    
    @FindBy(xpath="(//a[@class=\"_1fQZEK\"])[1]")
    private WebElement realmefirstproduct;
   
    public Home_Page(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    	this.driver=driver;
    }
    
    public void enterIntosearchbox(String search)
    {
    	searchbox.sendKeys(search);
    }
    public void clicksearchbtn()
    {
    	searchbtn.click();
    }
    public boolean isProfileNameVisible()
    {   
    	try
    	{
    	explicitewait(driver,profileName);
    	return true;}
    	catch(Exception e)
    	{
    		return false;
    	}
    			
    }
    public boolean isProductVisible()
    {     try
       {
    	explicitewait(driver,realmefirstproduct);
    	return true; }
     catch(Exception e)
    {
    	 return false;
    }
    }

	public void clearSearchField(String searchData) {
		// TODO Auto-generated method stub
		for(int i=0;i<searchData.length();i++)
		{
			searchbox.sendKeys(Keys.BACK_SPACE);
		}
		}

}
