package com.proxy.example;

public class ProxyPatternClient {
	
	public static void main(String[] args) 
	{
		OfficeInternetAccess access = new ProxyInternetAccess("Ashwani Rajput");
		
		access.grantInternetAccess(); // validate and grant if correct user  
	}


}
