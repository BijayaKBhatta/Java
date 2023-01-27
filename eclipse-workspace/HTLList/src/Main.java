import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		Student s = new Student();
		s.rand();
		list.add(s);
		
		Student s1 = new Student();
		s1.rand();
		list.add(s1);
		
		
		Student s2 = new Student();
		s2.rand();
		list.add(s2);
		
		HTLList printS = new HTLList();
		printS.print(list);
		
	}

}
