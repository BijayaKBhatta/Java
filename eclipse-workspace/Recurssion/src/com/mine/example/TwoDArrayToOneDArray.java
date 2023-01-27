package com.mine.example;

public class TwoDArrayToOneDArray {
	//Write a recursive function that takes an array that may contain more arrays in it and returns an array with all values flattened.
/*
 * Suppose this is the input array:
[[1], [2, 3], [4], [3, [2, 4]]]
The output should be:
[1, 2, 3, 4, 3, 2, 4]
 */
	public static void main(String[] args) {
		int aa[][] = {{20,30,50,10},{20,30,50,10}};
		System.out.println(makeOne(aa));
		
	}
	public static int makeOne(int a[][]) {
		
		return 0;
	}
	
	

}
