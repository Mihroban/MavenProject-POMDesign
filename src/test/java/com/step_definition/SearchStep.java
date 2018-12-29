package com.step_definition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.page_objects.HomePage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class SearchStep {
	public WebDriver driver;
	public static final String url = "https://www.etsy.com/";
	public static final String chromeDriverPath = "/Users/miheliwanaishamuding/Downloads/chromedriver";
	//public HomePage home;
	//public Hooks hook;
	HomePage home = new HomePage(driver);
	
	
	@Given("^the user is on home page$")
	public void the_user_is_on_home_page() throws Throwable {			 
		home.navigateToApp(url, chromeDriverPath);
	}

	@When("^the user enters valid key word in input box$")
	public void the_user_enters_valid_key_word_in_input_box() throws Throwable {
	    home.enter_input("dress");
		//driver.findElement(By.xpath("//input[contains(@id,'search-query')]")).sendKeys("dress");
	}

	@And("^the user clicks on search button$")
	public void the_user_clicks_on_search_button() throws Throwable {
	  home.clickSearchBtn();
	  //driver.findElement(By.xpath("//button[contains(@type,'submit')]")).click();
    }

	@Then("^the expected results should be displayed$")
	public void the_expected_results_should_be_displayed() throws Throwable {
	   //home.isTextPresent("gift");
		Assert.assertEquals("dress", home.getText());
	}
	
	@Then("^close the browser$")
	public void close_the_browser() throws Throwable {
		Thread.sleep(2000);
		home.closeDriver();
	}
	
}
