package threadcommunication;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

public class ProducerConsumerUsingBlockingQueue {
	public static void main(String[] args) {
		
		BlockingQueue<Integer> sharQueue = new LinkedBlockingDeque<Integer>();
		Thread producer = new Thread(new Produce(sharQueue));
		Thread consumer = new Thread(new Consume(sharQueue));
		producer.start();
		consumer.start();
	}

}

class Produce extends Thread{
	BlockingQueue<Integer> sharQueue;

	public Produce(BlockingQueue<Integer> q) {
		// TODO Auto-generated constructor stub
		sharQueue = q;
	}
	
	@Override
	public void run() {
		for(int i=0;i<1000;i++) {
			System.out.println("Prodcuer adding = "+i);
			try {
				sharQueue.put(i);
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	
}
class Consume extends Thread{
	BlockingQueue<Integer> sharQueue;
	public Consume(BlockingQueue<Integer> q) {
		// TODO Auto-generated constructor stub
		sharQueue = q;
	}
	@Override
	public void run() {
		while(true){
			try {
				System.out.println("Consumer removing = "+sharQueue.take());
						
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
}