package exampackage;


public class Exam {
	public static int get(int n) {
		if(n==0) return 0;
		else
		{
			int m = get(n/2);
			return (n%2)+10*m;
		}
	}
	public static void main(String[] args) {
		
		System.out.println(get(65));;
		
		/*
		 * 
		 String[] words = new String[] {"Exam Today", "Done tommorow","Holiday will start soon"};
		String lastWordCollection = "";
		
		for(String str: words) {
			String lastWord = str.substring(str.lastIndexOf(" ")+1);
			lastWordCollection=lastWordCollection +" "+lastWord;

		}
		System.out.println(lastWordCollection);
  	*/
	}
	
	
}
