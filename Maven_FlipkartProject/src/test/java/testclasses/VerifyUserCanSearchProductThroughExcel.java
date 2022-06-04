package testclasses;

import org.testng.annotations.Test;

import baseclasses.Base_Class;
import pomclasses.Home_Page;
import pomclasses.Login_Page;
import pomclasses.Product_DetailsPage;
import utilityclasses.Util_Class;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import utilityclasses.Util_Class;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class VerifyUserCanSearchProductThroughExcel {
	WebDriver driver;
	Home_Page hp;
	Login_Page lp;
	Product_DetailsPage pd;

	@Parameters("Browser")
	@BeforeClass
	public void browserMethod(String k)
	{
		driver=Base_Class.getDriver(k);
	}
	@BeforeMethod
	  public void beforeMethod() {
		hp=new Home_Page(driver);
		lp=new Login_Page(driver);
		pd=new Product_DetailsPage(driver);

	  }
  @Test(priority=0)
  public void VerifyUserCanLogin()
  {
	  lp.enteremail();
	  lp.enterpassword();
	  lp.clickloginbtn();
	  Assert.assertTrue(hp.isProfileNameVisible());
  }
	@Test(priority=1, dependsOnMethods="VerifyUserCanLogin")
  public void VerifyUserCanSearchProduct() throws EncryptedDocumentException, IOException {
	  String data=Util_Class.FetchDataFromExcel("sheet1",0,0);
	  hp.enterIntosearchbox(data);
	  hp.clicksearchbtn();
	  hp.isProductVisible();
	}

	@Test(priority=3)
	public void VerifyUserCanAddtocartProduct()
	{
		pd.VerifyUserCanClickOnAtleast3Products();
		pd.VerifyProductDisplayedOrNotandAddedToCart();

	}
  @AfterMethod
  public void afterMethod() {
  }

  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

}
