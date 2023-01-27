import java.util.Scanner;

public class NewSalary {

	public static void main(String[] args){
		Scanner keys = new Scanner(System.in);

// 1) read in the name
		System.out.print("Enter your name: ");
	    String name = keys.nextLine();  // Read name

// 2)read in the salardy
		System.out.print("Enter your salary: ");

		double salary = keys.nextDouble();  // Read Salary

// 3) read in the currency e.g. "KD" "$" etc...
		System.out.print("Enter currency: " );

		String currency = keys.nextLine();  // Read currency

// 4) read in the % increase (e.g. 10, 25 etc..)
		System.out.print("How much is the increase: ");

		int pecentageIncrease = keys.nextInt();  // Read %

/*5) Use printf to print out something like this:
	Where Ahmed and KD are the name and currency

	Ahmed, your new salary is:
	54567.453KD
*/
		System.out.println("Where "+name+" and "+currency+ " are the name and currency");
		double finalS = salary+(salary * (pecentageIncrease/100));
		System.out.println(name+", your new salary is"+finalS);
		
		
	}
}