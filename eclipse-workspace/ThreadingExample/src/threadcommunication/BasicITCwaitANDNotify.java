package threadcommunication;

public class BasicITCwaitANDNotify {
	int amount = 100;
	
synchronized void withdraw(int amt) {
	System.out.println("withdraw begin ");
		if(this.amount < amt) {
			try {
				System.out.println("waiting begin since less money in bank ");
				this.wait();
				System.out.println("waiting completed since money deposited ");
				
			} catch (Exception e) {
				// TODO: handle exception
			}
			
		}
		this.amount-=amt;
		System.out.println("withdw completed ");
		
	}
synchronized void deposite(int amt) {
	System.out.println("deposite begin ");
	
	this.amount+=amt;
	System.out.println("depo completed ");
	
	this.notify();
}
public static void main(String[] args) {
	BasicITCwaitANDNotify  b = new BasicITCwaitANDNotify();
	new Thread() {
		@Override
		public void run() {
			// TODO Auto-generated method stub
			b.withdraw(1000);
		}
	}.start();
	
	
	new Thread() {
		@Override
		public void run() {
			// TODO Auto-generated method stub
			b.deposite(1000);
		}
	}.start();
	
}

}
