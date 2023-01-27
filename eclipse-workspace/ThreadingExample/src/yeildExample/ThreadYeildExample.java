package yeildExample;

public class ThreadYeildExample {
	public static void main(String[] args) {
		myThread t = new myThread();
		t.start();
		for(int i=0;i<10;i++) {
			System.out.println("main thread item"+i);
		}
	}

}
class myThread extends Thread{
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("child thread item"+i);
			//1)  if i dont write this below line then we can not guarante any execution order - that means
			//2) eirther main or child method will finish first
			//3) But we call yeild method then main thread will be get chance more number of times and the chance of completing main thread is first is high 
			Thread.yield();
		}
		
	}
}
