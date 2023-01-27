import java.util.Scanner;


public class BinarySearchTreeFrequencyFinal {

	//Represent a node of binary tree  
    public static class Node{  
        int data;  
        Node left;  
        Node right;  
        int frequency;
  
        public Node(int data){  
            //Assign data to the new node, set left and right children to null  
            this.data = data;  
            this.left = null;  
            this.right = null;
            frequency=1;
        }  
      }  
  
      //Represent the root of binary tree  
      public Node root;  
  
      public BinarySearchTreeFrequencyFinal(){  
          root = null;  
      }  
  
      //insert() will add new node to the binary search tree  
      public void insert(int data) {  
          //Create a new node  
          Node newNode = new Node(data);  
  
          //Check whether tree is empty  
          if(root == null){  
              root = newNode;  
              return;  
            }  
          else {  
              //current node point to root of the tree  
              Node current = root, parent = null;  
  
              while(true) {  
                  //parent keep track of the parent node of current node.  
                  parent = current;  
  
                  //If data is less than current's data, node will be inserted to the left of tree  
                  if(data < current.data) {  
                      current = current.left;  
                      if(current == null) {  
                          parent.left = newNode;  
                          return;  
                      }  
                  }  
                  //If data is greater than current's data, node will be inserted to the right of tree  
                  else if(data > current.data) {  
                      current = current.right;  
                      if(current == null) {  
                          parent.right = newNode;  
                          return;  
                      }  
                  }else { // Bijaya
                	  current.frequency++;
                	  return;
                	  
                  }
              }  
          }  
      }  
  
      
      
      
      //search() will add new node to the binary search tree  
      public boolean search(int data) {  
  
          //Check whether tree is empty  
          if(root == null){  
              return false;  
            }  
          else {  
              //current node point to root of the tree  
              Node current = root, parent = null;  
  
              while(true) {  
                  //parent keep track of the parent node of current node.  
                  parent = current;  
                  //If data is found then return found  
                  if(data==current.data) {
                	  return true;
                  }
                  else if(data < current.data) {  
                      current = current.left;  
                      if(current == null) {  
                          return false;  
                      }  
                  }  
                  //If data is greater than current's data, node might present in right  
                  else {  
                      current = current.right;  
                      if(current == null) {  
                          return false;  
                      }  
                  }  
              }  
          }
      }  
      
      //minNode() will find out the minimum node nd can be found in the left most node 
      public Node minNode(Node root) {  
          if (root.left != null)  
              return minNode(root.left);  
          else  
              return root;  
      }  
      
      //maxNode() will find out the maximun node and can be found in the left most node 
      public Node maxNode(Node root) {  
          if (root.right != null)  
              return maxNode(root.right);  
          else  
              return root;  
      }  
  
      //deleteNode() will delete the given node from the binary search tree  
      public Node deleteNode(Node node, int value) {  
          if(node == null){  
              return null;  
           }  
          else {  
              //value is less than node's data then, search the value in left subtree  
              if(value < node.data)  
                  node.left = deleteNode(node.left, value);  
  
              //value is greater than node's data then, search the value in right subtree  
              else if(value > node.data)  
                  node.right = deleteNode(node.right, value);  
  
              //If value is equal to node's data that is, we have found the node to be deleted  
              else {
            	  if(node.frequency>1) {
            		  node.frequency--;
            		  return node;
            	  }
                  //If node to be deleted has no child then, set the node to null  
                  if(node.left == null && node.right == null)  
                      node = null;  
  
                  //If node to be deleted has only one right child  
                  else if(node.left == null) {  
                      node = node.right;  
                  }  
  
                  //If node to be deleted has only one left child  
                  else if(node.right == null) {  
                      node = node.left;  
                  }  
  
                  //If node to be deleted has two children node  
                  else {  
                     //then find the minimum node from right subtree  
                      Node temp = minNode(node.right);  
                      //Exchange the data between node and temp  
                      node.data = temp.data;  
                      node.frequency = temp.frequency;
                      //Delete the node duplicate node from right subtree  
                      node.right = deleteNode(node.right, temp.data);  
                  
                	  /*
                	    //then find the minimum node from right subtree  
                      Node temp = minNode(node.right);  
                      //Exchange the data between node and temp  
                      int tempData = temp.data;
                      int nodeF = node.frequency;
                      temp.data = node.data;
                      temp.frequency=nodeF;
                      
                      node.data = tempData; 
                      //node.frequency=tempF;
                      node.frequency = temp.frequency;
                      //Delete the node duplicate node from right subtree  
                      deleteNode(node, temp.data);  
                  */
                  
                  }  
              }  
              return node;  
          }  
      }  
  
