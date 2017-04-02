package com.sumdev.tax.ars.auto.po;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.LoadableComponent;
import org.testng.Assert;

import com.sumdev.tax.ars.auto.util.DriverFactory;

public class DashboardPageObject extends LoadableComponent<DashboardPageObject> 
{
	
	WebDriver factorydriver = null;
	@FindBy(linkText = "LegalEntities" ) WebElement linkLegalEntity;
		
	public DashboardPageObject() {
		 System.out.println("DashboardPageObject|^DashboardPO|");
		 factorydriver = DriverFactory.getDriver();
		 PageFactory.initElements(factorydriver, this);
		 System.out.println("DashboardPageObject|$DashboardPO|LinkEntityText" + linkLegalEntity.getText());
		 
	
	}
	public LegalEntitiesListPageObject navigateToLegalEntityList(){
		 System.out.println("DashboardPageObject|navigateToLegalEntityList");
		 LegalEntitiesListPageObject lelistpo = new LegalEntitiesListPageObject();
		 linkLegalEntity.click();
		 System.out.println("DashboardPageObject|navigateToLegalEntityList|" +lelistpo);

		 return lelistpo ;
		
	
	}

	@Override
	protected void isLoaded() throws Error {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void load() {
		// TODO Auto-generated method stub
		
	}
}
