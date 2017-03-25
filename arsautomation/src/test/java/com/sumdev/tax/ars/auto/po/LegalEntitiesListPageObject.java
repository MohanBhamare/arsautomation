package com.sumdev.tax.ars.auto.po;

public class LegalEntitiesListPageObject {
	
	public CreateLegalEntityPageObject navigateToCreateNewPage(){
		System.out.println("LegalEntitiesListPageObject|navigateToCreateNewPage|");
		CreateLegalEntityPageObject clepo = new CreateLegalEntityPageObject();
			
		System.out.println("LegalEntitiesListPageObject|navigateToCreateNewPage|CreateLegalEntityPageObject|" +clepo);
		return clepo;
		
	}

}
