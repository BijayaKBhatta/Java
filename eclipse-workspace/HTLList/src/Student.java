import java.nio.charset.Charset;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Student {
	int id;
	String first_name;
	String last_name;
	String  gender;
	String  department;
	String  credits;
	double  gpa;
    Random rand = new Random();

	public void rand() {
		id=rand.nextInt();
		first_name = Student.getRandomString().toString();
	    last_name = Student.getRandomString().toString();

	    gender =  "male";
	    department =  Student.getRandomString().toString();
	    credits =  Student.getRandomString().toString();
        //gpa = ThreadLocalRandom.current().nextDouble();	    
        gpa = (int) ((Math.random() * 90) + 10) / 100.0;
	    
	}
	 
	public static StringBuilder getRandomString() {

		// create a string of all characters
	    String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

	    // create random string builder
	    StringBuilder sb = new StringBuilder();

	    // create an object of Random class
	    Random random = new Random();

	    // specify length of random string
	    int length = 7;

	    for(int i = 0; i < length; i++) {

	      // generate random index number
	      int index = random.nextInt(alphabet.length());

	      // get character specified by index
	      // from the string
	      char randomChar = alphabet.charAt(index);

	      // append the character to string builder
	      sb.append(randomChar);
	    }
	   
		return sb;
	}
	@Override
	public String toString() {
		
		return "ID="+id+" first name is:-"+first_name+" last name is:-"+last_name+" gender is:-"+gender+" departmenet is:-"+department+" credit is:-"+credits+" GPA is:-"+gpa*100;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getCredits() {
		return credits;
	}
	public void setCredits(String credits) {
		this.credits = credits;
	}
	public double getGpa() {
		return gpa;
	}
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	
}
