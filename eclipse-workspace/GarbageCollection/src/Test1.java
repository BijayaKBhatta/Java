
public class Test1 {

	public static void main(String[] args) throws InterruptedException
	{
		Test1 t1 = new Test1();
		Test1 t2 = new Test1();
		
		// Nullifying the reference variable
		t1 = null;
		System.out.println("start1");
		// requesting JVM for running Garbage Collector
		System.gc();
		System.out.println("start2");
			
		// Nullifying the reference variable
		t2 = null;
		System.out.println("start3");
			
		// requesting JVM for running Garbage Collector
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		Runtime.getRuntime().gc();
		
		System.out.println("start4");
		
	
	}
	
	@Override
	// finalize method is called on object once
	// before garbage collecting it
	protected void finalize() throws Throwable
	{
		System.out.println("Garbage collector called");
		System.out.println("Object garbage collected : " + this);
	}
}

