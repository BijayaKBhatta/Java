package com.freecodecamp.example;

public class PalidomeNumber {
	public static void main(String[] args) {
		System.out.println();
	}
	public static boolean isPalindrome(String s, int beg, int end) {
		if(s.charAt(beg)!=s.charAt(end)) {
			return false;
		}
		if(end <= beg) {
			return true;
		}
		return isPalindrome(s,beg+1,end-1);
	}

}
