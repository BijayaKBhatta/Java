package interview;

import java.util.function.Function;
import java.util.stream.Collectors;

public class Solution {

	public String solution(String S) {
		
		String result   = S.chars().mapToObj(c -> Character.toString((char) c))
		        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
		        .entrySet()
		        .stream()
		        .filter(entry->entry.getValue()==2)
		        .findFirst()
		        .get().getKey();
		return result;
		
		}
	public static void main(String[] args) {
		Solution  s = new Solution();
		System.out.println(s.solution("abcda"));
	}
}
