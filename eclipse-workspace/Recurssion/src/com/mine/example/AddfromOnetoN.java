package com.mine.example;

public class AddfromOnetoN {
	/*
	 * Write a recursive function that takes a number and returns the sum of all the numbers
	 * from zero to that number.
	 * 
	 * Example - input is 3 then return 1+2+3 = 6
	 * 
	 */
	

	public static void main(String[] args) {
		System.out.println(addOnetoN(3)); // T(n)
	}
	public static int addOnetoN(int n) {	
		if(n==0) return 0; // 1 
		return n+addOnetoN(n-1); // 1+T(n-1) = 2+T(n-1)
	}

}




//T(n-1) = T(n-2)+2