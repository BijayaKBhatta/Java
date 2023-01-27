package functionalInterface;

interface Addable{  
    int add(int a,int b);  
}  
public class LambdaMultipleParameter {
	public static void main(String[] args) {
		
		
		// lamda 1
		Addable  addition = (int firstNo, int secondNo)-> { 
		System.out.println("Adding ");
		return (firstNo+secondNo);
		};
		
		// lamda 2
		Addable  add = (int firstNo, int secondNo)->  (firstNo+secondNo);

		System.out.println(addition.add(10, 20));
		System.out.println(add.add(20, 20));
		
		
		
		
		
	}

}
