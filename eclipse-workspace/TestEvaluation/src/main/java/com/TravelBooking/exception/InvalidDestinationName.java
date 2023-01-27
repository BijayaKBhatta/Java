package com.TravelBooking.exception;

public class InvalidDestinationName extends RuntimeException {

	String msg;

	public InvalidDestinationName() {
	}
	
	public InvalidDestinationName(String msg) {
		this.msg=msg;
	}

	public String getMsg() {
		return msg;
	}
	

	
}
