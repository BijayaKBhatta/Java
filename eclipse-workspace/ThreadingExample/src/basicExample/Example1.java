package basicExample;

public class Example1 {
	public static void main(String[] args) {
		ThreadClass myThread = new ThreadClass();
		Thread t = new Thread(myThread);
		t.start();
		// TODO Auto-generated method stub
		for(int i=0;i<10000;i++)
			System.out.println("main-"+i+"::"+Thread.currentThread());
			
	}

}


class ThreadClass implements Runnable{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++)
		{
			System.out.println("i-"+i+"--"+Thread.currentThread());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
	}
}
