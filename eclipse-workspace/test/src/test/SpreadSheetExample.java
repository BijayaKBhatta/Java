package test;

import java.util.HashMap;
import java.util.Map;

public class SpreadSheetExample {

	public static void main(String[] args) {
		Map<Integer, Character> map = new HashMap<>();
		// map
		for(int i=1;i<26;i++) {
			map.put(i,(char) ('a'+i-1));
		}
		int number = 1003;
		
		int c; //= number/26; // bucket number  - 0-26 - 1(27-52),2, 3, 4 ...
		int reminder  = number % 26;// offset
		String output = "";
		while(number>0) {
			c = number/26; // 1
			reminder  = number % 26;
			if(reminder>0)
				output=map.get(reminder)+""+output;// a
			number=number/26;
				
		}
		System.out.println(output);
		
	}
}
