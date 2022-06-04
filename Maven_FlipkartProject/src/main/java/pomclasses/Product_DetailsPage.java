package pomclasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilityclasses.Util_Class;

public class Product_DetailsPage extends Util_Class{
@FindBy(xpath="//div[@class=\"_1YokD2 _3Mn1Gg\"]/div")
private WebElement mobileList;
@FindBy(xpath="//button[@class=\"_2KpZ6l _2U9uOA _3v1-ww\"]")
private WebElement addtocart;

WebDriver driver;
public Product_DetailsPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
	this.driver=driver;
}

public void VerifyUserCanClickOnAtleast3Products()
{ 
	List<WebElement>mobileList1=driver.findElements(By.xpath("//div[@class=\"_1YokD2 _3Mn1Gg\"]/div"));
	for(int i=2;i<5;i++)
	{
	mobileList1.get(i).click();
	}
}
public void VerifyProductDisplayedOrNotandAddedToCart()
{
	Set<String> addresses=driver.getWindowHandles();//if we want single product then comment out below 3 lines
	for(String k:addresses)
	{
	System.out.println(k);//need to skip 1st window(i.e. main page address)
	//find code for it
	driver.switchTo().window(k);
	explicitewait(driver,addtocart);
	addtocart.click();

     }
	
//	List<String>addresses1=new ArrayList<String>(addresses);
//	driver.switchTo().window(addresses1.get(1));
//	addtocart.click();
}

}
