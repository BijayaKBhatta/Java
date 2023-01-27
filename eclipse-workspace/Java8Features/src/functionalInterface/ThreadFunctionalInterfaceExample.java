package functionalInterface;

public class ThreadFunctionalInterfaceExample {

	public static void main(String[] args) {
		
		// traditional way 
		Runnable r1=new Runnable(){  
            public void run(){  
                System.out.println("Thread1 is running...");  
            }  
        };  
        Thread t1=new Thread(r1);  
        t1.start();  
		
        
        //lamda expression 
        
        Runnable r2 = ()-> System.out.println("Thread is created");
        Thread t2=new Thread(r2);  
        t2.start();  
		
        new Thread(()->System.out.println("tt")).start();
	}
}
