package com.mine.example;

public class ArrayNumSProduct {
	//Write a recursive function that takes a list of numbers as an input and returns the product of all the numbers in the list.

	public static void main(String[] args) {
		int aa[] = {20,30,50,10};
		System.out.println(prodAll(aa,0));
	}
	
	/*
	 * def productOfArray(arr):
    if len(arr) == 0:
        return 0
    if len(arr) == 1:
        return arr[0]
    else:
        return arr[len(arr)-1] * productOfArray(arr[:len(arr)-1])
	 */

	
	// 0 * 1 *.....n
	public static int prodAll(int[] arr,int i) {	
		if(i==arr.length-1) {
			return arr[i];
		}
		return arr[i]*prodAll(arr,i+1);
	}

}
