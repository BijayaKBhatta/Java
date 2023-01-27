public class Tree {

     TreeNode root;


    public Tree(){

        root = null;        
    }        

    public boolean isEmpty(){

        return root == null;

    }

    public void insert(String item){

        if(isEmpty()){      
            root = new TreeNode(item); 
                }else{      
                    root.add(item);
               }
        }

      static TreeNode search(TreeNode root, String item){
          if(root == null){
              return null;              
          }else if (root != null && item.equals(root.item)){ 
              root.upFreq();
              return root;
          }else{
              search(root.left, item);
              if(root.left != null && item.equals(root.left.item)){                   
                  return root.left;
              }else{
                  search(root.right, item);
                  if(root.right != null && item.equals(root.right.item)){                      
                      return root.right;
                  }
              }
          }return null;
      } 

        public TreeNode getRoot(){
            return root;
        }
         public void preOrderPrint() {
        preOrderPrint(root);
    }        

       public static void preOrderPrint(TreeNode root) {
         if (root != null) {            
	
	       System.out.println(root.getItem());   // root
	       preOrderPrint(root.getLeft());        // left
	       preOrderPrint(root.getRight());       // right
	      }
       }
       public static void postOrderPrint(TreeNode root) {
           if (root != null) {            
  	
  	       preOrderPrint(root.getLeft());        // left
  	       preOrderPrint(root.getRight());       // right
  	       System.out.println(root.getItem());   // root
  	   	
  	      }
         }
       
       public static void inOrderPrint(TreeNode root) {
           if (root != null) {            
  	     preOrderPrint(root.getLeft());        // left
  	     System.out.println(root.getItem());   // root
   	   	 preOrderPrint(root.getRight());       // right
  	      
  	      }
         }
       
}