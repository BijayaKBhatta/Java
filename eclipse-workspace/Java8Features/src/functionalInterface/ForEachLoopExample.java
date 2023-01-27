package functionalInterface;

import java.util.ArrayList;
import java.util.List;

public class ForEachLoopExample {
	public static void main(String[] args) {
		
		List<String> list=new ArrayList<String>();  
	    list.add("ankit");  
	    list.add("mayank");  
	    list.add("irfan");  
	    list.add("jai");  
	    // general - without using lamda
	    /*for(String s:list) {
	    	System.out.println(s);
	    }
	    */
	    list.forEach((n)->System.out.println(n));
	
	}

    
}
