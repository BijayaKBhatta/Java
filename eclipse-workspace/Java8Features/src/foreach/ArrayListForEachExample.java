package foreach;

import java.util.ArrayList;

public class ArrayListForEachExample {
	public static void main(String[] args) {
		ArrayList<Integer> alist = new ArrayList<Integer>();
		alist.add(20);
		alist.add(30);
		alist.add(40);
		alist.add(51);
		alist.forEach(l->System.out.println(l));
		//alist.forEach(l->System.out.println(l+20));
		
		System.out.println("--");
		alist.forEach(l->{if(l%2==0)System.out.println(l);});
		System.out.println("--");
        alist.forEach(System.out::println);  
		
		
	}
}
