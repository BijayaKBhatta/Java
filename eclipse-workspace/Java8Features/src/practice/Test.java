package practice;

interface Claclulator{
	void switchOn();
}

interface Sum{
	void switchOn(int a);
}

interface Add{
	int addition(int a,int b);
}


interface DoCalculation {
	int calculate(int a, int b, int c);
}

public class Test{
	public static void main(String[] args) {
		//example1
		Claclulator c = ()->{System.out.println("Switch on");};
		c.switchOn();
	
		//example2
		Sum s = (a)-> System.out.println("Sum:- "+a);
		s.switchOn(10);
		//example3
		Add add = (a,b)-> a+b;
		System.out.println("Addition:- "+add.addition(10,20));
		System.out.println("Addition:- "+add.addition(40,20));
		
		//example4
		
		DoCalculation d = (no1,no2,no3)->{
			int dd = no1+no2*no3;
			System.out.println("--"+dd);
			return dd;
		};
		d.calculate(10, 20, 30);
	
		
	}
}
