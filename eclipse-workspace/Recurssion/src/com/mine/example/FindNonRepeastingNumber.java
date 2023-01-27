package com.mine.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class FindNonRepeastingNumber {
	public static void main(String[] args) {
		int aa[] = {20,30,50,10,20,30,20};
		Set<Integer> set = new HashSet();
		List<Integer> list = new ArrayList();
		Map<Integer, Integer> myMap = new HashMap<Integer, Integer>();
		System.out.println(findUnique(aa,0,list,myMap));
	}
	private static List<Integer>  findUnique(int[] arr,int idx, List<Integer> list, Map<Integer, Integer> myMap) {
		// TODO Auto-generated method stub
		if(idx==arr.length-1) {
			myMap.put(arr[idx], myMap.getOrDefault(arr[idx],0)+1);
			return null;
		}
		myMap.put(arr[idx], myMap.getOrDefault(arr[idx],0)+1);
		findUnique(arr,idx+1,list,myMap);
		if(myMap.get(arr[idx])>1) {
			list.add(arr[idx]);
		}
		return list;
	}

}
