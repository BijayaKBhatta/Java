package threadcommunication;

public class ThreadA {
	public static void main(String[] args) throws InterruptedException {
		ThreadB b = new ThreadB();
		//b.start();
		synchronized (b) {
			System.out.println("main thread is trying to wait");
			b.wait(1000);
			System.out.println("main thread get notification");
			System.out.println(b.total);
		}
		b.start();// - if u write here then the main thread will be in waiting status and threadB will never start
		
	}

}
class ThreadB extends Thread{
	int total =0;
	@Override
	public void run() {
		synchronized (this) {
			System.out.println("child thread start ");
			for(int i=0;i<10;i++) {
				total+=i;
			}
			System.out.println("child thread end ");
		this.notify();
		}
	}
	
	
}
