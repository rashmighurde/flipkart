package testClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import baseClasses.BaseClass1;
import pomClasses.CartPage;
import pomClasses.HomePage;
import pomClasses.LoginPage;
public class PurchaseProduct
{
	 private static WebDriver driver;
public static void main(String args[])
		{
	WebDriver driver=BaseClass1.getDriver("chrome");
	
		LoginPage p=new LoginPage(driver);
		p.enteremail();
		p.enterpassword();
		p.clickloginbtn();
		
		//login verification karenge abhi
		
		HomePage h=new HomePage(driver);
		
		if(h.isProfileNameVisible())
		{ System.out.println("logged in");
		h.enterIntosearchbox();
		h.clicksearchbutton();
     	}
		else
		{
			System.out.println("not logged in");
		}
//		CartPage c=new CartPage(driver);
//		c.checkLoginbtnAvailable();
		
			
		}
} 