package javaassignment;

import java.util.Random;

import javax.rmi.CORBA.Util;

//Main Class 
public class LargestElement {


	// main method
	public static void main(String[] args) {

		//Q-1 -rMax -  finds and returns the largest element in array of strings.
		String[] str = {"olklo", "BMW", "Ford", "Mazda", "mahindra"};
		LargestElement d = new LargestElement();
		String maxS =  d.rMax( str, 1, str[0].length(),  str[0]);
		System.out.println("Maximun Length String  is:- "+maxS);
	
		
		//Q-2 - rPalindrome - checks and returns if a string is a palindrome or not
		String checkPalindrome = "college";
		boolean isPal = d.rPalindrome(checkPalindrome, 0, checkPalindrome.length()-1);
		System.out.println("The String "+checkPalindrome+" is palindrom - T/F ? "+isPal);
		
		
		
		// Q-3 - rSorted - checks and returns if a generic array is sorted or not
		int[] array = {1,6,8,22,66,55};
		boolean isSorted = d.rSorted(array, array.length);
		System.out.println("The input array is sorted True/False ? "+isSorted);

	}
	//Finds and returns the largest element in array of strings.
		String rMax(String a[],int i,int maxLength, String maxLString) {
			if(i==a.length) {
				return maxLString;
			}
			if(a[i].length() >maxLength) {
				maxLength=a[i].length();
				maxLString = a[i];
			}
			i++;
			return rMax(a,i,maxLength,maxLString);
			
		}
		
		
		//Checks and returns if a string is a palindrome or not
		public boolean rPalindrome(String str,int startChar, int endChar)
		{
			// If there is only one character then return true
			if (startChar == endChar)
			return true;
			// If first and last char do not match then return false
			if ((str.charAt(startChar)) != (str.charAt(endChar)))
			return false;
			if (startChar < endChar + 1)
			return rPalindrome(str, startChar + 1, endChar - 1);
			
			return true;
	}
		
		
		
	//Checks and returns if a generic array is sorted or not
	 boolean rSorted(int array[], int length)
    {
        // If array contains only one element or zero element or all the element are already tested
		if (length == 1 || length == 0)
            return true;
        if (array[length - 1] < array[length - 2])
            return false;
        // lets check the next pair of element 
        return rSorted(array, length - 1);
    }
	
	
	
	
	
}
