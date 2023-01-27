package arrayexample;

public class funcRef {
	private int n;
    public funcRef (int m) {n = m;}
    public static void func (funcRef t) {
    	t.n++;
    	}
    public static void main(String[] args) {
    	funcRef t1, t2;
        t1 = new funcRef(20);
        t2 = t1;
        System.out.println(t2.n);
        func(t1);
        System.out.println(t2.n);
        func(t1);
        System.out.println(t1.n);
        func(t2);
        System.out.println(t1.n);
        func(t2);
    
System.out.print(t1.n);
        return;
	}
}

