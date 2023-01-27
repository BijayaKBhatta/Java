package linkedlist;

//A simple Java program to introduce a linked list
class LinkedList {
	Node start; // head of list or start of the list 

	/* Linked list Node. This inner class is made static so that
	main() can access it */
	static class Node {
		int data;
		Node next;
		Node(int d)
		{
			data = d; //10
			next = null;
		} // Constructor
	}

	/* method to create a simple linked list with 3 nodes*/
	public static void main(String[] args)
	{
		/* Start with the empty list. */
		LinkedList llist = new LinkedList();

		llist.start = new Node(10);   //start --> [10| null ]
		
		
		Node second = new Node(20);// this line second --> [20| null ]
		
		
		
		Node third = new Node(30);   // third ->[30 | null]

		/* Three nodes have been allocated dynamically.
		We have references to these three blocks as head,
		second and third


		llist.start	 second			 third
			|			 |				 |
			|			 |				 |
		+----+------+	 +----+------+	 +----+------+
		| 10 | 1000 |	 | 20 | 2000 |	 | 30 | null |
		+----+------+	 +----+------+	 +----+------+ */
                          
		llist.start.next = second; // Link first node with the second node

		/* Now next of the first Node refers to the second. So they
			both are linked.

		llist.head	 second			 third
			|			 |				 |
			|			 |				 |
		+----+------+	 +----+------+	 +----+------+
		| 10 | o-------->| 20 | null |	 | 30 | null |
		+----+------+	 +----+------+	 +----+------+ */

		second.next = third; // Link second node with the third node

		/* Now next of the second Node refers to third. So all three
			nodes are linked.

		llist.head	 second			 third
			|			 |				 |
			|			 |				 |
		+----+------+	 +----+------+	 +----+------+
		| 1 | o-------->| 2 | o-------->| 3 | null |        -->      [4  ]
		+----+------+	 +----+------+	 +----+------+ */
		                               //   start 
		
		llist.traverse();
		
	}
	public void traverse() {
		
		Node temp = start;
		while(temp!=null) {
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
	// operations 
	// insertion 
	// deletion 
	
	// insertion 
	//Q) insert into the end of the linked list 
	
	//
	// code to insert a Node at the end of the linked list
	public void insertAtLast() {
		//1. Traverse till end 
		Node temp = start;
		while(temp.next!=null) {
			temp=temp.next;
		}
		Node lastNode = new Node(40);
		temp.next = lastNode;
		
	}
	
	
	
	
	
}


