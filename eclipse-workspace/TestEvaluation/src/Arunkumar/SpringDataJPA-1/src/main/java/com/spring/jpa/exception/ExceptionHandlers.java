package com.spring.jpa.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class ExceptionHandlers extends ResponseEntityExceptionHandler{

		@ExceptionHandler(InvalidDestinationName.class)
		@ResponseStatus(value = HttpStatus.NOT_FOUND)
		@ResponseBody
		public String handleResourceNotFound() {


			return "InvalidDestinationName";
		}
	}




