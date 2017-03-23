package com.sumdev.tax.ars.auto.ut;
import com.sumdev.tax.ars.auto.po.LoginPageObject;
import com.sumdev.tax.ars.auto.po.DashboardPageObject;

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
		  
		 
		
		
	}

	public void cleanup() {
		 System.out.println("AddLegalEntityUT|cleanup|");
		
	}
	
	public static void main(String[] args) {
		
		 System.out.println("AddLegalEntityUT|Main|");
		 
		 AddLegalEntityUT addle = new AddLegalEntityUT();
		 addle.setup();
		 addle.verifyLEAdditon();
		 addle.cleanup();
		 
		 
	}

}
