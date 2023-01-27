package practice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ForEachExample {
	private static final Function Integer = null;
	private static final Function String = null;

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(33);
		list.add(20);
		list.add(5);
		for(int i:list) {
			System.out.println(i);
		}
		System.out.println("FOR EACH");
		list.stream().forEach(i->System.out.println(i));
	
		Map<Integer,String> map = new HashMap<>();
		map.put(11, "111");
		map.put(21, "21111");
		map.put(31, "311");
		map.put(40, "41111");
		
	
		map.forEach((key,value)->System.out.println(key+"::"+value));
		map.entrySet().stream().forEach(t->System.out.println(t.getKey()+"--"+t.getValue()));
	
	
		// filter on list
		System.out.println("Even list");
		list.stream().filter(i->i%2==0).forEach(t->System.out.println(t));
		List<Integer> evenList =  list.stream().filter(i->i%2==0).collect(Collectors.toList());
		// map --> list
		List<Integer> mapKeyList = map.entrySet().stream().map(m->m.getKey()).collect(Collectors.toList());
				

		// filter on map
		System.out.println("Even map");
		//map.entrySet().stream().filter(t->t.getKey()%2==0).forEach(t->System.out.println(t.getKey()+"=="+t.getValue()));;
		
		// // filter on map and store the result in map 
		map.entrySet().stream().filter(m->m.getValue().length()>3).forEach(m->System.out.println(m.getKey()));
		//map.entrySet().stream().filter(m->m.getValue().length()>3).collect(Collectors.toMap(Map.Entry::getKey, ));
		// sort arraylist using stream 
		System.out.println("Sorted list Ascending");
		list.stream().sorted().forEach(t->System.out.println(t));
		System.out.println("Sorted list descending");
		
		list.stream().sorted((a,b)->b.compareTo(a)).forEach(t->System.out.println(t));
		//another way 
		list.stream().sorted(Comparator.reverseOrder()).forEach(t->System.out.println(t));
		
		
	}

}
