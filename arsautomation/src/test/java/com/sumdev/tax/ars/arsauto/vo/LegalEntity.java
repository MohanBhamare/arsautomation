package com.sumdev.tax.ars.arsauto.vo;

public class LegalEntity {

	private String entityNumber = null;
	private int capitalAmount = 0;
	private String name = null;
	private int shareCount = 0;

	public LegalEntity(String tempEntityNumber) {
		System.out.println("LegalEntity|LegalEntity");
		System.out.println("LegalEntity|LegalEntity|tempEntityNumber|"+tempEntityNumber);		
	
		this.entityNumber=tempEntityNumber;
		
	}
	public void register(double fees){
		
		System.out.println("LegalEntity|register|");
		System.out.println("LegalEntity|register|fees|"+fees);
		System.out.println("LegalEntity|register|this.entityNumber|"+this.entityNumber);
		
	}
	
	

}
