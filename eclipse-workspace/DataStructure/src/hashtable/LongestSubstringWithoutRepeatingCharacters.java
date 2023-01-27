package hashtable;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="  ";
		LongestSubstringWithoutRepeatingCharacters l = new LongestSubstringWithoutRepeatingCharacters();
		int ll = l.lengthOfLongestSubstring(s);
		System.out.println(ll);
	}
	 int lengthOfLongestSubstring(String s) {
	     int leftPointer=0, rightPointer=0, max=0;
	     HashMap charMap = new HashMap<Character, Integer>();
	     for(int i=0;i<s.length();i++) {
	    	 char c = s.charAt(i);
	    	 rightPointer=i;
	         boolean b1 =  Character.isWhitespace(c);  
	         
	    	 if(charMap.get(c)!=null || b1) {
	    		 leftPointer = (Integer)charMap.get(c);
	    		 if(max<rightPointer-leftPointer)
	    			 max=rightPointer-leftPointer;
	    		 charMap.put(c,i);
	    		 
	    	 }else
	    		 charMap.put(c,i);
	    	 		
	    	 
	    	 
	     }
		 return max;
	    }

}
