package com.invert;

public class Inverter {
	public static String invert(String s) {
		if(s== null ) {
			return "";
		}else if(s.equals("") || s.length() == 1) {
			return s;
		}else {
			StringBuilder str = new StringBuilder();
			 
	        str.append(s);
	        str.reverse();
	        return str.toString();
		}
	}
	

}
