package com.TravelBooking.exception;

import java.time.LocalDateTime;

public class ExceptionResponse {

	LocalDateTime now;
	
	String msg;

	public LocalDateTime getNow() {
		return now;
	}

	public void setLocalDateTime(LocalDateTime now) {
		this.now = now;
	}

	public String getMsg() {
		return msg;
	}

	public void setMessage(String msg) {
		this.msg = msg;
	}
	
	
}
