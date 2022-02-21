package com.cts.base;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot {
	
	  static WebDriver driver;
	
	public Screenshot() {
		this.driver=driver;
	}
	
	public static void TakeScreenshot(WebDriver driver)
	{
	
	TakesScreenshot scrn = ((TakesScreenshot)driver);
    File src = scrn.getScreenshotAs(OutputType.FILE);
    String i="imgFail";
    File dest = new File("C:\\Users\\akhil\\eclipse-workspace\\Sample\\src\\main\\resources\\screenshots\\"+i+System.currentTimeMillis()+".png");
    try {
		FileUtils.copyFile(src, dest);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	driver.close();
	}

}