      //inorder() will perform inorder traversal on binary search tree  
      public void inorderTraversal(Node node) {  
    	  
          //Check whether tree is empty  
          if(root == null){  
              System.out.println("Tree is empty");  
              return;  
           }  
          else {  
  
              if(node.left!= null)  
                  inorderTraversal(node.left);  
              System.out.print(node.data + "::"+node.frequency+" ");  
              
              if(node.right!= null)  
                  inorderTraversal(node.right);  
  
          }  
      }
      public void preOrderTraversal(Node node) {  
    	  
          //Check whether tree is empty  
          if(root == null){  
              System.out.println("Tree is empty");  
              return;  
           }  
          else {  
        	   System.out.print(node.data + "::"+node.frequency+" ");  
               
              if(node.left!= null)  
            	  preOrderTraversal(node.left);  
              
              if(node.right!= null)  
            	  preOrderTraversal(node.right);  
  
          }  
      }      
      public void postOrderTraversal(Node node) {  
    	  
          //Check whether tree is empty  
          if(root == null){  
              System.out.println("Tree is empty");  
              return;  
           }  
          else {  
        	   
              if(node.left!= null)  
            	  postOrderTraversal(node.left);  
              
              if(node.right!= null)  
            	  postOrderTraversal(node.right);  
              System.out.print(node.data + "::"+node.frequency+" ");  
              
          }  
      }
  
      public static void main(String[] args) {  
    	  
          BinarySearchTreeFrequencyFinal bt = new BinarySearchTreeFrequencyFinal();  
          Node deletedNode = null; 
          
          
    	  
    	  
    	  Scanner keyboard = new Scanner(System.in);
          int input;
          int item;
          while(true){
              System.out.println("\nSelect your option!");
              System.out.println("\t1 - Insert an elemenet into the BST");
              System.out.println("\t2 - Search an element in a BST");

              System.out.println("\t3 - Find the minimun element from the BST");
              System.out.println("\t4 - Find the maximun element from the BST");
              
              System.out.println("\t5 - Print the element in the BST in preorder");
              System.out.println("\t6 - Print the element in the BST in postorder");
              System.out.println("\t7 - Print the element in the BST in inorder");
              
              System.out.println("\t8 - Delete an Element");
              System.out.println("\t Any other thing to  Exit");

              input = keyboard.nextInt();
              Scanner scanner = new Scanner(System.in);            

              if(input == 1){
              System.out.println("Enter a element to be inserted");            
              item = scanner.nextInt(); 
              bt.insert(item);  
              }else if(input == 2){
            	  System.out.println("Enter an element to be searched: "); 
                  int searchItem = scanner.nextInt();
                  
                  // search here 
                  boolean isPresent = bt.search(searchItem);
                  if(isPresent) {
                	  System.out.println("The element "+searchItem+" is present");
                  }else {
                	  System.out.println("The element "+searchItem+" is not present");
                  }
                  
              }else if(input == 3){ // maximum 
            	  int maxItem = bt.minNode(bt.root).data;
            	  System.out.println("Minimun element in the tree is: "+maxItem); 
                  //String searchItem = scanner.nextLine();
              }else if(input == 4){ // minimun 
            	  
            	  int minItem = bt.maxNode(bt.root).data;//
            	  System.out.println("Maximun element in the tree is: "+minItem); 
            	 }
              else if(input == 5 ||input == 6 ||input == 7){
            	  if(input==5) 
            		  {
            		  System.out.print("Preorder:-  ");
            		  	bt.preOrderTraversal(bt.root); 
            		  }
            	  if(input==6) {
            		  System.out.print("Postorder:-  ");
            		  bt.postOrderTraversal(bt.root); 
            	  }
            	  if(input==7) {
            		  System.out.print("Inorder:-  ");
            		  bt.inorderTraversal(bt.root); 
            	  }
              
              }else if(input == 8){
            	  System.out.println("Enter a string to be deleted: "); 
            	  item = scanner.nextInt(); 
            	  deletedNode = bt.deleteNode(bt.root, item);
            	  System.out.println("\nBinary search tree after deleting node: "+item);  
                  bt.inorderTraversal(bt.root);  
              }else {
                  System.exit(0);//exit program
              }
              System.out.println("\nEnter another option");
              } 
        
      }  
}