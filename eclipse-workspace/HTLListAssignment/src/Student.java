import java.nio.charset.Charset;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Student {
	int id;
	String firstName;
	String lastName;
	String  gender;
	String  department;
	String  credits;
	double  gpa;
    Random rand = new Random();

	public void rand() {
		id = 100000 + (int)(Math.random() * (100000 - 100));
		firstName = Student.getRandomString().toString();
		lastName = Student.getRandomString().toString();

	    gender =  "male";
	    department =  Student.getRandomString().toString();
	    credits =  Student.getRandomString().toString();
        gpa = (int) ((Math.random() * 90) + 10) / 100.0;
	    
	}
	 
	public static StringBuilder getRandomString() {
	    String alphabet = "qwertyuioplkjhgfdsazxcvbnm";
	    StringBuilder sb = new StringBuilder();
	    Random random = new Random();
	    int length = 8;
	    for(int i = 0; i < length; i++) {
	      int index = random.nextInt(alphabet.length());
	      char randomChar = alphabet.charAt(index);
	      sb.append(randomChar);
	    }
		return sb;
	}
	@Override
	public String toString() {
		return "Student details:- Id="+id+" first name is"+firstName+" last name is "+lastName+" gender "+gender+" departmenet "+department+" credit "+credits+" GPA is "+gpa*100;
	}

	
}
