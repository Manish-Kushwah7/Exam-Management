package com.webMVC.Exception_handling;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class Exception_handling {

 Logger logger =	LoggerFactory.getLogger(Exception_handling.class);
	
 @ExceptionHandler(value = Exception.class)
public String handleAe(Exception e) {	
	
	 String msg= e.getMessage();
	 logger.error(msg);
	 return "error";
}
 
 
}
