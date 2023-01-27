
public class Student implements Comparable<Student>{

	
	int rollNo;
	String name;
	Student(int rollNo,String name){
		this.rollNo=rollNo;
		this.name=name;
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
	
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		if(this.rollNo==o.rollNo) return 0;
		else if(this.rollNo>o.rollNo) return 1;
		else return -1;
	}
	
}
