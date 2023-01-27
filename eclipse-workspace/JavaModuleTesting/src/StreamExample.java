import java.util.ArrayList;
import java.util.stream.Collectors;

public class StreamExample {
	public static void main(String[] args) {
		ArrayList<Integer> alist = new ArrayList<>();
		alist.add(20);
		alist.add(30);
		alist.add(40);
		alist.add(50);
		alist.add(5);
		alist.add(15);
		ArrayList<Integer> evenList = (ArrayList<Integer>) alist.stream().filter(i->i%2==0).collect(Collectors.toList());
		ArrayList<Integer> oddList = (ArrayList<Integer>) alist.stream().filter(i->i%2!=0).collect(Collectors.toList());
		System.out.println(evenList);
		System.out.println(oddList);	
	}

}
