package com.proxy.example;

public class RealInternetAccess implements OfficeInternetAccess {
	
	private String employeeName;

	public RealInternetAccess(String empName) {
		this.employeeName = empName;
	}

	@Override
	public void grantInternetAccess() {
		
		// grant interact access logic 
		
		System.out.println(" \n Internet Access granted for employee: "+ employeeName);
	}

}
