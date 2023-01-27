package uncomon;

import java.util.HashMap;

public class Uncommom {
	public static void main(String[] args) {
		String s1= "bijaya";
		String s2= "bhatta";
		System.out.println(findUncommon(s1,s2));
	}

	private static String findUncommon(String s1, String s2) {
		HashMap<Character, Integer> isPresent = new HashMap<>();
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<s1.length();i++) {
			char c = s1.charAt(i);
			if(!isPresent.containsKey(c)) {
				isPresent.put(c, 1);
			}
		}
		for(int i=0;i<s2.length();i++) {
			char c = s2.charAt(i);
			if(!isPresent.containsKey(c)) {
				sb.append(c);
			}
		}
		
		
		return sb.toString();
	}

}
