package practice;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MergeSortParallel {
public static void main(String[] args) throws ParseException {
	int arr[]  = new int [] {10, 20, 11, 2, 22};
	MergeSortParallel m = new MergeSortParallel();
	//m.sort(arr, 0, arr.length-1);
	m.parallelMergeSort(arr, 0, arr.length-1, 4);
	for( int i=0;i<arr.length;i++) {
    	System.out.print(" "+arr[i]);
    }
	
}

	public void parallelMergeSort(int arr[], int low, int high, int noofThreads) throws ParseException {
		if(low<high) {
		// TODO Auto-generated method stub
		if(noofThreads<=1) {
			sort(arr, low, high);
			return;
		}
		int mid = (low+high)/2;
		Thread t1 = mergeSortParalle(arr, low, mid, noofThreads);
		Thread t2 = mergeSortParalle(arr, mid+1, high, noofThreads);
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		merge(arr, low, mid, high);
		}
	}
	
	private Thread mergeSortParalle(int arr[], int low, int high, int numofThreads) {
		return new Thread() {
		@Override
		public void run() {
			// TODO Auto-generated method stub
			try {
				parallelMergeSort(arr,low, high, numofThreads/2);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
		};
	}
	 
	
	

	void merge(int arr[], int l, int m, int r)
	    {
	        // Find sizes of two subarrays to be merged
	        int n1 = m - l + 1;
	        int n2 = r - m;

	        /* Create temp arrays */
	        int L[] = new int[n1];
	        int R[] = new int[n2];

	        /*Copy data to temp arrays*/
	        for (int i = 0; i < n1; ++i)
	            L[i] = arr[l + i];
	        for (int j = 0; j < n2; ++j)
	            R[j] = arr[m + 1 + j];

	        /* Merge the temp arrays */

	        // Initial indexes of first and second subarrays
	        int i = 0, j = 0;

	        // Initial index of merged subarry array
	        int k = l;
	        while (i < n1 && j < n2) {
	            if (L[i] <= R[j]) {
	                arr[k] = L[i];
	                i++;
	            }
	            else {
	                arr[k] = R[j];
	                j++;
	            }
	            k++;
	        }

	        /* Copy remaining elements of L[] if any */
	        while (i < n1) {
	            arr[k] = L[i];
	            i++;
	            k++;
	        }

	        /* Copy remaining elements of R[] if any */
	        while (j < n2) {
	            arr[k] = R[j];
	            j++;
	            k++;
	        }
	       
	    }

	    // Main function that sorts arr[l..r] using
	    // merge()
	    void sort(int arr[], int l, int r) throws ParseException
	    {
	    	if (l < r) {
	            // Find the middle point
	            int m =l+ (r-l)/2;

	            // Sort first and second halves
	            sort(arr, l, m);
	            sort(arr, m + 1, r);

	            // Merge the sorted halves
	            merge(arr, l, m, r);
	        }
	        
	    }

}
