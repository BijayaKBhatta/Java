package com.phone;

public class OSFactory {

	public OS getInstance(String type) {// All type of object
		
		if(type.equals("open")) {
			return new Android();
		}else if(type.equals("close")){
			return new Ios();
		}else {
			return new Windows();
		}
	}
	
	/*it has the ability to retun the all kind of object depending on teh argument 
	string -- object 
	open(001) ---> Android 
	close(002)---> IOS
	otherwose()-->Woindown
	*/
	
	
}
