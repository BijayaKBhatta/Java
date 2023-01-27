package assignment;

public class MainClass {
	public static void main(String[] args) 
	{
		//create a string array 
		String[] myStringArray = {"abc", "abcd", "abcde", "ab", "abcdef", "a"};
		String firstSting = myStringArray[0];
		int lengthOffirstString = firstSting.length();
		//Question-1:- Call the method and print the output of maximun length array
		System.out.println("Largest String is- "+rMax( myStringArray, 1, firstSting, lengthOffirstString  ));
	
		//Question -2 Call the method and check if the string is palindrome or not
				String myString = "ABCDEFFH";
				int length  = myString.length()-1;
				boolean isPalindrome = rPalindrome(myString, 0, length);
				if(isPalindrome==true) {
					System.out.println("The given string "+myString+" is palindrome");
				}else {
					System.out.println("The given string "+myString+" is not palindrome");
				}
				
				// Question-3 - Call the method and check if the array is sorted or not
				int[] array = {10,20,30,40,50,60};
				boolean isSortedArray = rSorted(array, array.length);
				
				if(isSortedArray==true) {
					System.out.println("The given array is sorted array");
				}else {
				System.out.println("The given array is not a sorted array");
				}
		
	}

			//Finds and returns the largest element in array of strings.
			static String rMax(String strArray[],int index, String largestLString,int largestLength) 
			{
				if(index==strArray.length) 
				{
					return largestLString;
				}
				int currentIdxLen  = strArray[index].length();
				if(currentIdxLen  >largestLength) 
				{
					largestLength=currentIdxLen;
					largestLString = strArray[index];
				}
				index++;
				return rMax(strArray,index,largestLString, largestLength);
				
			}
			
			static boolean rPalindrome(String myString,int beginCharacter, int lastCharacter){
				if (beginCharacter == lastCharacter)
				return true;
				char leftHChar = myString.charAt(beginCharacter);
				char rightHChar = myString.charAt(lastCharacter);
				if (leftHChar!= rightHChar)
				return false;
				
				if (beginCharacter < lastCharacter + 1)
				return rPalindrome(myString, beginCharacter + 1, lastCharacter - 1);
				
				return true;
		}
			
		 static boolean rSorted(int array[], int length)
	    {
			if (length == 1 || length == 0)
	            return true;
			// get the current element & next element and compare 
			int currentElemenet = array[length - 1];
			int nextElement = array[length - 2];
	
			if (currentElemenet < nextElement)
	            return false;
	        return rSorted(array, length - 1);
	    }
				

}

