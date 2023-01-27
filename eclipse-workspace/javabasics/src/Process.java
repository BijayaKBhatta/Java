import java.util.Scanner;

public class Process {

	public static void main(String[] args){
		Scanner keys = new Scanner(System.in);

		System.out.print("Enter a word and two digits: ");

/*
   Read in a word and two digits.
   If the word is pow, print out the first digit raised to the power of the second
   If the word is abs, print out the absolute difference of the two numbers
   If the word is anything else.. print out "invalid"
*/

String word = keys.nextLine();
int firstDigit = keys.nextInt();
int secondDigit = keys.nextInt();

if(word.equalsIgnoreCase("pow")) {
	System.out.println(Math.abs(firstDigit^secondDigit));
	
}else if(word.equalsIgnoreCase("abs")) {
	System.out.println(Math.abs(firstDigit-secondDigit));
	
}else {
	System.out.println("invalid");
}



		System.out.println();
	}
}