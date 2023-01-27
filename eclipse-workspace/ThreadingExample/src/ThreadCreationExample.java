public class ThreadCreationExample {

	public static void main(String[] args) {
		myRunnable r = new myRunnable();
		System.out.println("Current Thread name = "+Thread.currentThread().getName());
		Thread.currentThread().setName("new main thread");
		System.out.println("Current Thread name after modification = "+Thread.currentThread().getName());

		Thread t = new Thread(r);
		//t.start();
		t.run();
	}
	
}

