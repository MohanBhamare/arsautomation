package com.sumdev.tax.ars.arsauto.repo;

import com.sumdev.tax.ars.arsauto.vo.LegalEntity;

public class LegalEnitityArrayRepository implements ILegalEntityRepository {

	private LegalEntity[] legalEntities = null;
	
	
	public void open() {
		// TODO Auto-generated method stub
    System.out.println("LegalEntityArrayRepository|Open|");
    legalEntities = new LegalEntity[5];
	}

	public void insert(LegalEntity le) {
		// TODO Auto-generated method stub
	    System.out.println("LegalEntityArrayRepository|insert|");
	    System.out.println("LegalEntityArrayRepository|insert|le|"+le);
	    
	    legalEntities[0] = le;
	    System.out.println("LegalEntityArrayRepository|insert|legalEntities[0]|"+legalEntities[0]);
	    System.out.println("LegalEntityArrayRepository|insert|legalEntities[0].getName()|"+legalEntities[0].getName());
	}

	public void close() {
		// TODO Auto-generated method stub
	    System.out.println("LegalEntityArrayRepository|close|");
	}

	public LegalEntity findByID(String tmpEntityId) {
		// TODO Auto-generated method stub
		return null;
	}

}
