package com.TravelBooking.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;


@ControllerAdvice
public class CustomExceptionHandling extends ResponseEntityExceptionHandler{

	
	
	 @ExceptionHandler(InvalidDestinationName.class)
	    public ResponseEntity<ExceptionResponse> handleExceptions(InvalidDestinationName exception, WebRequest webRequest) {
	        ExceptionResponse response = new ExceptionResponse();
	        response.setLocalDateTime(LocalDateTime.now());
	        response.setMessage("InvalidDestinationName exception : Destination name can not contain any other characters than lower case or upper case");
	        ResponseEntity<ExceptionResponse> entity = new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
	        return entity;
	    }
	 
	

	    @ExceptionHandler(Exception.class)
	    public ResponseEntity<ExceptionResponse> handleExceptions(Exception exception, WebRequest webRequest) {
	        ExceptionResponse response = new ExceptionResponse();
	        response.setLocalDateTime(LocalDateTime.now());
	        response.setMessage(exception.getMessage());
	        ResponseEntity<ExceptionResponse> entity = new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
	        return entity;
	    }
}
