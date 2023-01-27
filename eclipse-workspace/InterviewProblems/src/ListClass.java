
public class ListClass {

	public static void main(String[] args) {
		
		String name = "Ali" , msg = "cool";
		double score=89.95;
		int id = 1002;
		System.out.println(name+"("+id+")"+"you got"+score+"COOL!");
	}
	int data;
	ListClass next;

	public ListClass() {
		// TODO Auto-generated constructor stub
		next = null;
	}
	
	public ListClass(int data ) {
		// TODO Auto-generated constructor stub
		this.data = data;
		next = null;
	}
	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}
	
	
}
