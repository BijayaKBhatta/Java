package thrycatchthrows;

public class ThrowsExample {
	public static void main(String[] args) {
		Student s = new Student();
		System.out.println("Div is "+s.div(10, 0));
	}

}

class Student {
	public int div(int a, int b){
		int c = 0;
		try{
			c= a/b;
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			
		}
		return c;
	}
}