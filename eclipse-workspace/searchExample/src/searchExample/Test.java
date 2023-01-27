package searchExample;

import java.util.HashMap;

public class Test {
public static void main(String[] args) {

System.out.println((2+3)/2);
}
}

/*

class Solution {
    public int[] anagramMappings(int[] A, int[] B) {
    
    
      for (int 
        
    }
}


class Solution {
    public String reverseWords(String s) {
       char[] sArray = s.toCharArray(); 
       compress(sArray); 
       reverse(sArray,0,sArray.length); 
       
       int start=0;
       int end =1; 
       
       while(end < sArray.length){
          if (sArray[end] == '/s'){
            reverse(start,end,sArray); 
            start = end+1;
            end = end+1;
          }
       }
       
       reverse(start,end,sArray); 
       
       return new String(sArray); 
    }
    
    [ abc  good man]
      ^
           ^
    private void compress(char[] sArray){
      int spacePointer=-1; 
      boolean newWord=false;
      while(current < sArray.length){
        if(sArray[current] == '/s' && !newWord){
          spacePointer++;
          newWord=false;
        }else{
          newWord=true;
        }
        
        if (spacePointer != current){
            sArray[spacePointer] = sArray[current];
            spacePointer++;
            current++;
        }
      }
    }
    
    private void reverse(int start, int end, char [] sArray){
      while(start<end){
      
        char tmp = sArray[start];
        sArray[start] = sArray[end];
        
        start--; 
        end++;
      }
    }
}



class Solution {
    
    public double findMaxAverage(int[] nums, int k) {
      int sum=0; 
      
      
      for (int i=0;i<nums.length;i++){
        
      }
      
        
    }
}



[1,2,3,4,-10,1]
 ^
   ^
class Solution {
    public int maxSubArray(int[] nums) {
      int i=0;
      int j=0; 
      int maxSum = 0; 
      int sum=0;
      
      while(j<nums.length){
        sum += a[j];
        maxSum = Math.max(sum,maxSum); 
        if(sum < 0){
          i=j+1;
          sum=0;
        }
        j++;
      }
      
      return maxSum;
        
    }
}

class Solution {
    public int missingNumber(int[] nums) {
       long sum=0;
       for (int i=0;i<nums.length;i++){
         sum+=nums[i];
       }
       
       
       int missingNum = (nums.length * (nums.length + 1))/2  - sum; 
       return missingNum;
        
    }
}

class Solution {
    public int romanToInt(String s) {
    
      HashMap<Character,Integer> map = new HashMap<>(); 
      map.put('I',1);
      map.put('V',5); 
      map.put('X',10); 
      map.put('L',50); 
      map.put('C',100'); 
      map.put('D',500);
      map.put('M',1000); 
      
      int current =0; 
      int next =1; 
      char[] romanArray = s.toCharArray(); 
      int sum=0;
      while(next < romanArray.length){
        int cValue = map.get(romanArray[current]); 
        int nValue = map.get(romanArray[next]); 
        if (cValue <nValue){
          sum -= cValue;
        }else{
          sum += cValue;
        }
        current++;
        next++;
      }
      
      sum+= map.get(next-1); 
      return sum;
        
    }
}


Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000

class Solution {
    public TreeNode sortedListToBST(ListNode head) {
    
      ListNode mid = findMid(head); 
      TreeNode midTree = new TreeNode(mid.val);
      midTree.left = sortedListToBST(head); 
      midTree.right = sortedListToBST(mid.next); 
      return midTree;
    }
    
    ListNode findMid(ListNode head){
      ListNode current = head; 
      ListNode fast = head; 
      ListNode prev = null;
      while(fast!=null && fast.next != null){
        prev = current; 
        current = current.next;
        fast = fast.next.next;
      }
      
      prev.next = null; 
      return current; 
    }
}


class Solution {
    public int maxPoints(int[][] points) {
      Map<String,Integer> lineCountMap = new HashMap<>(); 
      for (int i=0;i<points.length;i++){
        
      }
        
    }
}

class Solution {
    Node head; 
    Node previous; 
    public Node treeToDoublyList(Node root) {
      inOrder(root); 
      head.right = previous; 
      previous.left = head;
      return head; 
    }
    
    public void inOrder(Node root){
      if (root == null ) return ; 
      inOrder(root.left); 
      if (head == null) {
        head = root;
        previous = root; 
      }else{
        previous.right = root;
        root.left = previous;
        previous = root; 
      }
      inOrder(root.right); 
      
    }
}


class Solution {
    public boolean isReflected(int[][] points) {
    
        Set<String> pointsSet  = new HashSet<>(); 
        int point[] max=null;
        int point[] min=null;
        
        for (int[] point : points){
          int x = point[0];
          int y = point[1]; 
          pointsSet.add(x + "#" + y); //1#-1,2#-1
          
          if (max == null){
            max = point; 
            min= point;
          }else{
            if (max[0] < point[0]){
                max = point;
            }
            
            if(min[0] > point[0]){
              min = point; 
            }
          }
        }
        
        if (min[1] != max[1]) return false; 
        
        int line = min[0] + max[0]; 
        
        for (int[] point : points){
          int complement = line - point[0];
          if (!pointsSet.contains(complement + '#" + point[1])){
            return false;
          }
        }
        return true; 
    }
}

class Solution {
    public int lengthOfLongestSubstring(String s) {

      if (s== null|| s.length==0) return 0; 
      if (s.length == 1 ) return 1; 
    
      char[] sArray = s.toCharArray(); 
      Map<Character, Integer> cIndexMap = new HashMap<>(); 
      int i=0;
      int j=0;
      int maxLength=-1;
      while(j < sArray.length){
        if (cIndexMap.containsKey(sArray[j]){
            int index = cIndexMap.get(sArray[j]);
            if (index > i ) {
              maxLength= Math.max(maxLength,j-i); 
              i= index+1;
            }
        }else{
          cIndexMap.put(sArray[j],j); 
        }
        j++;
      }
      return Math.max(j-i,maxLength); 
        
    }
}
*/