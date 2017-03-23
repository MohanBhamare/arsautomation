package com.sumdev.tax.ars.arsauto.vo;

public class LegalEntity {

	private String entityNumber = null;
	private int capitalAmount = 0;
	private String name = "UNKNOWN";
	private int shareCount = 0;

	public LegalEntity(String tempEntityNumber) {
		System.out.println("LegalEntity|LegalEntity|no argument consturctor|");	
		this.entityNumber = tempEntityNumber;
		
	};
	
	
	public LegalEntity(String tempEntityNumber, String tempName,int tempCapitalAmount, int tempShareCount) {
		System.out.println("LegalEntity|LegalEntity");
		System.out.println("LegalEntity|LegalEntity|tempEntityNumber|"+tempEntityNumber);		
		
		System.out.println("LegalEntity|LegalEntity|tempCapitalAmount|"+tempCapitalAmount);	
		System.out.println("LegalEntity|LegalEntity|tempName|"+tempName);	
		System.out.println("LegalEntity|LegalEntity|tempShareCount|"+tempShareCount);		
		
		this.entityNumber=tempEntityNumber;
		this.name = tempName;
		this.capitalAmount=tempCapitalAmount;
		this.shareCount = tempShareCount;
			
		
	}
	
	public void setEntityName(String tmpEntityName){
		this.name = tmpEntityName.toUpperCase();
	
		
	}
	
	public String getEntityNumber(){
		
		return this.entityNumber;
		
	}
	
	public String getName(){
		return this.name;
		
	}
	
	public int getCapitalAmount(){
		return this.capitalAmount;
		
	}
	public int getShareCount(){
		return this.shareCount;
		
	}

}
