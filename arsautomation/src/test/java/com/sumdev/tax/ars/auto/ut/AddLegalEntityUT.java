package com.sumdev.tax.ars.auto.ut;
import com.sumdev.tax.ars.auto.po.LoginPageObject;
import com.sumdev.tax.ars.auto.po.DashboardPageObject;
import com.sumdev.tax.ars.auto.po.LegalEntitiesListPageObject;
import com.sumdev.tax.ars.auto.po.CreateLegalEntityPageObject;
import com.sumdev.tax.ars.auto.po.ConfirmationPageObject;
import com.sumdev.tax.ars.arsauto.vo.LegalEntity;


public class AddLegalEntityUT {
	
	public void setup() {
		 System.out.println("AddLegalEntityUT|setup|");
		
	}
	
	
	
	public void verifyLEAdditon() {
		 System.out.println("AddLegalEntityUT|verifyLEAdditon|");
		 
		 //Go To Login page : http://localhost:9090/admin)
		 LoginPageObject loginpo = new LoginPageObject();
		 
		 
		 //Provide ARS Login credenitials (Username : admin , Password:admin)
		 //and Click on 'Log Me In' button
		 //System will allow user to login to the system, will show dashboard page.
		  DashboardPageObject utdepo =   loginpo.login("admin", "admin");
		  System.out.println("AddLegalEntityUT|verifyLEAdditon|utdepo|"+utdepo);
		 
		  LegalEntitiesListPageObject lelpo = utdepo.navigateToLegalEntityList();
		  System.out.println("AddLegalEntityUT|verifyLEAdditon|lelpo|"+lelpo);
		  
		  CreateLegalEntityPageObject clepo = lelpo.navigateToCreateNewPage();
		  System.out.println("AddLegalEntityUT|verifyLEAdditon|clepo|"+clepo);
		 
		  String tempEntityNumber = "EN-101051";
	      String tempName = "NAME-101051";
	      int tempCapitalAmount = 10051;
	      int tempShareCount = 51;
	      
	      LegalEntity le1 = new LegalEntity(tempEntityNumber, tempName,tempCapitalAmount,tempShareCount);
	      clepo.addNewLegalEntity(le1);
		
		
		
	}

	public void cleanup() {
		 //System.out.println("AddLegalEntityUT|cleanup|");
		
	}
	
	
	
	public static void main(String[] args) {
		
		 System.out.println("AddLegalEntityUT|Main|");
		 
		 AddLegalEntityUT addle = new AddLegalEntityUT();
		 addle.setup();
		 addle.verifyLEAdditon();
		 addle.cleanup();
		 
		 
	}

}
