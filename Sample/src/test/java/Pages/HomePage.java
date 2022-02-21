package Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class HomePage {
	
	WebDriver driver;
		
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By signin = By.xpath("//*[@id=\"gb\"]/div/div[2]/a"); 
	By UnameField = By.xpath("//*[@id=\"identifierId\"]");
		
	
	
	public void ClickSignin()
	{
		WebElement element = driver.findElement(signin);
				
		WebDriverWait wait =new WebDriverWait(driver,30);
		
		wait.until(ExpectedConditions.elementToBeClickable(element));		

		System.out.println(element.getText());
		
		
		element.click();
		
		//driver.manage().timeouts().im
	}
	
	public void provideuname(String uname)
	{
		WebElement element = driver.findElement(UnameField);
		
		WebDriverWait wait =new WebDriverWait(driver,30);
		
		wait.until(ExpectedConditions.elementToBeClickable(element));
				
		element.sendKeys(uname);
		
		//driver.manage().timeouts().im
	}
	

	
		
	}

	
