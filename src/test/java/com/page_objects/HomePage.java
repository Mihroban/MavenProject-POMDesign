package com.page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.test.utilities.BaseClass;

public class HomePage extends BaseClass {

	public HomePage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//input[contains(@id,'search-query')]")
	public static WebElement inputBox;

	@FindBy(xpath = "//button[contains(@type,'submit')]")
	public static WebElement searchBtn;

	// public static WebElement resultText;

	@FindBy(xpath = "//h1[@class = 'display-inline text-smaller']")
	public static WebElement resultText;

	// public void openApp(){
	//
	// }

	public void enter_input(String text) {
		inputBox.sendKeys(text);
	}

	/** Click element function **/
	public void clickSearchBtn() {
		searchBtn.click();
	}

	/**
	 * @author miheliwanaishamuding
	 *
	 * @return innerText
	 * 
	 * this is the function which get element text
	 */
	public String getText() {
		return resultText.getText();
	}

	// public void isTextPresent(String txt){
	// if(driver.getPageSource().equals(resultText))
	// {
	// System.out.println("Text is Present");
	// }
	// else
	// {
	// System.out.println("Text is not Present");
	// }
	// }

	// if(resultText != null)
	// {
	// System.out.println("Text is Present");
	// }
	// else
	// {
	// System.out.println("Text is not Present");
	// }

}
