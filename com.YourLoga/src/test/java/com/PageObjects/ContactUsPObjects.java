package com.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactUsPObjects {
	
	public ContactUsPObjects(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText="Contact us")
	public WebElement contactUs;
}
