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
		try {
			Statement st = conn.createStatement();
			String insertQuery = "insert into legal_entity (entity_number,capital_amount,name,Share_count) values ('EN11023',1023,'N-1023',1023)";
	        st.executeQuery(insertQuery);
	        	    
	        System.out.println("LegalEntityOracleRepositor|Insert|sucessfully");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
				
		
	}

	public void close() {
		// TODO Auto-generated method stub

	}

	
	
	
}
