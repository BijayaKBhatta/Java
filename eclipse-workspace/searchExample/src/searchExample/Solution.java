package searchExample;

// Find the longest common ansenstor 
// patterns - 1) inorder traversal - sorted set 2) Gobal variable state  and modify it during recursssion 

//3) Number line ||----Left--------||------RIght-----||



public class Solution {
	public TreeNode LCA(TreeNode root, TreeNode p,TreeNode q) {
		
		if((root.value < p.value && root.value < q.value)){
			LCA(root.right, p,q);
			
		}else if((root.value > p.value && root.value > q.value))
			LCA(root.left, p,q);
		else
			return root;
		
		
		
		
		
	
		
	return null;
		
	}

}
class TreeNode{
	int value;
	TreeNode left,right;
	TreeNode(int x){
		value=x;
		
	}
	
}
