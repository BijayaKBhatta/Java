package arrayexample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class test {
	
	/*public static void main(String []args){  
        try{  
            int a = 1;   
            System.out.println(a/0);  
        }  catch(Exception e) {}
        finally  
        {  
            System.out.println("rest of the code...");  
        }  
     
        System.out.println("rest of the code.......");  

	
	
		
		
	} */
	
	
	//146) What is exception propagation?
	//https://www.javatpoint.com/corejava-interview-questions-2
	/*void m(){  
	    int data=50/0;  
	    System.out.println("in M");
	  }  
	  void n(){  
	    m();  
	    System.out.println("in N");

	  }  
	  void p(){  
	   try{  
	    n();  
	    System.out.println("in P");

	   }catch(Exception e){System.out.println("exception handled");
	   }
	   
	    System.out.println("Handeled in P...so normal flow of P started");

	   
	  }  
	  public static void main(String args[]){  
		  test obj=new test();  
	   obj.p();  
	   System.out.println("normal flow...in main");  
	  }  */
	
	// string immutable example
	//150) What is the meaning of immutable regarding String?

/*	public static void main(String args[]){  
		   String s="Sachin";  
		   s.concat(" Tendulkar");//concat() method appends the string at the end  
		   System.out.println(s);//will print Sachin because strings are immutable objects  
		 }  
		 */
	
	
	//156) What is the output of the following Java program?

	/*
	 * a equals b
Explanation

The operator == also check whether the references of the two string objects are equal or not. 
Although both of the strings contain the same content, their references are not equal because both are created by different ways(Constructor and String literal) therefore, a == b is unequal. 
On the other hand, the equal() method always check for the content. Since their content is equal hence, a equals b is printed.

	 
	public static void main (String args[])  
	  {  
	      String a = new String("Sharma is a good player");  
	      String b = "Sharma is a good player";  
	      if(a == b)  
	      {  
	          System.out.println("a == b");  
	      }  
	      if(a.equals(b))  
	      {  
	          System.out.println("a equals b");  
	      }  
	
	
	
	  }
	  */
	
	
	// Garbage collection 
	//180) What is gc()?

	public void finalize(){System.out.println("object is garbage collected");}  
	 public static void main(String args[]){ 
		 
		 
		 Map<Character,Integer> map = new HashMap<>();
		 map.put('a', 2);
		 System.out.println("map.get(c)"+map.get('a')+"-"+map.get('b'));
		 
		 
		 
		 test s1=new test();  
		 test s2=new test();  
	  s1=null;  
	  s2=null;  
	  String s=null;
	  ArrayList<Integer> a = null;
	  Student st = null;
	  System.gc();  
	 }  
	
	
	
}
class Student {
	
}
