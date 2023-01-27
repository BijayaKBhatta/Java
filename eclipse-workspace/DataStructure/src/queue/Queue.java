package queue;



public class Queue {
int arr[], front, rear, size, numberOfElement;  		
	
    // Queue constructor
	Queue(int n)
	{
		arr = new int[n]; // 5
		size = n; // 5
		front = -1;
		rear = -1;
		n = 0;
		numberOfElement = 0;
	}

	// insert an elememnt to the queue 
	
	public void enqueue(int element)  
	{  
		numberOfElement++; // 5 
		
		//1. if the queue is full or not  - if rear ==size - full 
		// size = 5
	    if(rear == size-1)  
	    {  
	        System.out.println("\nOVERFLOW\n");  
	        return;   // dont do anything becuase size if full hence  return 
	    }  
	    
	  // f =, r =   [][][][][]
	    
	    if(front == -1 && rear == -1)   // if the queue is empty 
	    {  
	        front = 0;  
	        rear = 0;  
	    }  
	    else    // queue not empty , queue is not empty then increase the rear by one // since we are inserting an element so
	    	//we are changing only the rear not any changes in front
	    {  
	        rear = rear+1;  
	    }  
	    
	  // arr- [][][30][] [] - insert 40 ? 
	  //           fr
	  //           r f
	   // rear - 1 
	   // 1) incrementing rear
	//	2) store the value in rear
	    
	    arr[rear] = element; // element = 30 
	    System.out.println(" inserted "+element);  
	      
	} 
	
	// delete an element from the queue 
	public void dequeue()  
	{  
		numberOfElement--;
	    int item; 
	    // Queue is Empty 
	    //return;  
	    if (front == -1 || front > rear)  
	    {  
	        System.out.println("\nUNDERFLOW\n");  
	        return;  // if the queues is empty then its an underflow so we should not do any other work and return from here.
	    }  
	    else  // some element are preswent in the Q.
	    {  
	        item = arr[front];  
	        if(front == rear)  
	        {  
	            front = -1;  
	            rear = -1 ;  
	        }  
	        else   
	        {  
	            front = front + 1;  
	        }  
	        System.out.println("\nvalue deleted "+item);  
	    }  
	      
	}  

	// peek function to return front element of the queue
	public int peek()
	{
		if (isEmpty()) 
		{
			System.out.println("Queue empty!!Cannot delete");
			System.exit(1);
		}
		return arr[front];
	}

	// returns the size of the queue
	public int size()
	{
		return numberOfElement;
	}

	// to check if the queue is empty or not
	public Boolean isEmpty()
	{
		return (size() == 0);
	}

	// to check if the queue is full or not
	public Boolean isFull()
	{
		return (size() == arr.length-1);
	}
	
	// Queue implementation in java
	public static void main (String[] args)
	{
		// create a queue of capacity 5
		Queue q = new Queue(5); //

		q.enqueue(10);
		q.dequeue();
		q.dequeue();
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		q.dequeue();
		q.dequeue();
		q.dequeue();
		q.dequeue();
		q.dequeue();
		
		/*
		System.out.println("Front element is: " + q.peek());
		q.dequeue();
		System.out.println("Front element is: " + q.peek());

		System.out.println("Queue size is " + q.size());

		q.dequeue();
		q.dequeue();
		
		if (q.isEmpty())
			System.out.println("Queue Is Empty");
		else
			System.out.println("Queue Is Not Empty");
			*/
	}
}

