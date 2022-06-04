package testclasses;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import baseclasses.Base_Class;
import pomclasses.Home_Page;
import pomclasses.Login_Page;
import pomclasses.Product_DetailsPage;

public class VerifyUserCanBuyProduct {
	WebDriver driver = null;
	Login_Page lp;
	Home_Page hp;
	 @Parameters("Browser")
	 @BeforeClass
	 public void BeforeClass(String k)
	 {
		driver=Base_Class.getDriver(k); 
	 }
	 
	 @BeforeMethod
	 public void beforeMethod()
	 { lp=new Login_Page(driver);
	   hp=new Home_Page(driver);
	 }
	 
    @Test(priority=0,groups={"group1"})
    public void VerifyUserCanloginOrNot()
    {
        lp.enteremail();
		 lp.enterpassword();
		 lp.clickloginbtn();
		 
		 Assert.assertTrue(hp.isProfileNameVisible());
		 
	  }
	 @DataProvider(name="PassData")
	 public String[] PassProduct()
	 {
		 String a[]= {"realmemobiles", "samsungTVs", "Womensdresses"};
	     return a;
	 }
	 
	 
	 @Test(groups={"group1"}, dataProvider="PassData", priority=1,dependsOnMethods="VerifyUserCanloginOrNot")
	 public void Test(String name)
	 {
		 hp.enterIntosearchbox(name);
		 hp.clicksearchbtn();
		 SoftAssert soft=new SoftAssert();
		 soft.assertTrue(hp.isProductVisible());
		 soft.assertAll();
		 hp.clearSearchField(name);
	 }
	 @AfterMethod
	  public void afterMethod() {
		  
	  }

	  
	  @AfterClass
	  public void afterClass() {
	  }

}
