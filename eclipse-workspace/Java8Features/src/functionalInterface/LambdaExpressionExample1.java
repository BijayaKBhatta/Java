package functionalInterface;

// functional interface 
interface Drawable{  
    public void draw();  
} 
public class LambdaExpressionExample1 {
	public static void main(String[] args) {
		
		int width = 10 ;
		//with out using lamda expression 
		/*
		 * 
		Drawable d=new Drawable(){  
	        public void draw(int a, int b){
	        	System.out.println("Drawing "+width);
	        	}   --> (   )->System.out.println("Drawing "+width); - lamda expression 
	    };  
	    
	    d.draw();
	    */
	
	
	// using lamda expression 
		Drawable d = ()->System.out.println("Width is "+width); // defination 
		d.draw();
		
	}
	  
}
