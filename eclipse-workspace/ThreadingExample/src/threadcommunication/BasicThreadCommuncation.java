package threadcommunication;
// look into the BasicITCwaitANDNotify - with out creating a separate class
public class BasicThreadCommuncation {
	public static void main(String[] args) {
		Customer c = new Customer();
		new Thread(){  
			public void run(){c.withdraw(15000);}  
			}.start();  
			new Thread(){  
			public void run(){c.deposite(10000);}  
			}.start()	;	
	}

}

class Customer {
	int amount = 1000;
	synchronized void withdraw(int amount) {
		System.out.println("Starting withdraw");
		if(this.amount<amount) {
			try {
				System.out.println("in sufficient balance  ");
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.amount-=amount;
		System.out.println("withdraw completed ");
	}
	synchronized public void deposite(int amount) {
		this.amount+=amount;
		System.out.println("deposit completed ");
		notifyAll();
	}
	
	
}