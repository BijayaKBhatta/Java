package exampackage;

public class Exam3 {
	public static void main(String[] args) {
		String text = "Bye 2020 welcome 2021";
		int numberOfWhiteSpace = 0;
		for (int i = 0; i < text.length(); i++) {
			char c = text.charAt(i);
			if (c == ' ') {
				numberOfWhiteSpace++;
			}
		}
		System.out.println("Number of white space in the string "+text+" is: "+numberOfWhiteSpace);
		/*
		
		for (int i = 0; i < msg.length(); i++) {
			char c = msg.charAt(i);
			Boolean isDigit = Character.isDigit(c);
			if (c == ' ') {
				System.out.println("#");
			} else if (isDigit) {

				System.out.println("#");
			} else {
				System.out.println(c);
			}
		}*/
	}
}
