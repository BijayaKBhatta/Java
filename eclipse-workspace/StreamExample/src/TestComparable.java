import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class TestComparable {

	public static void main(String[] args) {
		List<Student> alist = new ArrayList<>();
		alist.add(new Student(11,"aaa"));
		alist.add(new Student(20,"aaa"));
		alist.add(new Student(22,"aaa"));
		alist.add(new Student(10,"aaa"));
		Collections.sort(alist);
		for(int i=0;i<alist.size();i++) {
			System.out.println(alist.get(i).rollNo);
		}
		
	}
}
