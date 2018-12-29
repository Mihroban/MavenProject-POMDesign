package com.test.utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.page_objects.HomePage;

public class BaseClass {
	
	public static WebDriver driver;
 
	public BaseClass(WebDriver driver){
		this.driver = driver;
		
	}
	
	public WebDriver getDriver(){
		if(driver==null){
			driver = new ChromeDriver();
		}
		return driver;
	}
	
	//In this class, we should be able to navigate to other pages
	//Page object class gives us ability to chain actions via page objects,
	//To go to that specific page, we need to call this method in its own page
	//and get this returned page
	
	public HomePage navigateToApp(String url, String chromeDriverPath){
		System.setProperty("webdriver.chrome.driver",chromeDriverPath);
		driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to(url);
		return new HomePage(driver);
		
	}
	
	public void closeDriver(){
		driver.quit();
	}

}
