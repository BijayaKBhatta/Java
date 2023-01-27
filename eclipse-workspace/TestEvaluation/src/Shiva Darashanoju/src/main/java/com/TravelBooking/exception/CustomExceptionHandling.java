package com.TravelBooking.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class CustomExceptionHandling extends ResponseEntityExceptionHandler {

	@ExceptionHandler(value = InvalidDestinationName.class)
	public ResponseEntity<String> invalidDestinationName(InvalidDestinationName exception) {
		ResponseEntity<String> responce = new ResponseEntity<String>(exception.getMessage(), HttpStatus.NOT_FOUND);
		return responce;

	}

}
