package com.scalar.examples;

public class PrintFromNtoOne {
	public static void main(String[] args) {
		printNtoOne(10);
	}
	public static void printNtoOne(int n) {
		if(n>=1) {
			System.out.println(n);
			printNtoOne(n-1);

		}
		
		/*second way 
		 * 
		 * System.out.println(n);
		if(n==1) return;
		printNtoOne(n-1);*/
	}

}
