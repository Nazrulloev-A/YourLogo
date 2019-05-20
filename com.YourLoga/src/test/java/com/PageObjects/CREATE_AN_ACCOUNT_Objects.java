package com.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CREATE_AN_ACCOUNT_Objects {

	public CREATE_AN_ACCOUNT_Objects(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="email_create")
	public WebElement email;
	
	@FindBy(id="SubmitCreate")
	public WebElement clcikButton;
}
