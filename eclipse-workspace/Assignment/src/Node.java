
public class Node {
	private int info;
	private Node next;
	public Node(int newinfo) {
		this.info = newinfo;
		this.next = null;
	}
	public int getinfo() {
		return this.info;
	}
	public Node getNext() {
		return next;
	}
	public void setInfo(int newInfo) {
		this.info = newInfo;
	}
	public void setNext(Node nextNode) {
		this.next = nextNode;
				
	}

}
