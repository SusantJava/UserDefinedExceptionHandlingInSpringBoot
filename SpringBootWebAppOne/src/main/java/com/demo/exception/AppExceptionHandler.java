package com.demo.exception;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@Controller
@ControllerAdvice
public class AppExceptionHandler {
	
	@ExceptionHandler(value=NoBookFoundException.class)
	public String handleNoBookFoundException() {
		
		return "Error";
		
		
	}

}
