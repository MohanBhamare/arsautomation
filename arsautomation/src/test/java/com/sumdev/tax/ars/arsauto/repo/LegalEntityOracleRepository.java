package com.sumdev.tax.ars.arsauto.repo;

import com.sumdev.tax.ars.arsauto.vo.LegalEntity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LegalEntityOracleRepository implements ILegalEntityRepository {

	String DBURL = "JDBC:Oracle:thin:@Localhost:1521/xe";
	String drivername = "oracle.jdbc.driver.OracleDriver";
	String username="arsadmin";
	String password="arsadmin";
	Connection conn = null;
	
	
	//@Override
	public void open(){
		System.out.println("LegalEntityOracleRepositor|openRepository|b4 try");
		try{
			System.out.println("LegalEntityOracleRepositor|openRepository");
			Class.forName(drivername).newInstance();
			//Get a connection
			conn = DriverManager.getConnection(DBURL, username, password);
			System.out.println("LegalEntityOracleRepository|OpenRepositoty|Connection|" + conn);
		} catch (Exception e) {
		  e.printStackTrace();	
		
		}
	}
	
	
	
	
	public void insert(LegalEntity le) {
		// TODO Auto-generated method stub
		System.out.println("LegalEntityOracleRepositor|Insert");
		System.out.println("LegalEntityOracleRepositor|Insert|le|"+le);
		System.out.println("LegalEntityOracleRepositor|Insert|le|entityNumber|"+le.getEntityNumber());
		System.out.println("LegalEntityOracleRepositor|Insert|le|name|"+le.getName());
		System.out.println("LegalEntityOracleRepositor|Insert|le|CapitalAmount|"+le.getCapitalAmount());
		System.out.println("LegalEntityOracleRepositor|Insert|le|ShareCount|"+le.getShareCount());
		
		
		try {
			Statement st = conn.createStatement();
			String insertQuery = "insert into legal_entity (entity_number,capital_amount,name,Share_count ) "
								 + " values ( "
			                     + " '" + le.getEntityNumber()    + "'," 
								 + "  " + le.getCapitalAmount()   + " ," 
			                     + " '" + le.getName() 			  + "',"
								 + "  " + le.getShareCount()      + " )";
	  		     
			System.out.println("LegalEntityOracleRepositor|insert|insertQuery|"+ insertQuery);
			//st.executeQuery(insertQuery);
	        	    
	        System.out.println("LegalEntityOracleRepositor|Insert|sucessfully");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
				
		
	}

	public void close() {
		// TODO Auto-generated method stub

	}




	public LegalEntity findByID(String tmpEntityId) {
		// TODO Auto-generated method stub
		System.out.println("LegalEntityOracleRepositor|");
		System.out.println("LegalEntityOracleRepositor|findByID|");
		System.out.println("LegalEntityOracleRepositor|findByID|tmpEntityID|"+tmpEntityId);
		
		LegalEntity tmpLegalEntity= null;
		
		try {
			Statement st = conn.createStatement();
			String selectQuery = "select entity_number,capital_amount,name,Share_count from legal_entity " 
			+ "where Entity_number='" + tmpEntityId + "'";
			System.out.println("LegalEntityOracleRepositor|findByID|selectQuery|"+selectQuery);
			
			ResultSet rs = st.executeQuery(selectQuery);
			System.out.println("LegalEntityOracleRepositor|findByID|ResultSet|"+rs);
		
			String tmpEntityNumber = "";
			String tmpLegalEntityName = "";
			int tmpCapitalAmount=0 ;
			int tmpShareCount=0;
			
			if (rs.next())
			{
				tmpEntityNumber    = rs.getString("entity_number");
				tmpCapitalAmount   = rs.getInt("capital_amount");
				tmpLegalEntityName = rs.getString("name");
				tmpShareCount      = rs.getInt("Share_count");
			}
			System.out.println("LegalEntityOracleRepositor|findByID|ResultSet|EntityNumber|"
			+tmpEntityNumber+"|Capital Amount|"+tmpCapitalAmount +"|LegalEntityName|"
			+tmpLegalEntityName+"|Share Count|"+tmpShareCount);
					
			
			tmpLegalEntity = new LegalEntity(tmpEntityNumber, tmpLegalEntityName, tmpCapitalAmount, tmpShareCount);
			
			
			rs.close();
			st.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return tmpLegalEntity;
	}

	
	
	
}
