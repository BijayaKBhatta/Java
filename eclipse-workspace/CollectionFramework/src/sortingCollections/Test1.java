package sortingCollections;

import java.util.ArrayList;
import java.util.Collections;

public class Test1 {
	public static void main(String[] args) {
		ArrayList<Integer> alist = new ArrayList<Integer>();
		alist.add(10);
		alist.add(20);
		alist.add(5);
		alist.add(11);
		System.out.println(alist);
		Collections.sort(alist);
		System.out.println("Soerted "+alist);
		Collections.reverse(alist);
		System.out.println("Reverse "+alist);
		
		
		ArrayList<Character> list = new ArrayList<Character>();
		list.add('c');
		list.add('b');
		list.add('a');
		list.add('d');
		System.out.println(list);
		Collections.sort(list);
		System.out.println("Soerted "+list);
		Collections.reverse(list);
		System.out.println("Reverse "+list);
		
		char c[] = new char[] {'b','c','a','d'};
		System.out.println(c.toString().charAt(1));
		
	}

}
