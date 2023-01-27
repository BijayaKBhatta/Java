import java.util.ArrayList;
import java.util.stream.Collectors;

public class ArrayListStreamExample {

	public static void main(String[] args) {
		ArrayList<Integer> alist = new ArrayList<>();
		alist.add(10); 
		alist.add(5);
		alist.add(35);
		alist.add(20);
		alist.add(15);
		alist.add(30);
		
		ArrayList<Integer> evenList = (ArrayList<Integer>) alist.stream().filter(i->i%2==0).collect(Collectors.toList());
		//alist.stream() - stream for arrayList 
		//alist.stream().filter(i->i%2==0) -- created a filter of even numbers 
		//alist.stream().filter(i->i%2==0).collect(); - collecting the stream of even numbers 
		// alist.stream().filter(i->i%2==0).collect(Collectors.toList()); - putting into the List 
		
		System.out.println("Even number Stream is:-> "+evenList);
		
		
		ArrayList<Integer> oddList = (ArrayList<Integer>) alist.stream().filter(i->i%2!=0).collect(Collectors.toList());
		
		System.out.println("Odd number Stream is:-> "+oddList);
		
		
		
		
	}
}
