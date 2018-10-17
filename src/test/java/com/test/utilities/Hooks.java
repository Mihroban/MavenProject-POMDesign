package com.test.utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

//public class Hooks{
//
//	public WebDriver driver;
//	public static final String url = "https://www.etsy.com/";
//	public static final String chromeDriverPath = "/Users/miheliwanaishamuding/Downloads/chromedriver";
//
//
//	public Hooks(WebDriver driver) {
//		this.driver=driver;
//	}
//
//
//	@Before
//    /**
//     * Delete all cookies at the start of each scenario to avoid
//     * shared state between tests
//     */
//    public void launchApp() {
//    	System.out.println("Called openBrowser");
//    	System.setProperty("webdriver.chrome.driver",chromeDriverPath);
//		driver=new ChromeDriver();	
//		driver.manage().deleteAllCookies();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);		
//		driver.get(url);
//		
//    }
//
//     
//    @After
//    public void closerDriver() {
//      
//        driver.quit();
//        
//    }

 //}
