package bijayabarbarber;

import java.util.Date;
import java.util.LinkedList;
import java.util.Queue;



public class SleepingBarber {
	public static void main(String[] args) {
		
	}
}
class CustomerGenerator implements Runnable{
	BarberShop shop;
	CustomerGenerator(BarberShop shop){
		this.shop=shop;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true)
        {
            Customer customer = new Customer(shop);
            customer.setInTime(new Date());
            Thread thcustomer = new Thread(customer);
            customer.setName("Customer Thread "+thcustomer.getId());
            thcustomer.start();
 
            try
            {
                //TimeUnit.SECONDS.sleep((long)(Math.random()*10));
            	Thread.sleep(1000);
            }
            catch(InterruptedException iex)
            {
                iex.printStackTrace();
            }
        }
	}
}
class Barber implements Runnable{

	BarberShop shop = new BarberShop();
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		 try
	        {
	            Thread.sleep(10000);
	        }
	        catch(InterruptedException iex)
	        {
	            iex.printStackTrace();
	        }
		while(true) {
			// cut hair
			shop.cutHair();
			
		}
		
	}
	
}

class BarberShop {
	int noOfChair;
	Queue<Customer> list = new LinkedList<>();
	BarberShop(int noOfChair,Queue<Customer> list){
		this.noOfChair = 3;
		this.list = list;
	}
	BarberShop(){}
	
	public void cutHair() {
		Customer c;
		synchronized (list) {
			while(list.size()==0) {
				try {
					list.wait();
				}catch ( InterruptedException e) {
					// TODO: handle exception
				}
			}
		}
		c = list.poll();
		try {
			//hair cut 
			Thread.sleep(1000);
		}catch ( InterruptedException e) {
			// TODO: handle exception
		}
	}
	public void add(Customer customer) {
		// TODO Auto-generated method stub
		synchronized (list) {
			if(list.size()==3) {
				return;
			}
				list.add(customer);
			if(list.size()==1) list.notify();
		}
		
	}
	
	
	
}

class Customer implements Runnable{
	String name;
	Date inTime;
	BarberShop shop = new BarberShop();
	public Customer(BarberShop shop)
    {
        this.shop = shop;
    }
	Customer(String name, Date date){
		this.name=name;
		this.inTime=inTime;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		letscutHair();
		
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getInTime() {
		return inTime;
	}
	public void setInTime(Date inTime) {
		this.inTime = inTime;
	}
	public BarberShop getShop() {
		return shop;
	}
	public void setShop(BarberShop shop) {
		this.shop = shop;
	}
	synchronized public void letscutHair() {
		// TODO Auto-generated method stub
		shop.add(this);
	}
}


