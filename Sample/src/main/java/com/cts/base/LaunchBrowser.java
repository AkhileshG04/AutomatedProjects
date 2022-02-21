package com.cts.base;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowser {
	
	public static WebDriver driver;
	
	
	public static WebDriver launchBrowser() {
		
		//Scanner s = new Scanner(System.in);
		
		//System.out.println("Enter Browser to Launch :\n1.Chrome\n2.FireFox\n3.Internet Explorer\nEnter Your Choice : ");
		//int choice = s.nextInt();
		
		int choice = 1;				
		switch(choice)
		{
		   case 1 :  //Launch Chrome Browser
			   		System.setProperty("webdriver.chrome.driver", "C:\\Users\\akhil\\eclipse-workspace\\Sample\\src\\main\\resources\\drivers\\chromedriver.exe");
			   		driver = new ChromeDriver();
		   			 break;
		   			 
		   case 2 :  //Launch FireFox Browser
			   		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Akhilesh\\Documents\\Selenium\\HotelsBDD\\src\\test\\resources\\drivers\\geckodriver.exe");
			   		driver = new FirefoxDriver();
		   			 break;
		   			 
		   default : //Launch IE Browser 
			   		System.setProperty("webdriver.ie.driver", "C:\\Users\\Akhilesh\\Documents\\Selenium\\HotelsBDD\\src\\test\\resources\\drivers\\IEDriverServer.exe");
			   		driver = new FirefoxDriver();
		}
		//s.close();
	
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com");
		return driver;
		
	}

}
