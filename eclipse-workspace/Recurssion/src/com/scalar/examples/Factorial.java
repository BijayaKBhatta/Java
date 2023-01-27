package com.scalar.examples;

public class Factorial {
	public static void main(String[] args) {
		System.out.println(factorial(4));
	}
	public static int factorial(int n) {
		if(n==0 || n==1)
		{
			return n;
		}
		return n*factorial(n-1);
	}
}
