package com.scalar.examples;

public class PrintonetoN {
	public static void main(String[] args) {
		printOnetoN(10);
	}
	public static void printOnetoN(int n) {
		/*if(n>=1) {
			printOnetoN(n-1);
			System.out.println(n);
		}
		*/
		
		if(n==0) return;
		printOnetoN(n-1);
		System.out.println(n);
	
	}
}
