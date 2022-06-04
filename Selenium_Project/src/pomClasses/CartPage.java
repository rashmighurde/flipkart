package pomClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
	WebDriver driver;
	@FindBy(xpath="//span[text()='Login']")
  private WebElement loginbtnIncart;
  
  
  
  public CartPage(WebDriver driver)
  {   PageFactory.initElements(driver, this);
	  this.driver=driver;
  }
  
  
  public void checkLoginbtnAvailable()
  {
	  try {	  loginbtnIncart.isDisplayed();
	  System.out.println("no items in cart");}
		  catch(Exception e) {
	         System.out.println("Login btn is not visible");}
	  
  }
}
