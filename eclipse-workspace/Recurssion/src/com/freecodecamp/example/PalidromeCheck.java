package com.freecodecamp.example;

import java.util.ArrayList;
import java.util.Collections;

public class PalidromeCheck {
	public static void main(String[] args) {
		//System.out.println(isPalindrome("madams",0,5));
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(5);
		list.add(10);
		list.add(5);
		Collections.sort(list);
		System.out.println(list);
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
