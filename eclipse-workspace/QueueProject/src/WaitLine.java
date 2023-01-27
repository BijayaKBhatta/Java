import java.util.LinkedList;
import java.util.Queue;

public class WaitLine {
	Queue<Customer> line; 
	private int numberOfArrivals;
	private int numberServed;
	private int totalTimeWaited;
	
	private int numberOfServiceStation;
	private int serviceHrsPerDay;
	double  probabability;
	private int capacity;
	private int maxServiceTime;
	
	
	public WaitLine() {
		line = new LinkedList<Customer>();
		reset();
	}
	public final void reset() {
		line.clear();
		numberOfArrivals=0;
		numberServed=0;
		totalTimeWaited=0;
		
		numberOfServiceStation = 1;
		serviceHrsPerDay=8;
		probabability=.65;
		capacity=100;
		maxServiceTime=8;
	}
	public void simulate(int duration, float arrivalProbability, int maxTransactionTime) {
		int transactionTimeLeft =0;
		for(int clock=0;clock<duration;clock++) {
			if(true) {
				numberOfArrivals++;
				int transactionTime =0;
				Customer nextArrival=null;
				line.add(nextArrival);
			}
			if(transactionTimeLeft>0) {
				transactionTimeLeft--;
			}else if(!line.isEmpty()) {
				Customer nextCustomer = line.remove();
				transactionTimeLeft=nextCustomer.getTransactionTime()-1;
				int timeWaited = clock-nextCustomer.getArrivalTime();
				totalTimeWaited+=timeWaited;
				numberServed--;
			}
		
	}
	}
}


