import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainClass {
	public static void main(String[] args) {
		List<Student> StudentList = new ArrayList<>();
		int numberofStudent = 5;
		Student s = null;
		for(int i=0;i<numberofStudent;i++) {
			s = new Student();
			s.rand();
			StudentList.add(s);
		}
		
		HTLListClass printS = new HTLListClass();
		printS.printStudentList(StudentList);
		
	}

}
