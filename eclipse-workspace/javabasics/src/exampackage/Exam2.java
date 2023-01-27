package exampackage;

public class Exam2 {
	public static void main(String[] args) {
		/*
		 * Q-1 Declare array
		 */
		int[] nos = new int[15];
		/*
		 * Q-2 enter numbers
		 */
		int startingNumber = 500;
		for(int i=0;i<nos.length;i++) {
			nos[i] = startingNumber;
			startingNumber=startingNumber-5;
		}
		/*
		 * Q-3 Find Avg of nos 
		 */
		int avg = 0;
		for(int i=0;i<nos.length;i++) {
			avg +=nos[i];
		}
		avg = avg/nos.length;
		
	}
}
