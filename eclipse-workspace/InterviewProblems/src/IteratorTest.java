import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.concurrent.*;


public class IteratorTest {
	
	
	public static void main(String[] args) {
		List<Integer> alist = new ArrayList<>();
		alist.add(10);
		alist.add(20);
		alist.add(40);
		alist.add(60);
		ConcurrentHashMap<Integer, Integer> map = new ConcurrentHashMap<Integer, Integer>();
		map.put(1, 10);
		map.put(2, 20);
		map.put(3, 30);
		map.put(4, 40);
		
				
		
		Iterator<Integer> itr = alist.iterator();
		while(itr.hasNext()) { // read
			//alist.add(80); // write // concurrent - fail fast 
			System.out.println(itr.next());
		}
		System.out.println("-----");

		for(Entry<Integer, Integer> e: map.entrySet()) {
			map.put(5, 50);
			System.out.println(e.getKey());
			System.out.println(e.getValue());
			
		}
		
		
}

}
