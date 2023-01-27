package sumdigits;

import java.util.Iterator;
import java.util.TreeSet;

class Student {
	int r;

	Student(int r){
		this.r = r;
	}
	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}
	
}
public class test {
	public static void main(String[] args) {
		TreeSet<Integer> t = new TreeSet<Integer>();
		t.add(20);
		t.add(30);
		t.add(20);
		System.out.println(t);
		Iterator<Integer> i = t.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		TreeSet<Student> t1 = new TreeSet();
		Student s = new Student(20);
		
		t1.add(s);
		t1.add(s);
		t1.add(s);
		Iterator<Student> i1 = t1.iterator();
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}
		
		
		
		
	}

}
