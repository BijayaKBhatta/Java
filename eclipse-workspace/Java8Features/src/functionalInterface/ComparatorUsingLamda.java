package functionalInterface;


//Java program to demonstrate working of Comparator
//interface
import java.io.*;
import java.lang.*;
import java.util.*;
class Product{  
    int id;  
    String name;  
    float price;  
    public Product(int id, String name, float price) {  
        super();  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }  
}  

//Driver class
class ComparatorUsingLamda {
	public static void main(String[] args)
	{
		
		 	List<Product> list=new ArrayList<Product>();  
	        //Adding Products  
	        list.add(new Product(1,"HP Laptop",25000f));  
	        list.add(new Product(3,"Keyboard",300f));  
	        list.add(new Product(2,"Dell Mouse",150f));  
	        for(Product s:list) {
	        	System.out.println(s.name);
	        }
	        // before 
	        System.out.println("Before Sorting");
	        list.forEach((p)->System.out.println(p.name));

	        System.out.println("Sorting on the basis of name...");  
	        Collections.sort(list, (p1,p2)-> {
	        	return p1.name.compareTo(p2.name);
	        });
		
		
	        list.forEach((p)->System.out.println(p.name));
	        
	        
	}
}
