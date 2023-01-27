package binarysearch;

import java.util.HashMap;

class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode() {}
	      TreeNode(int val) { this.val = val; }
	      TreeNode(int val, TreeNode left, TreeNode right) {
	          this.val = val;
	          this.left = left;
	          this.right = right;
	      }
	  }
public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeNode root = new TreeNode(100);
		root.left = new TreeNode(50);
		root.left.left = new TreeNode(40);
		root.left.right = new TreeNode(60);
		
		root.right = new TreeNode(200);
		root.right.left = new TreeNode(120);
		root.right.right = new TreeNode(220);
		BinarySearch b = new BinarySearch();
		TreeNode ressult = b.searchBST(root, 20);
		if(ressult!=null) {
			System.out.println("Found:+"+ressult.val);
		}else {
			System.out.println("Not Found");
		}
		
		
	}
	
    
	
    public TreeNode searchBST(TreeNode root, int val) {
        if(root==null) return null;
        if(root.val==val || root==null){
            return root;
        }else if(root.val>val){
           return searchBST(root.left,val);
        }else{
           return searchBST(root.right,val);
        }
    }
	
}

