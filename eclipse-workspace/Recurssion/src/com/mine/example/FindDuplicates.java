package com.mine.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//complete this program
//write a program to find duplicates numbers in an array 

public class FindDuplicates {
	public static void main(String[] args) {
		int aa[] = {20,30,50,10,20,30,20};
		Set<Integer> set = new HashSet();
		List<Integer> list = new ArrayList();
		System.out.println(findDuplicates(aa,0,list,set));
	}
	private static Set<Integer> findDuplicates(int[] arr,int idx, List<Integer> list, Set<Integer> set) {
		// TODO Auto-generated method stub
		if(idx==arr.length) {
			return set;
		}
		if(list.contains(arr[idx])) {
			set.add(arr[idx]);
		}else {
			list.add(arr[idx]);
		}
		return findDuplicates(arr,idx+1,list,set);
	}

}
