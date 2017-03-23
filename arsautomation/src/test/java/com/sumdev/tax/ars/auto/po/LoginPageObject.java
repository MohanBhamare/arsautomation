package com.sumdev.tax.ars.auto.po;

public class LoginPageObject {

	

	public DashboardPageObject login(String userID, String password){
				
		System.out.println("LoginPageObject|login|");
		System.out.println("LoginPageObject|login|userID|"+ userID);
		System.out.println("LoginPageObject|login|password|"+ password);
		DashboardPageObject dashpo = new DashboardPageObject();
		System.out.println("LoginPageObject|login|dashpo|"+ dashpo);	
		return dashpo; //DashboardPageObject;
		
		
	}
	
	
}