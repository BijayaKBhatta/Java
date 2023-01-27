import java.util.Comparator;
import java.util.Optional;

public class Test {

	public static void main(String[] args) {
	
		//5->4->3->2->1
		//output->  1->2->3->4->5
		// list 
		// reverse the list 
		// 11.10 -started 
		ListClass l = new ListClass(5);
		ListClass rootNode = l;
		l.next = new ListClass(4);
		l=l.next;
		l.next = new ListClass(3);
		l=l.next;
		l.next = new ListClass(2);
		l=l.next;
		l.next = new ListClass(1);
		l=l.next;
		l.next = new ListClass(0);
		l=l.next;
	//	Optional emp =  employeeList.stream()
	//		    .sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).skip(1).findFirst();
		
	// reverse it 
		// Algo 
		
		//5->4->3->2->1
		/*System.out.println("before rev");
		  while(rootNode!=null) {
			  System.out.println(rootNode.data);
			  rootNode=rootNode.next;
		  }*/
		  
		ListClass prevNode = null;
		ListClass currentNode = rootNode;
		ListClass  nextNode = rootNode.next;  
		  while(currentNode.next!=null) {
			  currentNode.next=prevNode;
			  prevNode = currentNode;
			  currentNode = nextNode;
			  nextNode=nextNode.next;
		  }
		  
		  currentNode.next = prevNode;
		  rootNode = currentNode;
		  System.out.println("after rev");
		  while(rootNode!=null) {
			  System.out.println(rootNode.data);
			  rootNode=rootNode.next;
		  }
		
		
		
	}
}






