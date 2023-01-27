package hashtable;
//https://leetcode.com/problems/intersection-of-two-arrays/submissions/
//https://vimeo.com/384551964
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class IntersectionOfTwoArrayQ2 {

	public static void main(String[] args) {
		int nums1[] = new int[]{4,9,5};
		
		int nums2[] = new int[] {9,4,9,8,4};
		IntersectionOfTwoArrayQ2 inte = new IntersectionOfTwoArrayQ2();
		int a[] = inte.intersection(nums1,nums2);
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
	//O(n^2) solution - can we optimise it ?
	
public int[] intersection(int[] nums1, int[] nums2) {
	Set<Integer> s = new HashSet<Integer>();
    for(int i=0;i<nums1.length;i++) {
    	for(int j=0; j<nums2.length;j++) {
    		if(nums1[i]==nums2[j])
    		{
    			s.add(nums1[i]);
    		}
    	}
    }
	int a[]= new int[s.size()];
	int i=0;
	for(int element:s) {
		a[i]=element;
		i++;
	}
	return a;
   }

public int[] intersection_optimised(int[] nums1, int[] nums2) {
	Set<Integer> s = new HashSet<Integer>();
	Map<Integer, Integer> map =  new HashMap<Integer, Integer>();
	
    for(int i=0;i<nums1.length;i++) {
    	map.put(nums1[i], 1);
    }
    
    for(int i=0;i<nums2.length;i++) {
    	if(map.containsKey(nums2[i])) {
    		s.add(nums2[i]);
    	}
    }
    int a[]= new int[s.size()];
	int i=0;
	for(int element:s) {
		a[i]=element;
		i++;
	}
	return a;
   }
}
