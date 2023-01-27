package practice;

public class DPSubstring {
	public static void main(String[] args) {
			 String s1 = "OldSite:GeeksforGeeks.org";
	        String s2 = "NewSite:GeeksQuiz.com";
	 
		int longestSub=0, startIdx = 0, endIdx=0;
		int len1 = s1.length();
		int len2= s2.length();
		
		int dp[][] = new int[len1+1][len2+1];
		for(int i=0;i<=len1;i++) {
			for(int j=0;j<=len2;j++) {
				if(i==0 || j==0) {
					dp[i][j] = 0;
				}else {
					if(s1.charAt(i-1) == s2.charAt(j-1)) {
						dp[i][j] = dp[i-1][j-1]+1;
						if(longestSub < dp[i][j]) {
							longestSub = dp[i][j];
							endIdx = j;
							startIdx = j-longestSub;
						}
					}
				}
			}
		}
		
		System.out.println(longestSub);
		System.out.println(s2.substring(startIdx,endIdx));		
		
		
		
	}

}
