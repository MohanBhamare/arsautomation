package com.sumdev.tax.ars.auto.po;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.LoadableComponent;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.sumdev.tax.ars.auto.util.DriverFactory;

public class DashboardPageObject extends LoadableComponent<DashboardPageObject> {

	String pageTitle="LightAdmin";
	WebDriver driver = null;
    @FindBy(linkText="LegalEntities") WebElement legalEntitiesLink;

	public DashboardPageObject() {
		System.out.println("DashboardPageObject|^DashboardPO|");
		driver = DriverFactory.getDriver();
		PageFactory.initElements(driver, this);
		System.out.println("DashboardPageObject|$DashboardPO|LinkEntityText" + legalEntitiesLink.getText());

	}

	public LegalEntitiesListPageObject navigateToLegalEntityList() {
		System.out.println("DashboardPageObject|navigateToLegalEntityList");
		LegalEntitiesListPageObject lelistpo = new LegalEntitiesListPageObject();
		
		 WebDriverWait wait = new WebDriverWait(driver, 4);
		 wait.until(ExpectedConditions.titleContains(pageTitle));
		
		legalEntitiesLink.click();
		System.out.println("DashboardPageObject|navigateToLegalEntityList|" + lelistpo);

		return lelistpo;

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
		PageFactory.initElements(driver, this);
		System.out.println("DashboardPageObject|load|LinkEntityText" + legalEntitiesLink.getText());
	}
}
