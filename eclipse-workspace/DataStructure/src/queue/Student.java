package queue;

// 1) Data memeer - front, rear , size,  array [10][20][][][]
// 2) methods - enque, deque, isFull, isEmpty, 




// class 
public class Student { //Student  class
	 
	// field 
	int rollNo;
	int age;
	String name;
	
	// constructor - special type of method , which does not have a return type
	// insta - creating an object 
	Student(int rollNo, int age, String name){
		this.rollNo=rollNo;
		this.age = age;
		this.name = name;
	}
	//method 
	public  int getrollNo() {
		return rollNo;
		
	}
	// method 
	public int getAge() {
		return age;
	}
	
	// method 
		public String getName() {
			return this.name;
		}

	public static void main(String[] args) {
		//Cannot make a static reference to the non-static method getrollNo() from the type Student
		 // static method can access only static methods/variables 
		//getAge();
		
		
		Student s = new Student(10, 19, "Navda");
		// get the age of Navda ? 
		
		int rollNumber = s.getrollNo();
		int age = s.getAge();
		String name  = s.getName();
		System.out.println("Student Roll No is-"+rollNumber);
		
		System.out.println("Stuent name is- "+name);
		System.out.println("Student age is-"+age);
		
		
		
		// roll number  -- 
		
		
		
		
	}
	
	
}


// Student - ? - class  - Every class can have 1) data memvers 2) Methods 3) cosntroctors 