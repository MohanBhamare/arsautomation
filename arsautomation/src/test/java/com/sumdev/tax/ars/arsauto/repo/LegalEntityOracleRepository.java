package com.sumdev.tax.ars.arsauto.repo;

import com.sumdev.tax.ars.arsauto.vo.LegalEntity;

public class LegalEntityOracleRepository implements ILegalEntityRepository {

	String DBURL = "JDBC:Oracle:thin:@Localhost:1521/xe";
	String drivername = "Oracle.Jdbc.driver.OracleDriver";
	String username="arsadmin";
	String password="arsadmin";
	connection conn = null;
	
	
	
	
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
