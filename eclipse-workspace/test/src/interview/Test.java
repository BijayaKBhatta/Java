package interview;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;


public class Test 
{
public String solution(String S) {
	
	String result   = S.chars().mapToObj(c -> Character.toString((char) c))
	        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
	        .entrySet()
	        .stream()
	        .filter(entry->entry.getValue()==2)
	        .findFirst()
	        .get().getKey();
	return result;
	
	}
public String invert(String s) {
	if(s== null ) {
		return "";
	}else if(s.equals("") || s.length() == 1) {
		return s;
	}else {
		StringBuilder str = new StringBuilder();
		 
        str.append(s);
        str.reverse();
        return str.toString();
	}
}
public void testStringObj(String s) {
	System.out.println("aaa"+s);
}
public void testStringObj(Object s) {
	System.out.println(s);

	
}
public static void main(String[] args) {
	Test test = new Test();
	//test.testStringObj("bbb");
		String word = "abc";
		//Map<String, Long> charCounta 
			
		//System.out.println();
		//String s = "The quick brown fox jumped over the lazy dog.";
        //s.chars()
        //.mapToObj(i -> (char) i)
        //.collect(Collectors.groupingBy(Object::toString, Collectors.counting()));
	}
	/*
	  1) void first()
	 
	2) synchronised void second()
	3) static void third()
	4) static synchronised forth();
	
	
	t1,t2,t3, t4
	s1,s2,s3, s1
	
	which tread will be able to access which methood ?
	1) void first() -- any thread can access at anytime since no synchrinisation		
	2) synchronised void second() - t1 & t2 & t3 can access parallely since they are accessing 
	different object that is s1,s2,s3; but t1 & t4 cant , so t4 will wait untill
	t1 completed work on s1;
	3) static void third() 
	since no synchronisation so any one can access 
	4) static synchronised forth(); - since one copy is created and its class level
	so its called class level lock hence only one thread can acceess 
	that is if thread t1 is accessing then t2,t3 ... will not be able to acess 
	/*
	 * ..
	 */
}
