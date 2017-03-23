package com.sumdev.tax.ars.auto.test;
import com.sumdev.tax.ars.arsauto.vo.LegalEntity;
import com.sumdev.tax.ars.arsauto.repo.ILegalEntityRepository;
import com.sumdev.tax.ars.arsauto.repo.LegalEntityOracleRepository;
import com.sumdev.tax.ars.arsauto.repo.LegalEnitityArrayRepository;


public class RegistrationOffice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         System.out.println("RegistrationOffice|Main|v0.1");
         System.out.println("RegistrationOffice|Main|args|"+args);

         LegalEntity le1 = null;
         le1 = new LegalEntity("EN11026","N-1026",11026,1026) ;  
         System.out.println("RegistrationOffice|Main|le1|"+le1);
        
         LegalEntity le2 = null;
         le2 = new LegalEntity("EN11027","N-1027",11027,1027) ;  
         System.out.println("RegistrationOffice|Main|le2|"+le2);
         
         LegalEntity le3 = null; 
         le3 = new LegalEntity("EN1041");
         le3.setEntityName("name-1041");
         System.out.println("RegistrationOffice|Main|le3|EntityNumber|"+ le3.getEntityNumber());
        System.out.println("RegistrationOffice|Main|le3|Name|"+le3.getName());
         
         LegalEntity le4=null;
         le4 = new LegalEntity("EN1042");
         le4.setEntityName("name-1042");
         System.out.println("RegistrationOffice|Main|le4|EntityNumber|"+ le4.getEntityNumber());
         System.out.println("RegistrationOffice|Main|le4|Name|"+le4.getName());
            
         /*
         ILegalEntityRepository lerepo = new LegalEntityOracleRepository();
         //ILegalEntityRepository lerepo = new LegalEnitityArrayRepository();
         
         lerepo.open();
         
         //lerepo.insert(le1);
         
        // lerepo.insert(le2); 
         String myEntityId = "EN11027";
         LegalEntity foundEntity = lerepo.findByID(myEntityId);
         System.out.println("RegistrationOffice|Main|foundEntity|"+foundEntity);
         System.out.println("RegistrationOffice|Main|foundEntity|Name|"+foundEntity.getName());
         
         
  */
         
	}	

}
