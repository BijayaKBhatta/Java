package sortingCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CustomisedSorting {

	public static void main(String[] args) {
		
		// comparable 
		ArrayList<Employe> al=new ArrayList<Employe>();  
		al.add(new Employe(101,"Vijay",23));  
		al.add(new Employe(106,"Ajay",27));  
		al.add(new Employe(105,"Jai",21));  
		  
		Collections.sort(al);  
		System.out.println("SORTING USING COMAPARABLE ");
		for(Employe st:al){  
		System.out.println(st.rollno+" "+st.name+" "+st.age);  
		}  
		
		System.out.println("SORTING USING COMPARATOR ");
		
		
		List<Student> s = new ArrayList<>();
		
		Student s1 = new Student (15,"bccc");
		Student s2 = new Student (14,"cccc");
		Student s3 = new Student (13,"dccc");
		Student s4 = new Student (12,"accc");
		Student s5 = new Student (12,"dccc");
		s.add(s1);
		s.add(s2);
		s.add(s3);
		s.add(s4);
		s.add(s5);
		//Collections.sort(s, new SortStudentUsingName());
		//Collections.sort(s, new SortStudentUsingId()); 
		Collections.sort(s, new SortStudentUsingIdAndName()); 
		
		 for (Student student : s) {
			System.out.println(student.getId()+"::"+student.getName());
		}
		 
		 
		 
		 
		 
		
	}
}

class Student {
	int id;
	String name;
	Student(int id, String name){
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
class SortStudentUsingId implements Comparator<Student>{

	public int compare(Student s1, Student s2) {
		//return -(s1.getName().compareTo(s2.getName()));
		if (s1.getId() > s2.getId())
			return 1;
		if (s1.getId() < s2.getId())
			return -1;
		return 0;
		//return (s1.getName().compareTo(s2.getName()));
	}
}
class SortStudentUsingName implements Comparator<Student>{

	public int compare(Student s1, Student s2) {
		//return -(s1.getName().compareTo(s2.getName()));
		return (s1.getName().compareTo(s2.getName()));
	}
}

class SortStudentUsingIdAndName implements Comparator<Student>{
	public int compare(Student s1, Student s2) {
		if(s1.getId()==s2.getId()) {
			return s1.getName().compareTo(s2.getName());
		}
		return s1.getId()-(s2.getId());
	}
}

class Employe implements Comparable<Employe>{  
	int rollno;  
	String name;  
	int age;  
	Employe(int rollno,String name,int age){  
	this.rollno=rollno;  
	this.name=name;  
	this.age=age;  
	}  
  
	public int compareTo(Employe st){  
	/*if(age==st.age)  
		return 0;  
	else if(age>st.age)  
		return 1;  
	else  
	return -1;  */
		return age-st.age;
	}  
}  