package com.Tests;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import com.PageObjects.CREATE_AN_ACCOUNT_Objects;
import com.PageObjects.ContactUsPObjects;
import com.PageObjects.SignInPageObjects;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MainPage {
	
	WebDriver driver;
	
	
	@BeforeTest
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.navigate().to("http://automationpractice.com/index.php?controller=authentication&back=my-account#account-creation");
		String title = driver.getTitle();
		System.out.println("Your title " + title);
		
		
		
	}
	
	@Test
	public void clcikOnSignIn() {
		SignInPageObjects click = new SignInPageObjects(driver);
		click.signIn.click();
		
		
	}
	@Ignore
	@Test 
	public void CreateAccount() {
		CREATE_AN_ACCOUNT_Objects login = new CREATE_AN_ACCOUNT_Objects(driver);
		login.email.sendKeys("blin.lolo@inbox.ru");
		login.clcikButton.click();
	}
	
	@Test
	public void contactUs() {
		ContactUsPObjects cocntactUs = new ContactUsPObjects(driver);
		cocntactUs.contactUs.click();
	}
	
	@AfterTest
	public void tearDown() {
		driver.close();
		driver.quit();
	}
}
