package com.sumdev.tax.ars.auto.po;
import com.sumdev.tax.ars.arsauto.vo.LegalEntity;

public class CreateLegalEntityPageObject {
	
	public ConfirmationPageObject addNewLegalEntity(LegalEntity le){
		System.out.println("CreateLegalEntityPageObject|addNewLegalEntity|");
		ConfirmationPageObject confpo = new ConfirmationPageObject();
		System.out.println("CreateLegalEntityPageObject|addNewLegalEntity|confpo|"+confpo);
		return confpo;
		
		
	}

	public void addNewLegalEntity(String string) {
		// TODO Auto-generated method stub
		
	}

}
