import java.util.Scanner;

public class NestedIf {

	public static void main(String[] args){
		Scanner keys = new Scanner(System.in);

		System.out.print("Enter the day: ");
//1) read in the day from the user one of=> (Fri, Sat, Sun, Mon.. etc)
	    String day = keys.nextLine();  // Read name


		System.out.print("Enter your total amount of purchases: ");
//2) read in the total purchases
	    double amountPutchases = keys.nextDouble();  // Read name


/*
 3) 	Using an if, work out the cashback (make a variable) based on the following policy:
	On Weekends: 10% of purchases returned to the shopper
	On Weekdays:
		use ternary=> if purchases more than 1000 => 8%, if not, only 4%
*/
	    double cashback = 0.0;
	    if(day.equalsIgnoreCase("sat") || day.equalsIgnoreCase("sun") ) {
			System.out.println("Cash back: " +(amountPutchases*.1));

	    }else {

	  
	    cashback = amountPutchases>=1000 ? (amountPutchases*.08):(cashback*.08);	    

		System.out.println("Cash back: " +cashback);
	    }
	}
}