import java.util.Scanner;

public class SortIt {

	public static void main(String[] args){
		Scanner keys = new Scanner(System.in);

		System.out.print("Enter three words: ");

//1) read in three words and print them out in alphabetic order

		System.out.println("Enter first Word");
		String word1 = keys.nextLine();

		System.out.println("Enter second Word");
		String word2 = keys.nextLine();

		System.out.println("Enter third Word");
		String word3 = keys.nextLine();
		
		String temp="";
		
		if(word1.compareTo(word2) > 0) { 
		    temp = word1;    
		    word1 = word2;   
		    word2 = temp;    
		}
		if(word1.compareTo(word3) > 0) { 
		    temp = word1;    
		    word1 = word3;  
		    word3 = temp;    
		}

		if(word2.compareTo(word3) > 0) { 
		    temp = word2;    
		    word2 = word3;  
		    word3 = temp;    
		}


		System.out.println("Sorted words: "+word1+" :: "+word2+ " :: "+word3);
	}
}