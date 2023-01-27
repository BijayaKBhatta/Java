package com.TravelBooking.exception;

public class InvalidDestinationName extends RuntimeException {

	
	public InvalidDestinationName(){
		super("Please enter the Correct destination");
	}

	public InvalidDestinationName(String message){
		super(message);
	}

	public InvalidDestinationName(String message,Exception e){
		super(message ,e);
	}

	public InvalidDestinationName(String message, Throwable t){
		super(message,t);
	}

}
