package assignment;

import java.util.Scanner;

public class Submission {
static int getMaxProfit(int resourceMap[][],  
                              int m, int n) 
    { 
         int profitTable[][] = new int[m][n]; 
         profitTable = resourceMap;
        for (int row = 1; row < m; row++)  // starting from 1 not from 0
        { 
           for (int col = 0; col < n; col++) 
            {     
        	   // find right up
        		int right_up;
        		if(col == n-1) {
        			right_up = 0;
        		}else {
        			right_up = profitTable[row-1][col+1]; 
        		}
        		//find left up
        		int left_up;
        		if(col ==0) {
        			left_up = 0;
        		}else {
        			left_up = profitTable[row-1][col-1]; 
        		}
        		// find the maximun between left up & right up.
        		if(right_up > left_up) {
        			profitTable[row][col] = resourceMap[row][col] + right_up;
        		}else {
        			profitTable[row][col] = resourceMap[row][col] + left_up;
        		}
        	                                            
            } 
        } 
        int res = profitTable[0][0]; 
        for (int i = 0; i < m; i++) 
        {
        	if(profitTable[m-1][i]>res) {
        		res = profitTable[m-1][i];
        	}
        }
        return res; 
    } 
      
    public static void main(String arg[]) 
    { 
        // row number
    	int m = Integer.parseInt(arg[0]);
    	int n=m;
    	// column number
    	//int n = Integer.parseInt(arg[0]);
    	int resourceMap[][] = new int[m][n];
    	Scanner input = new Scanner(System.in);
    	for (int i = 0; i < m; i++) {
        	for (int j = 0; j < n; j++) {
        		//System.out.println("Enter "+i+"-row "+j+"-column");
        		resourceMap[i][j] = input.nextInt();
        	}
        }
    	/*System.out.println("Original Table");
        for (int i = 0; i < m; i++) {
        	for (int j = 0; j < n; j++) {
        		System.out.print(" "+resourceMap[i][j]);
        	}
        	 System.out.println("");
        }
          System.out.println("The proit table is as below");
          */

    	int finalProfit = getMaxProfit(resourceMap, m, n);
    	System.out.println(finalProfit);
    }
	
}
