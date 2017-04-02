package com.sumdev.tax.ars.auto.po;

import com.sumdev.tax.ars.auto.util.DriverFactory;

import bsh.This;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.LoadableComponent;
import org.testng.Assert;


public class LoginPageObject extends LoadableComponent<LoginPageObject>{
	String pageTitle="LightAdmin";
	WebDriver driver = null;
	String pageURL = "http://localhost:9090/admin";
	
	
	@FindBy(name="j_username")
	private WebElement inputTextUserName = null;
	@FindBy(id="req2")
	private WebElement inputPasswordPWD = null;
	@FindBy(id="signIn") 
	private WebElement inputSubmitSignIn = null;
	
	
	public LoginPageObject() {
		System.out.println("LoginPageObject|LoginPageObject|");
		System.out.println("LoginPageObject|LoginPageObject|driver|"+driver);
	    driver = DriverFactory.getDriver();
	    System.out.println("LoginPageObject|LoginPageObject|driver|"+driver);
	       
	    
	}

	public DashboardPageObject login(String userID, String password) {

		System.out.println("LoginPageObject|login|");
		System.out.println("LoginPageObject|login|userID|" + userID);
		
		inputTextUserName.sendKeys("");
		inputTextUserName.sendKeys(userID);
		
		System.out.println("LoginPageObject|login|password|" + password);
		
		inputPasswordPWD.sendKeys("");
		inputPasswordPWD.sendKeys(password);
		inputSubmitSignIn.click();
		
		DashboardPageObject dashpo = new DashboardPageObject();
		System.out.println("LoginPageObject|login|dashpo|" + dashpo);
		//dashpo.navigateToLegalEntityList();
		return dashpo; // DashboardPageObject;
		

	}

	@Override
	protected void isLoaded() throws Error {
		// TODO Auto-generated method stub
		System.out.println("LoginPageObject|isLoaded|");
		Assert.assertTrue(this.driver.getTitle().contains(pageTitle));
		
	}

	@Override
	protected void load() {
		// TODO Auto-generated method stub
		System.out.println("LoginPageObject|load|");
		driver.get(pageURL);
		PageFactory.initElements(driver, this);
	    System.out.println("LoginPageObject|load|$PF.initElements|inputTextUserName|"+inputTextUserName.getAttribute("name"));
	    System.out.println("LoginPageObject|load|$PF.initElements|inputPasswordPWD|"+inputPasswordPWD.getAttribute("id"));
	    System.out.println("LoginPageObject|load|$PF.initElements|inputSubmitSignIn|"+inputSubmitSignIn.getAttribute("id"));
		    
		
		//System.out.println("LoginPageObject|load|");
	}

}