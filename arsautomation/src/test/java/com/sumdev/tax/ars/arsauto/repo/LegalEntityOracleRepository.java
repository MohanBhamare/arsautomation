package com.sumdev.tax.ars.arsauto.repo;

import com.sumdev.tax.ars.arsauto.vo.LegalEntity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LegalEntityOracleRepository implements ILegalEntityRepository {

	String DBURL = "JDBC:Oracle:thin:@Localhost:1521/xe";
	String drivername = "Oracle.Jdbc.driver.OracleDriver";
	String username="arsadmin";
	String password="arsadmin";
	Connection conn = null;
	
	
	//@Override
	
	public void openRepository(){
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
	
	public void open() {
		// TODO Auto-generated method stub

	}

	public void insert(LegalEntity le) {
		// TODO Auto-generated method stub

	}

	public void close() {
		// TODO Auto-generated method stub

	}

}
