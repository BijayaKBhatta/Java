
public class TreeNode {

	String item; // data in node        
    TreeNode left;    // Pointer to left subtree.
    TreeNode right;   // Pointer to right subtree.
    private static int freq = 1;


   public TreeNode(String str){
    item = str;
    left = null;
    right = null;
    
   }

public void add(String item) {

    if (left == null) {     
        left = new TreeNode(item);      
    } else if( right == null){      
        right = new TreeNode(item);         
    } else {        
        if(countNodes(left) <= countNodes(right)){               
            left.add(item);             
        } else {        
            right.add(item);

        }   
    }
}

//Count the nodes in the binary tree to which root points, and
public static int countNodes( TreeNode root ) {
    if ( root == null ){

        // The tree is empty.  It contains no nodes.
        return 0;  

            }else {

        // Start by counting the root.
        int count = 1;   


        // Add the number of nodes in the left subtree.
        count += countNodes(root.left);

        // Add the number of nodes in the right subtree.
        count += countNodes(root.right); 

        return count;  // Return the total.
    }
}

    public TreeNode getLeft(){
    return left;
}

public TreeNode getRight(){
    return right;
}

public String getItem(){
    return item;
} 
     public static void upFreq(){
       freq++;
    }

    public int getFreq(){
        return freq;
    }
}
