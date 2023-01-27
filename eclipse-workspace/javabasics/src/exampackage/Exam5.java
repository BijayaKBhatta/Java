package exampackage;


public class Exam5 {
	public static void main(String[] args) {
		
		String[] t1 = new String[] {"hi", "there"};
		String[] t2 = new String[] {"good", "luck"};
		String[] t3 = new String[] {"goodbye"};
		
		String[] word= new String [t1.length+t2.length+t2.length];
		word = merge(t1, t2,t3);
		
	     
	}
	public static String [] merge(String t1[], String t2[], String t3[]){
		String[] mergedText= new String [t1.length+t2.length+t3.length];
		int idx=0;
		for(String s: t1) {
			mergedText[idx]=s;
			idx++;
		}
		for(String s: t2) {
			mergedText[idx]=s;
			idx++;
		}
		for(String s: t3) {
			mergedText[idx]=s;
			idx++;
		}
		for(String s: mergedText) {
			System.out.println(s);
		}
		return mergedText;
	}
	
}
