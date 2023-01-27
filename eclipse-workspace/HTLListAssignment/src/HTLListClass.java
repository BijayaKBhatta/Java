import java.util.Iterator;
import java.util.List;

public class HTLListClass implements ListInterface{

	//Add a new method to HTLList “print” that prints all objects contained in the list.

	@Override
	public void printStudentList(List<Student> students) {

		Iterator<Student> itr = students.iterator();
		while(itr.hasNext()) {
			Student oneStudent = itr.next();
			System.out.println(oneStudent);
		}
		
	}

}
