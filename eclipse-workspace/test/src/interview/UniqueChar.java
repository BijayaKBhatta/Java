package interview;

import java.util.Set;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;








public class UniqueChar {
	
	public static void main(String[] args) {
		String s = "pineapple";   //   remove rep print only 
		//who occures one time
		Map<Character, Integer> map = new HashMap();
		for(int i=0;i<s.length();i++) { // one by one
			char c = s.charAt(i); /// one char - p
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}else {
				map.put(c, 1);
			}
		}
		
		
		//map
		//[p 3]
		//[i 1] - P
		//[n 1] - P
		//[e 2] - 
		//[a 1] - P
		//[l 1] - P
		map.entrySet().stream().filter(e->e.getValue()==1).forEach(p->System.out.println(p.getKey()));

		/*for(Entry<Character, Integer> e : map.entrySet()) {
			// count  - 1 >1 - count  
			if(e.getValue()==1) {
				System.out.println(e.getKey());
			}
		}*/
	}

}
