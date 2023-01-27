package stack;


class Stack {
	static final int SIZE = 3; //not changing the size, that why its final 
	int top;
	int stack[];

	// Initialize the top of the stack as -1, when you are creating the stack.
	Stack()
	{
		 top = -1; // intial value of top 
		 stack = new int[SIZE]; // Maximum size of Stack - 2
	}
	
	
	// push an elemenmt to the stack
	boolean push(int element)
	{
		if (isFull()) { // if the stack is full then print over overflow and then return 
			System.out.println("Stack Overflow");
			return false; // we were not able to push the element successfully to the stack
		}
		else {
			//a[++top] = x;
			top++; // top = top+1; after the top is increment top is pointing to next empty space 
			stack[top] = element; // stack -> top = 20 
			System.out.println(element + " pushed into stack");
			//System.out.println(element + " pushed into stack");
			return true; // successfully we were able to push the element  to the stack
		}
	}

	int pop()
	{
		// stack is having some element or not 
		if (isEmpty()) { // true - go inside  means no element in the stack. 
			System.out.println("Stack Underflow"); 
			return -1;
		}
		else { // stack is not empty that mean i can delete the top element from stack and decrement the top value 
			//int element = a[top--];
			int element = stack[top];
			top--;
			System.out.println("Popped from stack"+element);

			return element;  
		}
	}

	/// check if the stack is full or not 
	boolean isFull() {
		if (top >= (SIZE - 1)) { // top==SIZE-1
			return true;
		}else 
			return false;
		
	}
	// check if the stack is empty or not  
	boolean isEmpty()
	{
		if(top == -1) { // top <= 0
			return true;
		}else 
			return false;
		// return (top < 0);
	}
	int peek()
	{
		if (isEmpty()) {
			System.out.println("Stack Underflow");
			return -1;
		}
		else {
			int element = stack[top];
			System.out.println( " peek of the stack"+element);
			return element;
		}
	}

	public static void main(String args[])
	{
		Stack s = new Stack(); // stack of size 2 
		s.push(10); // 10 
		s.push(20); //  10 >> 20 
		s.peek();  //  20  stack  - 10 >> 20(top) 
		s.push(30); // overflow 
		s.push(40); // overflow 
		s.pop(); // 20 
		s.pop(); //10
		s.pop(); // underflow 
		
	}
}
