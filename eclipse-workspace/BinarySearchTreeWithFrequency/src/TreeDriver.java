import java.util.*;


public class TreeDriver {

    private static TreeNode compare;

    public static void main(String[] args) {

        Tree myTree = new Tree();        

        Scanner keyboard = new Scanner(System.in);
        int input;
        String item;
        while(true){
            System.out.println("\nSelect your option!");
            System.out.println("\t1 - Enter a new String");
            System.out.println("\t2 - Search for a String");
            System.out.println("\t3 - Display Tree");
            System.out.println("\t4 - Exit");

            input = keyboard.nextInt();
            Scanner scanner = new Scanner(System.in);            

            if(input == 1){
            System.out.println("Enter a new string: ");            
            item = scanner.nextLine(); 
            compare = Tree.search(myTree.getRoot(), item);
            if(compare != null){
                //compareNode.upFreq();
           System.out.println(item + " already exists. \nString frequency: " + compare.getFreq());
            }else{
           myTree.insert(item);            
           System.out.println("Inserted " +  "'" + item + "'" + " into tree");
            }
            }else if(input == 2){
            System.out.println("Enter a string to search: "); 
            String searchItem = scanner.nextLine();
           compare = Tree.search(myTree.root, searchItem);
           if(compare != null){                        
                System.out.println("FOUND - " + compare.getFreq() );
           }else{      
                System.out.println("NOT FOUND.");
           }

            }else if(input == 3){
            System.out.println("Display Tree: ");
            myTree.preOrderPrint();

            }else if(input == 4){
                System.exit(0);//exit program
            }
            System.out.println("\nEnter another option");
            }           
       }
    }