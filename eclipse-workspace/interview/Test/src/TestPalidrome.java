import java.security.acl.LastOwnerException;

public class TestPalidrome {
// number of palidrome in a word 
	
	// input - string 
	// output - int 4
	
	// example - abccba - 1,2,3
	
	public static void main(String[] args) {
		String checkPalidrome = "abccba";
		int len = checkPalidrome.length()-1;
		int count = 0;
		for(int i=1;i<len;i++) {
			String word = checkPalidrome.substring(0,i);
			StringBuilder s = new StringBuilder(word);
			
			//char wordC [] = new char[word.length()];
			
			//String reverseWord = reverse(word);
			String reverseWord = s.reverse().toString();
			String lastPart = checkPalidrome.substring(i,len);
			if(word.contains(lastPart)) {
				System.out.println(word+" :Reverseword: "+reverseWord+" last "+lastPart);
						count++;
			}
		}
		System.out.println(count);
	}

private static String reverse(String word) {
	System.out.println("word is"+word);
	char wordC [] = new char[word.length()];
	wordC = word.toCharArray();
	//System.out.println(wordC[0]);
	// TODO Auto-generated method stub
	int lastIdx = wordC.length-1;
	for(int i=0;i<wordC.length/2;i++) {
		//System.out.println(wordC[i]);
		char temp = wordC[i];
		 wordC[i]  = wordC[lastIdx];
		 wordC[lastIdx] = temp;
		 lastIdx--;
	}
	//System.out.println(wordC.toString());
	
	return wordC.toString();
}
	
}
