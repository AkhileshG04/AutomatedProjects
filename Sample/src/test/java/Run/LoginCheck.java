package Run;

import org.testng.annotations.Test;

import com.cts.base.LaunchBrowser;
import com.cts.base.Screenshot;
import com.cts.utils.Read_Excel;
import Pages.HomePage;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;

public class LoginCheck {
	WebDriver driver;
	HomePage homepage;
	int i = 1;
	
 @Test (priority=0,dataProvider="tc01")
  public void a(String data) 
 {
	 driver= LaunchBrowser.launchBrowser();
	 homepage = new HomePage(driver);
	 homepage.ClickSignin();
	 System.out.println(data);
	 homepage.provideuname(data);
	 Screenshot.TakeScreenshot(driver);

  }
 
 @Test (priority=1,dataProvider="tc01")
 public void b(String data) 
{
	 driver= LaunchBrowser.launchBrowser();
	 homepage = new HomePage(driver);
	 homepage.ClickSignin();
	 System.out.println(data);
	 homepage.provideuname(data);
	 Screenshot.TakeScreenshot(driver);

 }
 
 @Test (priority=2,dataProvider="tc01")
 public void c(String data) 
{
	 driver= LaunchBrowser.launchBrowser();
	 homepage = new HomePage(driver);
	 homepage.ClickSignin();
	 System.out.println(data);
	 homepage.provideuname(data);
	 Screenshot.TakeScreenshot(driver);

 }
 
 @Test (priority=3,dataProvider="tc01")
 public void d(String data) 
{
	 driver= LaunchBrowser.launchBrowser();
	 homepage = new HomePage(driver);
	 homepage.ClickSignin();
	 System.out.println(data);
	 homepage.provideuname(data);
	 Screenshot.TakeScreenshot(driver);

 }
 
   @BeforeTest
  public void beforeMethod() {
	  
	 
	 
  }

  @AfterTest
  public void afterMethod() {
	  
	  
  }

  @DataProvider(name="tc01")
  public Object  tco1() throws Exception
  {
 	Object[][] data = new Object[1][1];
 	
 	
 	Read_Excel.setExcelFile("C:\\Users\\akhil\\eclipse-workspace\\Sample\\src\\main\\resources\\excel\\testCases.xlsx", "tc01");
 	
 	data[0][0] = Read_Excel.getCellData(i, 0);
 	//data[1][0] = Read_Excel.getCellData(2, 0);
 	//data[2][0] = Read_Excel.getCellData(3, 0);
 	//data[3][0] = Read_Excel.getCellData(4, 0);
  	i++;
 	return data;
 	 
  }
  
}
