package AFULLSeleniumPracticeProgrms;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class webElementMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rashmi\\Desktop\\seleniumfolder\\chromedriver_win32\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://courses.letskodeit.com/practice");
//      WebElement checkbox=driver.findElement(By.xpath("//input[@id='bmwcheck']"));
//System.out.println(checkbox.isSelected());
//checkbox.click();
//System.out.println(checkbox.isSelected());
		  //WebElement radiobt=driver.findElement(By.xpath("//input[@id='bmwradio']"));
//        System.out.println(radiobt.isSelected());
//        System.out.println(radiobt.isEnabled());
//        System.out.println(radiobt.isDisplayed());
//      radiobt.click();
//    System.out.println(radiobt.isSelected());
//    System.out.println(radiobt.getAttribute("name"));
//    WebElement checkboxbtn=driver.findElement(By.xpath("//legend[text()='Checkbox Example']"));
//    System.out.println(checkboxbtn.getText());
// 
		  
	WebElement SelectClassEx=driver.findElement(By.xpath("//select[@id='carselect']"));
	Select s=new Select(SelectClassEx);
	s.selectByIndex(0);
	System.out.println(s.getFirstSelectedOption().getText());
	s.selectByIndex(1);
	System.out.println(s.getFirstSelectedOption().getText());
	s.selectByIndex(2);
	System.out.println(s.getFirstSelectedOption().getText());

	s.selectByValue("honda");
	System.out.println(s.getFirstSelectedOption().getText());

	s.selectByVisibleText("BMW");
	System.out.println(s.getFirstSelectedOption().getText());
		  Thread.sleep(3000);
	}

}
