
public class ReverseEachWordInString {
	public static void main(String[] args) {
		String str = "this is javatpoint and lets reverse";
		
		String words[] = str.split("\\s");
		StringBuilder reverseS = new StringBuilder();
		for(String word:words) {
			StringBuilder sb = new StringBuilder(word);
			sb.reverse();
			reverseS.append(sb+" ");
		}
		str = reverseS.toString().trim();
		//System.out.println(reverseS);
		System.out.println(str);
		
		
	}

}
