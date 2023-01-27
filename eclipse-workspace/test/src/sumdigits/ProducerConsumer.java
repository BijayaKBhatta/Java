package sumdigits;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

public class ProducerConsumer extends Thread {
	static Queue<Integer> q = new LinkedList();
	public static void main(String[] args) {
		//Queue<Integer> q = new LinkedList();
		ProducerClass p = new ProducerClass();
		ConsumerClass c = new ConsumerClass();
		Thread t1 = new Thread(p);
		Thread t2 = new Thread(c);
		t2.start();
		t1.start();
		
	}
}

	class ProducerClass implements Runnable {
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			synchronized (ProducerConsumer.q) {
				while (true) {
					ProducerConsumer.q.add(10);
					System.out.println("Producing the element" + 10);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					ProducerConsumer.q.notify();
				}

			}

		}
	}

	class ConsumerClass implements Runnable {
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			synchronized (ProducerConsumer.q) {
				while (ProducerConsumer.q.isEmpty()) {
					System.out.println("Queue is empty");
					try {
						ProducerConsumer.q.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.println("Consuming the element" + ProducerConsumer.q.remove());
			}
		}

	}

