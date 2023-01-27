public class If1 {

	public static void main(String[] args){

		double salary = 1350.5;
		double donation = 0;
		double tax = 0;
		double mark = 50;
		String grade = "NOT ASSIGNED";



//  	1) If the salary is more than 1000 donation is 100. Calculate the donation.


		if(salary>1000) {
			donation=100;
		}



//	2) If the salary is more than 2000 tax is 20% of the salary, otherwise only 10%.
//	   Calculate the tax. (use an if - else)

if(salary>200) {
	tax=salary*.2;
}


//	3) If the mark is more than 90 the grade is "A", otherwise if it is more than
//	   80 the grade is "B", otherwise if it is more than 70 it is "C" otherwise it is
//	   "FAILED".  Calculate the grade. ( use an if - else if - else if - else else )


if(mark>90) {
	grade="A";
}else if(mark > 80) {
	grade="B";
}else {
	grade="C";
}





		System.out.println("The donation is : " + donation +
					"\nThe tax amount is: " + tax +
					"\nThe letter grade is: "+ grade );

	}


}