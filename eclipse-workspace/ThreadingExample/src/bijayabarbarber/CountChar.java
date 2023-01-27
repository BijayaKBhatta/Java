package bijayabarbarber;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class CountChar {

	public static void main(String[] args) {
		String s = "Bijaya Bhattab";
		HashMap<Character, Integer> charCount = new HashMap();
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			charCount.put(c, charCount.getOrDefault(c, 0)+1);
		}
		
		for(Map.Entry<Character, Integer> e:charCount.entrySet()) {
			System.out.println("key="+e.getKey()+"::"+e.getValue());
		}
	}
}
