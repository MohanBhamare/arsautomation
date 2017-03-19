package com.sumdev.tax.ars.arsautomation;
import com.sumdev.tax.ars.arsautomation.vo.LegalEntity;


public class RegistrationOffice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         System.out.println("RegistrationOffice|Main");
         System.out.println("RegistrationOffice|Main|args|"+args);

         LegalEntity le1 = null;
         le1 = new LegalEntity("K34612") ;  
        
         System.out.println("RegistrationOffice|Main|le1|"+le1);
         le1.register(100);
        
         
         LegalEntity le2 = null;
         le2 = new LegalEntity("B94000000432") ;  
         le2.register(200);
         System.out.println("RegistrationOffice|Main|le2|"+le2);
	
         LegalEntity le3 = null;
         le3 = new LegalEntity("L13000157624") ;  
         le3.register(300);
         System.out.println("RegistrationOffice|Main|le3|"+le3);
         
         
         
	}	

}
