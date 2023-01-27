
public class intRef {

	int val;
	 public intRef (int n) {
	val = n;
	 }
	 public static void main(String[] args) {
		 intRef r1, r2;
		         r1 = new intRef(10);
		 r2 = r1;
r1.val++;
r2.val++;
System.out.println(r1.val + "--" + r2.val);
r2 = new intRef(20);
r1.val++;
r2.val++;
System.out.println(r1.val + "--" + r2.val);
	}
}

