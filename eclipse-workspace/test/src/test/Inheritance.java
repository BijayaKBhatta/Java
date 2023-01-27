package test;
class A{

	
	
}

 class B extends A{
	 public void printL() {
			System.out.println("B");
		}	
}

public class Inheritance{
	
	public static void main(String[] args) {
		A a = new B();
		//((B) a).printL();
	}
}