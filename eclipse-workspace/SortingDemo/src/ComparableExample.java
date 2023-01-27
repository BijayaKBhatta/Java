import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ComparableExample {

	public static void main(String[] args) {
		ArrayList<Student>  studentList = new ArrayList<>();
		studentList.add(new Student(1, "xyz", 20));
		studentList.add(new Student(5, "xyzaa", 30));
		studentList.add(new Student(2, "xyzcc", 12));
		studentList.add(new Student(3, "xyssz", 5));
		studentList.add(new Student(7, "xyzss", 15));
		System.out.println("before sorting of students");
		for(Student student: studentList) {
			System.out.println(student.getRollNo()+"::"+student.getName()+"::"+student.getAge());
		}
		Collections.sort(studentList);  // sorting 
		System.out.println("------after sorting of students");
		for(Student student: studentList) {
			System.out.println(student.getRollNo()+"::"+student.getName()+"::"+student.getAge());
		}
		
	}
}

class Student implements Comparable<Student>{
	@Override
	public int compareTo(Student student) {
		if(this.age==student.age) 
			return 0;
		else if(this.age>student.age)
			return 1;
		else 
			return -1;
	}
	int rollNo; // sort
	String name; // sort 
	int age; // I have done 
	Student(int rollNo, String name, int age){
		this.rollNo=rollNo;
		this.name=name;
		this.age=age;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	

	



}
