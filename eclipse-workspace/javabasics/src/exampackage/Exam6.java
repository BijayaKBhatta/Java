package exampackage;


public class Exam6 {
	public static void main(String[] args) {
		
		java.util.Scanner in = new java.util.Scanner(System.in); 
		
		String word = in.nextLine();
		char[] letters = new char[5];
		for(int i=0;i<word.length()-1;i++) {
			letters[i] = word.charAt(i);
			//System.out.println(letters[i]);
		}
	}
	
	
}
