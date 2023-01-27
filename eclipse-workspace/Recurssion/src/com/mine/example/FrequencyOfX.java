package com.mine.example;
// complete this program
// write a program to find frequncy of a number in an array 
public class FrequencyOfX {
	public static void main(String[] args) {
		int aa[] = {20,30,50,10,20};
		System.out.println(findFeequncy(aa,20,0,0));
	}

	private static int findFeequncy(int[] aa, int x,int i, int count) {
		// TODO Auto-generated method stub
		if(i==aa.length-1) {
			return count;
		}
		if(aa[i] ==x) {
			count++;
		}
		return findFeequncy(aa,20,i+1,count);
		//return count;
	}
	
	
}
