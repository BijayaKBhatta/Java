package linkedlist;

public class middleNodeOfLinkedList {

	public static void main(String[] args) {
		List head = new List(5);
		head.next = new List(10);
		List temp = head.next;
		temp.next =  new List(20);
		temp=temp.next;
		temp.next=new List(30);
		System.out.print("Element are");
		
		traverseList(head);
	//	System.out.println("-----"+head.data);
		
		List l = getMiddle(head);
		System.out.println(" \nmid element is-"+l.data);
		head = reverseList(head);
		System.out.println("Reversed List is:");
		traverseList(head);
	}

	private static List reverseList(List head) {
		// TODO Auto-generated method stub
		// 5<-10<-20 30 
		List pre=null;
		List current = head;
		List next = head.next;
		while(next!=null) {
			current.next = pre;
			pre = current;
			current = next;
			next = next.next;
		}
		current.next = pre;
		head = current;
		return head;
		
	}

	private static void traverseList(List head) {
		// TODO Auto-generated method stub
		while(head!=null) {
			System.out.print("\t"+head.data);
			head=head.next;
		}
		
	}

	private static List getMiddle(List head) {
		// TODO Auto-generated method stub
		 List slowP=head;
	        List fastP=head;
	        while(fastP!=null && fastP.next!=null){
	            slowP=slowP.next;
	            fastP=fastP.next.next;
	        }
	        return slowP;
	}
}

class List{
	int data;
	List next;
	List(){
		data=-1;
		next=null;
	}
	List(int data){
		this.data=data;
		next=null;
	}
	List(int data, List next){
		this.data=data;
		this.next=next;
		
	}
	
}