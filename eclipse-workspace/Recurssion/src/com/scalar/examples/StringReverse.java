package com.scalar.examples;

public class StringReverse {
	public static void main(String[] args) {
		System.out.println(reverse("bij"));
	}
	public static String reverse1(String str, int low, int high) {
	
		if(high < low)
		return "";
		if(high == low) {
			return str.toCharArray()[high]+"";
		}
		
		return str;
		
	}
	
	public static String reverse(String str) {
		if(str.length()==1) {
			return str;
		}
		
		return str.toCharArray()[str.length()-1]+reverse(str.substring(0, str.length()-1));
	
	}

}
