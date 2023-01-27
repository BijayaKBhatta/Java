package reduceExamples;

import java.util.Arrays;
import java.util.List;

public class MapReduce {

	public static void main(String[] args) {
		System.out.println(findSum());
		
	}
	public static int findSum() {
		List<Integer> list = Arrays.asList(10,20,30,40);
		
		//list.stream().mapToInt(i->i).sum();
		return list.stream().mapToInt(i->i).sum();
		 
	}
	public static int findMax() {
		List<Integer> list = Arrays.asList(10,20,30,40);
		
		//list.stream().mapToInt(i->i).sum();
		return list.stream().mapToInt(i->i).max().getAsInt();
		 
	}
}
