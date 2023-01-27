import java.util.ArrayList;
import java.util.Collections;

// Alist - 10, 21,20, 5, 15 - sort it 


public class SortingExample {

	public static void main(String[] args) {
		// create an arraylist
		
		ArrayList<String> alist = new ArrayList<>();
		alist.add("Bijaya");
		alist.add("ABijaya");
		alist.add("CBijaya");
		alist.add("DBijaya");
		alist.add("AABijaya");
		alist.add("AAijaya");
		
		
		System.out.println("Before Sorting the elements are ");
		
		for(String element:alist) {
			System.out.print(element+": ");
		}
		
		Collections.sort(alist); // hard - sorting 
		
		System.out.println("\n After sorting the elements are ");
		for(String element: alist) {
			System.out.print(element+" :");
		}
		
		
	}
	
}
